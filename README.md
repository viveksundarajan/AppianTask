# AppianTask

#Technologies used:

  Selenium 
  Maven 
  TestNG
  Java 8

**Browsers : **

Chrome (Default) or firefox 
#Chromedriver and Geckodriver are available under the project path

To change the browser, update the browser name in testng.xml file

#To run the test,

Open terminal and hit the below command

  mvn clean test
  
#Reports

After the test run, testNG report will be available under below folder,

target -> surefire-reports -> index.html

get the absolute path of index.html and enter the url in any desired browser to view the report

#Coverage can be viewed in below path,

  target -> coverage-reports -> index.html
