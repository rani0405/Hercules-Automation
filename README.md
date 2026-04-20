# Hercules Automation Framework (Selenium + POM)

## Application Under Test

https://hercules.works/

## Project Overview

This project is an automated test framework developed using **Selenium WebDriver, Java, TestNG, and Page Object Model (POM)** to validate critical user workflows of the Hercules application.

The framework focuses on:

* Maintainable test design
* Reusable components
* Reliable execution for dynamic UI applications


## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager


## Project Structure

hercules-automation/
│
├── base/              # Driver setup & common configuration
├── pages/             # Page Object Model classes
├── tests/             # TestNG test cases
├── utils/             # Utilities (Waits, Helpers, Reusable methods)
├── testng.xml         # Test suite file
├── pom.xml            # Dependencies
└── README.md

## Test Coverage

| Module          | Coverage                    |
| --------------- | --------------------------- |
| Home            | UI validation + Navigation  |
| Survey Model    | Listing + Selection         |
| Survey Creation | End-to-end flow             |
| Questions       | CRUD operations             |
| Payments        | Success & Failure flows     |
| Pricing         | Plan validation & selection |
| Settings        | Update + Validation         |

---

## Key Features Implemented

* Page Object Model (POM) design pattern
* Explicit waits for dynamic elements
* Exception handling and assertions
* Reusable utility methods
* Modular test structure
* Dynamic locator handling for modern UI

---

## How to Run the Project

### 1️.Clone the Repository

git clone https://github.com/rani0405/Hercules-Automation.git

### 2️.Navigate to Project

cd hercules-automation

### 3️.Install Dependencies

mvn clean install

### 4️.Execute Tests

mvn test

OR run via TestNG:

* Right-click on `testng.xml`
* Select **Run as TestNG Suite**


## Execution Result

* Tests execute using TestNG framework
* Validations performed using assertions
* Failures captured with meaningful error messages

## Bugs Identified

| Module    | Issue Description                                |
| --------- | ------------------------------------------------ |
| Questions | Edit button not visible                          |
| Questions | Delete button missing                            |
| Survey    | Save button not stable                           |


## Challenges Faced

* Handling dynamic UI elements (React-based components)
* Locating non-standard elements (`role="textbox"`)
* Synchronization issues due to delayed rendering
* Inconsistent button visibility


## Solutions Implemented

* Used **WebDriverWait (Explicit Waits)**
* Implemented **findElements() for safe element handling**
* Created **flexible XPath locators**
* Added **assertions for validation**
* Improved **error handling with clear messages**


## Conclusion

The automation framework successfully validates key user workflows of the Hercules application. It is designed to handle dynamic UI challenges and can be easily extended for future test scenarios.


## Submission

* GitHub Repository: https://github.com/rani0405/Hercules-Automation.git
* Includes:

  * Source Code
  * Test Cases
  * README Documentation


## Author

Rani Suresh Nikhade
