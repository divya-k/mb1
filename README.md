# UI Test Framework
=============

The Tech Stack used is as below
1. Java
2. Selenium WebDriver
3. Cucumber for BDD
4. JUnit

We use Page Object Model which is a design pattern which has become popular in test automation for enhancing test maintenance and
reducing code duplication.
A page object is an object-oriented class that serves as an interface to a page.
The tests then use the methods of this page object class whenever they need to interact with the UI of that page,
the benefit is that if the UI changes for the page, the tests themselves don’t need to be changed,
only the code within the page object needs to change.
Subsequently all changes to support that new UI are located in one place.


Pre-requisites to be set up on the machine
================================================
1. Java
2. Maven
3. Chrome Browser (version 80.0.3987.87)
4. Firefox Browser (version 74.0)
5. IDE like IntelliJ/Eclipse


How to execute the Test
====================================================
1. Ensure Java and Maven have been installed on the system
2. The driver files in this repository are compatible for MAC/Windows on  Chrome Browser (version 80.0.3987.87) and
    Firefox Browser (version 74.0). For users using different OS or different versions of Chrome Browser or Firefox Browser
    
    If you have a different version of browser download the appropriate driver files and place in the drivers folder and set the appropriate driverPath in Hooks (/src/test/java/StepDefinitions/Hooks.java)
4. Go into the repo folder and execute the command  'mvn clean install'
5. Execute the Maven tests using the command 'mvn test'
6. The browser instance should come up and execute the tests. Default execution happens on Mac, Chrome browser
7. We can also execute on Firefox Browser using command  
    mvn test  -DBrowser="firefox"
8. We can execute the test in Headless mode using command

   mvn test  -DBrowser="headless"
9. Report will be available in the target folder/ cucumber-reports /index.html
10. We can also use editor IDE like Eclipse/IntelliJ where we can import the project as a Maven project and run tests


Execute test scenarios on the command line
======================================================
1. On Different browsers 
    a. Chrome browser
        mvn test  -DBrowser="chrome"
    b. On Firefox browser
        mvn test  -DBrowser="firefox"
    c. Headless mode
        mvn test  -DBrowser="headless"
             
 2. On Windows machine by default its configures to run of Mac machine   
    a.  mvn test  -Dos="microsoft"
    b.  mvn test  -Dos="mac"

3. We can execute a subset of tests using tags
   a. To run createbooking tests(Scenarios with tag @createbooking)
         mvn test  -Dcucumber.options="--tags @createbooking"
   b. To run deletebooking tests(Scenarios with tag @deletebooking)
        mvn test  -Dcucumber.options="--tags @deletebooking"        
   c. To run All tests(Scenarios with tag @regression)
        mvn test  -Dcucumber.options="--tags @regression"

4. We can execute All test on mac machine (By default)
    a. mvn test (default mvn test -Dos="mac" -DBrowser="chrome" -Dcucumber.options="--tags @regression")
    b. mvn test -DBrowser="firefox"(means mvn test -Dos="mac" -DBrowser="firefox" -Dcucumber.options="--tags @regression")                

5. We can execute All test on windows machine 
    a. mvn test -Dos="windows"( mvn test -Dos="windows" -DBrowser="chrome" -Dcucumber.options="--tags @regression")
    b. mvn test -Dos="windows" -DBrowser="firefox"(means mvn test -Dos="windows" -DBrowser="firefox" -Dcucumber.options="--tags @regression")

