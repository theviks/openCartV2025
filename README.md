##### \# OpenCart Test Automation Framework

##### 

##### Hey there! Thanks for checking out this repo.

##### 

##### This is a complete end-to-end test automation framework I built for the OpenCart e-commerce application. It’s set up to demonstrate some solid best practices using Java, Maven, and Selenium WebDriver. I've focused on making it super maintainable with the \*\*Page Object Model (POM)\*\* and ready to drop into a \*\*CI/CD pipeline\*\*.

##### 

##### ---

##### 

##### \### What's Inside

##### 

##### I've packed this with a few key features to make testing easier:

##### 

##### \* \*\*Core Tech:\*\* It's built on a reliable stack of Java, Maven, and Selenium WebDriver with \*\*TestNG\*\* handling the test runs.

##### \* \*\*Structured for Success:\*\* The whole thing uses the \*\*Page Object Model\*\*, which keeps your test code clean and your page interactions separate.

##### \* \*\*Testing Approach:\*\* I've focused on robust, end-to-end scenarios to make sure the app works just like a real user would expect.

##### \* \*\*Data-Driven:\*\* Need to run the same test with different data? No problem. The framework is set up for \*\*data-driven testing\*\*.

##### \* \*\*Clear Reporting:\*\* You get detailed test reports, logs, and even \*\*screenshots\*\* whenever a test fails, so debugging is a breeze.

##### \* \*\*Ready for DevOps:\*\* I've included configs for running tests on different browsers and even a Selenium Grid using \*\*Docker\*\*, so it’s ready for a modern workflow.

##### 

##### ---

##### 

##### \### How to Get Started

##### 

##### Setting this up is pretty straightforward.

##### 

##### \#### What you need:

##### \* \*\*Java JDK 8+\*\*

##### \* \*\*Apache Maven\*\*

##### \* \*\*Docker\*\* (if you want to use the Selenium Grid)

##### 

##### \#### Steps:

##### 1\.  First, clone the repository to your machine:

##### &nbsp;   ```bash

##### &nbsp;   git clone \[https://github.com/theviks/openCartV2025.git](https://github.com/theviks/openCartV2025.git)

##### &nbsp;   cd openCartV2025

##### &nbsp;   ```

##### 

##### 2\.  Next, build the project with Maven to get all the dependencies sorted:

##### &nbsp;   ```bash

##### &nbsp;   mvn clean install

##### &nbsp;   ```

##### 

##### \#### Running the tests:

##### 

##### \* \*\*To run everything:\*\* Just use the default Maven command, which will grab the `master.xml` file.

##### &nbsp;   ```bash

##### &nbsp;   mvn test

##### &nbsp;   ```

##### \* \*\*For specific tests:\*\* If you only want to run a particular suite (like cross-browser tests), just point to the right XML file.

##### &nbsp;   ```bash

##### &nbsp;   mvn test -Dsurefire.suiteXmlFiles=src/test/resources/crossbrowsertesting.xml

##### &nbsp;   ```

##### \* \*\*With Docker:\*\* If you want to use a Selenium Grid, fire up the Docker containers first, and then run the tests.

##### &nbsp;   ```bash

##### &nbsp;   docker-compose up -d

##### &nbsp;   ```

##### 

##### ---

##### 

##### \### Want to contribute?

##### 

##### I’m always open to ideas and improvements. If you find a bug or have an idea for a new feature, feel free to open an issue or submit a pull request!

