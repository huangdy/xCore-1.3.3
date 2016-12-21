package com.saic.uicds.core.infrastructure.endpoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Level;
import org.junit.Test;
import org.springframework.test.jpa.AbstractJpaTests;

import com.saic.uicds.core.infrastructure.rule.RuleEngine;
import com.saic.uicds.core.infrastructure.service.impl.LoggingServiceImpl;
import com.saic.uicds.core.infrastructure.status.ComponentLogMonitor;
import com.saic.uicds.core.infrastructure.status.Status;

public class LoggingServiceEndpointLogTest extends AbstractJpaTests {

    private final String EXIST_PATTERN = "TIMESTAMP [THREAD] LEVEL (FILE [METHOD]:LINE) - MESSAGE";
    private final String OPENDS_PATTERN = "[PROP(RELATIVETIME)] * *=LEVEL MESSAGE";
    private final String OPENFIRE_PATTERN = "PROP(RELATIVETIME) [CLASS(FILE:LINE)";
    private final String TOMCAT_PATTERN = "TIMESTAMP CLASS METHOD LEVEL: MESSAGE";
    private final String UICDS_PATTERN = "[LEVEL PROP(RELATIVETIME) CLASS] MESSAGE";

    private Map<String, ComponentLogMonitor> loggers = new HashMap<String, ComponentLogMonitor>();

    private RuleEngine ruleEngine;

    Map<String, Status> componentStatusMap = new HashMap<String, Status>();

    Map<String, String> logPatternsMap = new HashMap<String, String>();

    public void createLoggingServiceProperties() {
        List<File> logFiles;
        Status initialComponentStatus = new Status("NORMAL", "NORMAL");
        logPatternsMap.put("exist", EXIST_PATTERN);
        logPatternsMap.put("opends", OPENDS_PATTERN);
        logPatternsMap.put("openfire", OPENFIRE_PATTERN);
        logPatternsMap.put("tomcat", TOMCAT_PATTERN);
        logPatternsMap.put("uicds", UICDS_PATTERN);

        // EXIST ComponentLogMonitor
        logFiles = new ArrayList<File>();
        logFiles.add(new File("src/test/resources/loggingService/exist/exist.log"));
        addComponentLogMonitor("exist", EXIST_PATTERN, false, Level.ERROR, logFiles,
                initialComponentStatus, 5000);

        // OPENDS ComponentLogMonitor
        logFiles = new ArrayList<File>();
        logFiles.add(new File("src/test/resources/loggingService/opends/errors.log"));
        addComponentLogMonitor("opends", OPENDS_PATTERN, false, Level.ERROR, logFiles,
                initialComponentStatus, 5000);

        // OPENFIRE ComponentLogMonitor
        logFiles = new ArrayList<File>();
        logFiles.add(new File("src/test/resources/loggingService/openfire/error.log"));
        logFiles.add(new File("src/test/resources/loggingService/openfire/warn.log"));
        logFiles.add(new File("src/test/resources/loggingService/openfire/info.log"));
        logFiles.add(new File("src/test/resources/loggingService/openfire/debug.log"));
        addComponentLogMonitor("openfire", OPENFIRE_PATTERN, false, Level.ERROR, logFiles,
                initialComponentStatus, 5000);

        // TOMCAT ComponentLogMonitor
        logFiles = new ArrayList<File>();
        logFiles.add(new File("src/test/resources/loggingService/tomcat/catalina.2011-02-09.log"));
        addComponentLogMonitor("tomcat", TOMCAT_PATTERN, false, Level.ERROR, logFiles,
                initialComponentStatus, 5000);

        // UICDS ComponentLogMonitor
        logFiles = new ArrayList<File>();
        logFiles.add(new File("src/test/resources/loggingService/uicds/uicds.log"));
        addComponentLogMonitor("uicds", UICDS_PATTERN, false, Level.ERROR, logFiles,
                initialComponentStatus, 5000);

        // RULES Engine
        File rulesFile = new File("src/test/resources/loggingService/rules.xml");
        ruleEngine = new RuleEngine();
        ruleEngine.initializeRules(rulesFile);

    }

    private void addComponentLogMonitor(String logName, String logPattern, boolean doTailing,
            Level thresholdLevel, List<File> logFiles, Status initialStatus, int pollingDelay) {
        ComponentLogMonitor monitor = new ComponentLogMonitor();
        monitor.setLogFiles(logFiles);
        monitor.setLogName(logName);
        monitor.setLogPattern(logPatternsMap.get(logName));
        monitor.setDoTailing(doTailing);
        monitor.setThresholdLevel(thresholdLevel);
        monitor.setPollingDelay(pollingDelay);
        try {
            monitor.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        loggers.put(logName, monitor);
        componentStatusMap.put(logName, new Status("NORMAL", "NORMAL"));
    }

    @Test
    public void testLoggingService() throws Exception {
        createLoggingServiceProperties();
        LoggingServiceImpl loggingService = new LoggingServiceImpl();
        loggingService.setLogToFile(true);
        loggingService.setComponentStatusMap(componentStatusMap);
        loggingService.setLoggers(loggers);
        loggingService.setRuleEngine(ruleEngine);
        loggingService.afterPropertiesSet();

        setTimerForAsserting();
        Thread.sleep(25000);

        Map<String, ComponentLogMonitor> loggers = loggingService.getLoggers();
        for (ComponentLogMonitor monitor : loggers.values()) {
            monitor.shutdown();
        }
    }

    private void setTimerForAsserting() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                assertStatusEventsLogged("exist");
                assertStatusEventsLogged("opends");
                assertStatusEventsLogged("openfire");
                assertStatusEventsLogged("tomcat");
                assertStatusEventsLogged("uicds");
                cancel();
            }

            private void assertStatusEventsLogged(String componentId) {
                File file = new File("src/test/resources/loggingService/outputLogs/" + componentId
                        + "_output.log");
                if(file.exists()){
                    FileInputStream fstream;
                    boolean contiansStatus = false;
                    try {
                        fstream = new FileInputStream(file.getAbsolutePath());
                        BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            if (line.contains("Status")) {
                                contiansStatus = true;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    assertTrue(contiansStatus);
                }
            }
        };
        timer.schedule(task, 20000);
    }

}
