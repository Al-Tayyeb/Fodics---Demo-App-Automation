# Fodics - Demo App ( Appium Automation )


## Overview

This project is designed for automating tests for a mobile application using Appium and Java. It provides a framework for executing tests on Android devices.


## Prerequisites

Before you begin, ensure you have the following installed:

- **Java JDK**
- Appium (latest version)
- **Node.js** (for managing Appium)
- Android SDK (version 8 or higher)



## Getting Started


Follow these steps to set up and run the automation tests:

**Clone the Repository**

```bash
   git clone https://github.com/Al-Tayyeb/Fodics---Demo-App-Automation.git
   cd your-repo
```


**Configure Base.java**

* Navigate to the `Base.java` file located in the `Base` folder.
* Open `Base.java` and modify the following parameters:
  * `deviceName`: Set this to the name of your device.
  * `platformVersion`: Set this to the version of your Android platform.
* Ensure that the application you want to test is installed on the device.

3. **Run the Tests**
   * Open the `AllTest.java` file located in the `test types` folder.
   * Before running the tests, ensure that:
     * The Appium server is running and connected.
     * Your device is connected to your computer.
   * Choose **Run test in the current file** to execute the tests.

## Notes

* Make sure your device is in developer mode and USB debugging is enabled.
* You may need to adjust the timeout settings based on your device's performance.

## Troubleshooting

* If you encounter issues with the Appium server or device connection, check the logs for error messages.
* Ensure all dependencies are correctly installed and paths are set.
