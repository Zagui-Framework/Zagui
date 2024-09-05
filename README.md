# Zagui Test Automation Framework 

## Overview
This framework provides a robust structure for automating web application tests using Selenium WebDriver, JUnit 5, Cucumber, and the Page Object Model (POM). It is designed to enhance test scalability, maintainability, and clarity by leveraging industry-standard tools and best practices.

## Key Technologies
- **Selenium WebDriver:** For automated browser interactions.
- **JUnit 5:** As the test framework for organizing and executing tests.
- **Cucumber:** integration for behavior-driven development (BDD), offering readable test scenarios.
- **Page Object Model (POM):** Organizes web elements and actions into reusable components, improving test maintenance.

## Features
- **Modular Structure:** Organized into reusable page objects and test steps.
- **Gradle Integration:** Streamlines build processes and dependency management.
- **Custom Utilities:** Includes utilities for common interactions and waits.
- **Contributor-Friendly:** Easy setup and contribution guidelines.

## Project Structure

- src
   - main
      - java
         - zagui
            - config
              - Constants.java
              - DriverConfig.java
           - utils
              - interactions
                 - AlertHandler.java
                 - ClickHandler.java
                 - DragAndDropHandler.java
                 - DropdownHandler.java
                 - TextRetriever.java
                 - UrlRetriever.java
                 - TextInputHandler.java
              - waits
                 - WaitHelper.java
         - resources
   - test
      - java
         - hooks
            - TestHooks.java
         - pages
            - ExamplePage.java
         - runners
            - TestRunner.java
         - steps
            - ExampleStepDefinitions.java
         - resources
      - features
         - example.feature
- target
  - cucumber-reports


## Configuration

Before running tests, ensure the following files and classes are configured correctly:

- **DriverConfig.java:** Handles WebDriver initialization and configuration based on your requirements.
- **CustomUtils.java:** Implements custom methods using interfaces to ensure flexibility and maintainability.

## Running Tests
There are two main ways to run the tests:

### 1. From your IDE
To execute tests from your IDE, run the test suite `TestRunner.java` as a JUnit test suite.

### 2. Using Gradle (Command Line)
To run the tests using Gradle, open a terminal or command prompt, navigate to the root directory of your project, and execute the following command: `gradle test`

### 3. Using Tags (Command Line)
To run the tests using Tags, open a terminal or command prompt, navigate to the root directory of your project, and execute the following command: `gradle cucumber -P tags="@Name_of_the_tag"`

## Contributing

If you wish to contribute to this project, follow these steps:

1. Fork the project.
2. Create a new branch (`git checkout -b feature/new-feature`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push your branch (`git push origin feature/new-feature`).
6. Create a pull request on GitHub.

## Requirements

- Java Development Kit (JDK) version 8 or higher.
- Gradle installed globally.

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/zagui-master/zagui.git
