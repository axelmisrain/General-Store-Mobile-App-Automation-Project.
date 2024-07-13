# General Store Mobile App Automation Project.
## Automation's project recording
![studio64_vEJJ8kmp0n](https://github.com/user-attachments/assets/1a06e68e-41e0-4e24-a175-748318cb76cf)

## Introduction
The goal of this project is to automate the verification of the "Add to Cart" functionality in a mobile application for Android.
The automation process will involve installing the application, setting up account details, and adding items to the cart. This 
project utilizes a combination of tools and frameworks to ensure a robust and efficient testing process.

## Objectives
- Automate the installation and setup of the mobile application.
- Verify the account creation and login functionality.
- Automate the process of adding items to the cart.
- Ensure the reliability and accuracy of the "Add to Cart" feature through automated testing.

## Tools and Frameworks
- **Appium**: An open-source tool for automating mobile applications.
- **Android Studio**: The official IDE for Android development, used for managing virtual devices and the Android emulator.
- **Virtual Device**: An Android emulator for testing the application in a simulated environment.
- **Java**: The programming language used for writing the automation scripts.
- **TestNG**: A testing framework inspired by JUnit, designed for test configuration and management.
- **JUnit**: A framework used for unit testing in Java.
- **JavaScript**: Used for additional scripting and test customization if necessary.

## Detailed Description
### 1. Project Setup
#### - Install and Configure Appium:
         1. Install Appium server and Appium desktop client.
         2. Set up the necessary environment variables and dependencies for Appium.
#### - Set Up Android Studio:
          1. Install Android Studio and configure the SDK.
          2. Create and configure a virtual device (Android emulator) for testing.
### 2. Application Installation and Account Setup
#### - Install the Mobile Application:

          1. Automate the installation process of the mobile application on the virtual device using Appium.
#### - Account Setup:
           1. Automate the process of setting up account details, including user registration and login.
### 3. Add to Cart Functionality
#### - Navigate to the Store:
            1. Automate the navigation process within the application to reach the store section.
#### - Add Items to Cart:
            1. Automate the process of selecting and adding items to the cart.
            2. Verify that the selected items are correctly added to the cart.
### 4. Test Execution and Validation
#### - Test Configuration:
         1. Use TestNG for configuring and managing test cases.
         2. Utilize JUnit for unit tests and assertions.
### - Run Automated Tests:
         1. Execute the automated tests on the virtual device.
         2. Validate the test results and ensure that the "Add to Cart" functionality works as expected.
### 5. Reporting and Logging
#### - Generate Test Reports:
         1. Use TestNG to generate detailed test reports.
         2. Include information on test case execution, results, and any errors encountered.
#### - Logging:
         1. Implement logging mechanisms to capture test execution details and debug information.
## Conclusion
By automating the testing process for the "Add to Cart" functionality in the General Store mobile application, this project aims to ensure a seamless and reliable user experience. The combination of Appium, TestNG, JUnit, and other tools provides a robust framework for efficient and effective mobile application testing.
