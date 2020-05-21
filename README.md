# Import Service Project
This import service project is written in JAVA and will serve the purpose of implementing UI test for import service with Selenium and Maven. Everything is set up and test can be added straight away 

ℹ️ Selenium is a website automation framework  to write reliable and resilient UI functional tests. This framework TestNg ready. Written and maintained by people who are automating browser-based tests on a routine basis.


# Prerequisites


>=JDK8 installed
>=MAVEN
>=Intellij/Eclipse
Features:
browsers preconfigured- Firefox, Chrome
downloading OS specific binaries automatically
full control by annotations
page object pattern ready
pretty and highly readable console output
parallel test execution with testNG File.
centralized project config
assertions, waits and test extensions
meaningful test result report
template testing
Benefits


## 💻 Implemented Browsers
Thanks to the awesome webdrivermanager it supports the following browsers and automatically downloads OS specific binaries for:

Chrome Headless (default) 

Chrome 

Firefox Headless 

Firefox 

## 🕹️ Full control over certain test methods and classes by annotations
The project includes custom annotations to comfortably set some test conditions and/or assumptions like skip/require certain tests on execution with specific browsers and/or override driver options like browser dimension, headers, cookies, etc. This will increase the possibility to write easily readable and flexible tests.

@Browser
Overwrite used (default) browser by annotating test classes or test methods with:

@Browser(use = FIREFOX)
This will always execute the annotated tests with the selected browser, no matter what has been set as default browser. See the full list of possible parameter values.

Furthermore you can conveniently set the Browser windows dimension that is used for the test by setting the dimension field:

@Browser(dimension = XLARGE)
This will lead to a window resize before the actual test starts and is especially helpful if the site under test relies on a responsive web design. See the full list of possible dimensions. The specific values of the breakpoints can be configured in the config.properties file.

@EnabledOnOs
You can control that a test will ONLY be executed on specific operating systems. (works on class and method level)

@EnabledOnOs(LINUX, WINDOWS)
If a test is annotated with @EnabledOnOs and the current OS the tests gets executed on is not matching, they will be skipped.


# 📜 Page Object Pattern ready
The Page-Object-Pattern can be used straight away to specify elements etc. It will have out-of-the-box support for typical helper methods like isAt(), etc... To instantiate a page object in a test class just the the following:

@Page
private StartPage startPage;


# ‍👩‍👦‍👦 Parallel Test Execution
The Project is preconfigured to run the tests in parallel. The number of test that will be executed at the same time is configurable (defaults to 4) or can be deactivated if required.



# 🎯 Centralized Project Config
To work on the project you will have to clone the project from Gitlab.
```git clone https://gitlab.rktn.de/qa/import-service-automation.git```

To build the project you can look for the file which is at ```(/rakuten/import-service-automation/pom.xml)``` and you make sure that ```(.m2/Setting.xml) is also updated.
Once above set up is done biuld the the project using the command 
```mvn clean install```

## ⏱️ Waits
Testing web applications that are asynchroniously loading / rerendering parts of the page can become hard to test with Selenium. Awaitility is a DSL that allows you to express expectations of an asynchronous system in a concise and easy to read manner and is therefore added to this project.

## 📊 Allure Test Result Report
Allure provides a good representation of test execution output and is designed to create reports that are clear to everyone by creating graphs regarding test execution time, overall test result overviews, test result history, etc.

## 🚀 Template Testing
TestNg templates
