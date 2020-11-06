# Simple Calculator - Introduction to Behavior Driven Development

This project is a quick start for anyone is interested in learning how to create Specficiation by Example scenarios using the Cucumber framework and a simplar calculator application.
There are two main branches in this git repo that should be used for this workshop.
Solution: This branch contains an application that has all steps implemented and tests passing, as well as some additional scenarios for multiplcation and division.
Stubbed: This branch will have a few base scenarios for addition and subtraction, but nothing else.

Set up:
--------------------------------------------
In order to run this codebase, the following must be installed:
Java:
	This project was built using Java 13.0.2.
	Confirm that Java is correctly installed by running "java --version"
	Ensure that your JAVA_HOME is.
Maven:
	This project was built using Apache Maven 3.6.3.
	Confirm that Maven is installed by running "mvn -version".
	Add the Maven bin directory to your path so you can run the "mvn" command.
Red Hat Developer Studio (or some Java IDE)
	Optional Step: Install the Eclipse plug in for Cucumber: https://cucumber.github.io/cucumber-eclipse/

To confirm that the project builds correctly, navigate to the project and run "mvn install".
If you are in the Solution branch: This should display "Build Success" as the final status and show that a total of 24 tests ran, with 0 failures.
If you are in the Stubbed branch:


Setup Fedora
---------------------
- Step 1: Check Java version on your system

		java -version

	if java exists, note the version of java, it should be 1.8.X or 11.0.X else download java following way, with Superuser Privileges 

		yum install java-11-openjdk-devel.x86_64

- now check java version again, it should be 11.X

- Step 2: Download Eclipse IDE for java, and install and start it. Import the the project into eclipse from<br/>
``File-> Open Projects from file system -> Browse -> search the cloned repo and import it``. 

 	Eclipse: https://www.eclipse.org/downloads/

- Step 3: Create a run configuration from the dropdown next to run button in eclipse, the settings should look like this,


	
Also, go to JRE tab and select the workspace default JDK which should be the one that you downloaded.

- Step 4: Open `pom.xml` file and add following two lines in <properties> </properties> section.
		
		<maven.compiler.source><your java version></maven.compiler.source>
		<maven.compiler.target><your java version></maven.compiler.target>
	 
	 
- Step 5: Run the code, it should fail but the failure should say test cases failing and on master branch build should be a success.



