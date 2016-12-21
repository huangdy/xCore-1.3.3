 
java -jar .\target\ClientRunner-jar-with-dependencies.jar  -u https://uicds-test2.saic.com/uicds/ws -f C:\uicds\core\testing\data\inc2Demo\sendword\profiles\SendWord.xml
 
java -jar .\target\SendWord-jar-with-dependencies.jar -listen C:\uicds\core\testing\data\inc2Demo\sendword\notreqs\sendNotificationRequest_respiratory.xml C:\uicds\core\testing\data\inc2Demo\sendword\notreqs\sendNotificationRequest_evacuation.xml
 
java -jar .\target\ClientRunner-jar-with-dependencies.jar -u https://uicds-test2.saic.com/uicds/ws -f C:\uicds\core\testing\data\inc2Demo\sendword\alerts\CreateRespiratoryAlert.xml
java -jar .\target\ClientRunner-jar-with-dependencies.jar -u https://uicds-test2.saic.com/uicds/ws -f C:\uicds\core\testing\data\inc2Demo\sendword\alerts\CreateEvacuationAlert.xml

