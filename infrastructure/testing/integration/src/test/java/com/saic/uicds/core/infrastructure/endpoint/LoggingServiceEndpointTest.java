package com.saic.uicds.core.infrastructure.endpoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.Calendar;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.loggingService.GetLogByHostnameRequestDocument;
import org.uicds.loggingService.GetLogByHostnameResponseDocument;
import org.uicds.loggingService.GetLogByLoggerRequestDocument;
import org.uicds.loggingService.GetLogByLoggerResponseDocument;
import org.uicds.loggingService.LogLevelType;
import org.uicds.loggingService.LogRequestDocument;
import org.uicds.loggingService.LogResponseDocument;
import org.uicds.loggingService.LogResponseType;
import org.uicds.loggingService.LogType;

import com.saic.uicds.core.infrastructure.endpoint.LoggingServiceEndpoint;
import com.saic.uicds.core.infrastructure.status.ComponentLogMonitor;

public class LoggingServiceEndpointTest extends AbstractJpaTests {

    @Autowired
    LoggingServiceEndpoint loggingServiceEndpoint;

    @Test
    public void testLogMessage() throws Exception {

        String hostName = InetAddress.getLocalHost().getHostName();
        String loggerName = "Log4j";
        LogRequestDocument logRequestDocument = LogRequestDocument.Factory.newInstance();
        LogType log = logRequestDocument.addNewLogRequest();
        log.setLogger(loggerName);
        log.setMessage("Testing log message");
        log.setHostname(hostName);
        log.setTimestamp(Calendar.getInstance());
        log.setType(LogLevelType.INFO);
        LogResponseDocument response = loggingServiceEndpoint.log(logRequestDocument);
        assertEquals(response.getLogResponse().getResponse(), LogResponseType.SUCCESS);

        GetLogByHostnameRequestDocument getLogByHostDocument = GetLogByHostnameRequestDocument.Factory
                .newInstance();
        getLogByHostDocument.addNewGetLogByHostnameRequest().setHostname(hostName);
        GetLogByHostnameResponseDocument getLogByHostnameResponseDocument = loggingServiceEndpoint
                .getLogByHostname(getLogByHostDocument);
        assertEquals(getLogByHostnameResponseDocument.getGetLogByHostnameResponse().getHostname(),
                hostName);

        GetLogByLoggerRequestDocument getLogByLoggerRequestDocument = GetLogByLoggerRequestDocument.Factory
                .newInstance();
        getLogByLoggerRequestDocument.addNewGetLogByLoggerRequest().setLogger(loggerName);
        GetLogByLoggerResponseDocument getLogByLoggerResponseDocument = loggingServiceEndpoint
                .getLogByLogger(getLogByLoggerRequestDocument);
        assertEquals(getLogByLoggerResponseDocument.getGetLogByLoggerResponse().getLogger(),
                loggerName);

    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] { "classpath:contexts/applicationContext-infra.xml",
                "classpath:contexts/test-dataSrcContext.xml",
                "classpath:contexts/test-spring-ws-infra-servlet.xml" };
    }

    @Test
    public void testLogStatusEvent() throws Exception {
        setTimerForAsserting();
        Thread.sleep(25000);
        Map<String, ComponentLogMonitor> loggers = loggingServiceEndpoint.getLoggers();
        for(ComponentLogMonitor monitor:loggers.values()){
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
