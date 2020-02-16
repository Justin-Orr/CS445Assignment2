# CS445Assignment2
BUILD INSTRUCTIONS:

Enter into the directory that contains the gradle files.  
For Problem 4: ~/Problem_4/ImprovedRandom/  
For Problem 5: ~/Problem_5/ImprovedStringTokenizer/

Once in the directory run the following commands:   
$ ./gradlew clean   
$ ./gradlew build

Note* To run the following commands you must be in the parent directory where the build.gradle file is located.  
Now that the framework is built, to run the JUnit tests run:  
$ ./gradlew test  

The test results will be an HTML file labeled index.html located in ~/build/reports/tests/test  

To run Jacoco for Unit Test Coverage and Cyclomatic Complexity run:  
$ ./gradlew jacocoTestReport

The test results will be an HTML file labeled index.html located in ~/build/reports/jacoco/test/html.
