# Grader
This program is designed to be a simple autograder for Java programs. A version can be distributed to students so that they can test there code before turning in, and a second version can be used by teachers for grading purposes. After running the file, students will get a printed summary of the tests that ran and whether they passed. Teachers can run against a directory and get a report of all the Java programs in that directoy.

### Files
`RecursionTester.java` - Junit test file that contains the Junit testes used for grading.
`TestRunner.java` - Program file that kicks off the tests and reports the results.
`RecursionClasswork.java` - Template that is used for assignment.
`YourName.java` - Individual student files that would get renamed to the student's name before submitting.
`tester.ps1` - Powershell script used by the teacher to test all student scripts in an inputted directory.

## Instructions
There are several different parts of the process needed to set up the files for an assignment. Included in this repository is a working sample.

### Creating the template
Replace RecursionClasswork.java with the methods that you would like to assign to the students. It is best if they have a return statement, but JUnit testing can be set up for print statements. Once the template is completed, you can copy the methods over to the student copy, YourName.java. Make sure you update the extends command to point to your template. Be sure to leave the main method in the student copy, as this will be used to pass the student's Class name to the JUnit tests.

### Creating the tests
The code in the @Before part of the Tester is used to read in a Class name (that was written by the test runner). This part is needed, but you can add additional setup code as needed.

Add your JUnit tests into the Tester file, then update the TestRunner to add the names of the test methods to the tests ArrayList. As you create tests, you can use the graded boolean to easily have two versions of the file, one to distribute to the students and additional tests for grading purposes.

### Creating the .jar file
Once you are finished updating the tests and the template, create a runnable .jar file. Make sure you extract required libraries into the generated jar file to capture the JUnit test libraries. Optionally, uou can create two jar files, one with the graded set to false for the students and one set to true for grading purposes.

## Use
You can now distrubute the student jar and the YourName.java to the students for their use. Instruct students to add the YourName.java to a default package and add the jar file to the build path. Once this is completed, they should be able to execute their code and get results.

To turn in, instruct students to rename their YourName.java file with their name and to make sure that they remove any print statements used for testing and any package statements.
