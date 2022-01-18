**TESTNG**

TestNG is an open-source test automation framework for Java. It provides control over the test cases and the execution of the test cases

We can invoke TestNG in 3 simple steps 
1. Write the business logic of your test and insert TestNG annotations in your code.
2. Add the information about your test (e.g. the class name, the groups you wish to run, priority, dependency etc..) in a testng.xml file or in build.xml.
3. Run TestNG.

**TestNG Annotations**
TestNG annotations are the code that is written inside your source test code logic to control the flow of the execution of tests. It is essential to annotate your methods in TestNG to run the tests. TestNG will ignore the method which does not contain an annotation since it won't know when to execute this method.

**@BeforeSuite**: The annotated method will be run before all tests in this suite have run.
It can be used for Setting Global variable urls for different environments etc

**@AfterSuite:** The annotated method will be run after all tests in this suite have run.

**@BeforeTest:** The annotated method will be run before any test method belonging to the classes inside the <test> tag is run. It can be used to mention prerequisite for the test case
  
**@AfterTest:** The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run. It can be used for deleting cookies reading tape or reports or stopping the processing processes like closing the connections
  
**@BeforeGroups:** The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
  
**@AfterGroups:** The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
  
**@BeforeClass:** The annotated method will be run before the first test method in the current class is invoked.
  
**@AfterClass:** The annotated method will be run after all the test methods in the current class have been run. 
  
**@BeforeMethod:** The annotated method will be run before each test method.
  
**@AfterMethod:** The annotated method will be run after each test method.
  
**alwaysRun:** If set to true, this test method will always be run even if it depends on a method that failed.

**dataProvider:** The name of the data provider for this test method.

**dependsOnGroups:** The class where to look for the data provider. If not specified, the data provider will be looked on the class of the current test method or one of its base classes. If this attribute is specified, the data provider method needs to be static on the specified class

**dependsOnMethods:** The list of methods this method depends on.
  
**description:** The description for this method.

**enabled:** Whether methods on this class/method are enable
groups The list of groups this class/method belongs to.

**priority:** The priority for this test method. Lower priorities will be scheduled first.

**TestNG.xml**
  
testng.xml file is a configuration file that helps in organizing the tests w.r.t. priority, test groups, parametrization, dependency etc. Here, we can control the execution of a test by putting them under one xml file. A suite is represented by one xml file. 
  

<img width="1000" alt="Screenshot 2022-01-17 at 3 53 29 PM" src="https://user-images.githubusercontent.com/33338649/149898375-e4577ac7-1001-479a-b1c7-055f7c3b5b0b.png">
  
<img width="1000" alt="Screenshot 2022-01-17 at 3 31 23 PM" src="https://user-images.githubusercontent.com/33338649/149898393-caaab957-d804-4fac-97c8-ad9a69712980.png">
  
