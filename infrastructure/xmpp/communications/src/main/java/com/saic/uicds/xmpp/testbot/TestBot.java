/**
 * 
 */
package com.saic.uicds.xmpp.testbot;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.saic.uicds.xmpp.apps.TestBotTest;

/**
 * @author roger
 *
 */
public class TestBot {

	private TestBotConnection connection;

	public TestBotConnection getConnection() {
		return connection;
	}

	public void setConnection(TestBotConnection connection) {
		this.connection = connection;
	}
	
	public static void main(String[] args) {
        try {
        	configureLog4j();
        	
            ApplicationContext context = new ClassPathXmlApplicationContext(
                    new String[] { "contexts/testbot-applicationContext.xml" });

            TestBotConnection connection = (TestBotConnection) context
                    .getBean("testBotConnection");
                        
        	addLog4jXmppAppender(connection);

        	if (connection.isConnected()) {
              TestBotTest testBotTest = (TestBotTest)context.getBean("testBotTest");
              testBotTest.run();
              connection.disconnect();
              System.out.println("EXITING");
            }

        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("==========> Error: Unable to initialize");
        }
		
	}

	private static void configureLog4j() {
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.ALL);
		Appender myAppender = new ConsoleAppender(new SimpleLayout());  
		rootLogger.addAppender(myAppender); 	
	}

	private static void addLog4jXmppAppender(TestBotConnection connection) {
		TestBotAppender appender = new TestBotAppender();
		appender.setConnection(connection);
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.addAppender(appender);
//		Appender ap = rootLogger.getAppender("XMPPpubsubAppender");
//		if (ap != null) {
//			System.out.println("FOUND: " + ap.getName());
//		}
	}
}
