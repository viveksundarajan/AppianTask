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
  
  
**  Login functionality Test cases to be automate:**
  
  Valid username and password and verify login success 
  invalid username and invalid password and verify login fails 
  User should be able to login after forgot/reset password 
  Verify password field is showing the star (*) value 
  After enter the valid credentials click ENTER key and verify login success 
  After login click Back button and verify the application is logged out 
  Verify expired credentials should not allow to login 
  Check login on different browsers 
  Logged in one browser with user 1 and open a new tab and login with user 2 --> Login should not allow 

