# TeemMobileAutomation

## Mobile Tests Setup
### Requirements
  * Xcode
  * Android Studio
  * Appium
    * Appium configured to run emulators from both Xcode and Android Studio (AVD manager)

#### Xcode
  * [Apple Xcode](https://developer.apple.com/download/) (Can also download through app store on Mac)
  * Requires an apple developer id which can be applied for on the site
  * Once downloaded and installed, open Xcode and finish any component downloads that are prompted

#### Android Studio
  * [Android Studio](https://developer.android.com/studio/)
  * Once downloaded and installed, open Android Studio and finish any component downloads that are prompted for a standard install

#### Appium
  * Finish installing Xcode
  * Finish installing Android Studio
  * Download and install Homebrew
  * Run in terminal: `/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)`
  * Install node:
    * Run in terminal: `brew install node`
  * Through homebrew, download and install npm
    * Run in terminal: `brew install npm`
  * Through npm, download and install Appium
    * Run in terminal: `npm install -g appium`
  * Through npm install wd
    * Run in terminal: `npm install wd`
  * Through npm, download and install Appium Doctor
    * In terminal: `npm install -g appium-doctor`

#### Carthage for Appium
  * Run: `npm install -g carthage`
  * Run: `brew link --overwrite carthage`
    
#### Appium-Doctor & Default Paths    
  * Run appium doctor to see what needs to be completed for Appium to be ready
    * In terminal: `appium-doctor`
    * Fix all red items returned by appium-docter and run again until all green results are returned
  * Set a JAVA_HOME
    * the JAVA_HOME is the path where Java resides on the computer. For most Macs, this is `/Library/Java`
    * In terminal, run: `nano ~/.bash_profile`
    * Add the following (will have to update to match your paths and computer name)
    ```markdown
        export JAVA_HOME=$(/usr/libexec/java_home)
        export PATH=${JAVA_HOME}/bin:$PATH
        export ANDROID_HOME=/Users/brandonhansen/Library/Android/sdk
        export PATH=$ANDROID_HOME/platform-tools:$PATH
        export PATH=$ANDROID_HOME/tools:$PATH
    ```
    * Save and exit
    * Close terminal and open it again
    
  * Set an ANDROID_HOME (Should be covered by updateing bash_profile above)
    * The ANDROID_HOME is where appium cand find the android SDK. A standard install of Android Studio will put it at /Users/[Your User Name]/Library/Android/sdk
    * In terminal, run: export ANDROID_HOME=/Users/[Your User Name]/Library/Android/sdk
    * Don't forget to fill in your computer's user name..
    
  * Set JAVA_HOME/bin folder (Should be covered by updateing bash_profile above)
    * Run in terminal: export PATH=${JAVA_HOME}/bin:$PATH
  * At any time, the values of the above can be checked by typing the following into terminal :
    * echo $[value]
      * `echo $JAVA_HOME`
      * `echo $ANDROID_HOME`
      
#### Troubleshooting
  * node not found in intellij (can happen if your machine is weirdly partitioned)
    * Open intellij, open terminal in intellij
    * type: `npm install -g appium`
  * iOS simulator crashed on launch
    * In terminal type `sudo killall -10 com.apple.CoreSimulator.CoreSimulatorService`
  * Appium already running error (Test should still run using existing Appium session)
    * In terminal type `sudo lsof -i tcp:4723`
    * Make note of PID number
    * In terminal type `kill <PID Number>` example `kill 5312`
  * Error installing opencv4
    * if errors are around tesseract 
    * In terminal type `brew unlink tesseract`
    * Run `npm i -g opencv4nodejs` again
    * After successful install Run `brew link tesseract`
  * adb not found
    * Open Android Studio and go to "Tools -> SDK Manager" then click the "SDK Tools" tab
    * Uncheck "Android SDK Platform-Tools" and click apply. Tools should uninstall
    * Check "Android SDK Platfrom-Tools" and click apply. Tools should re-install and now work as expecte    

## How to run you first test case
  * Select .xml file to run under Android/IOS TestSuites/TestRunners 
    * Login_Logout.xml
    * Feedback_Functionality.xml

## How to create your first test case
  * Update the config.properties file present in the 'src/test/resources/config' folder with the details of the device(emulator or real device) on which the automation is to be run.
  * Create and xml file in the respective runner folder based on APP and OS and give the name of the test case in the runner file.
  * Create a test case in respective test cases folder based on APP and OS.
  * Make sure the respective app is present in 'resources' folder. 
	* For Android - src/test/resources/android and src/test/resources/iOS for IOS.
	* For IOS - the respective code branch needs to be downloaded from git and build needs to be created for the specific simulator or real device.
  * Different builds of the apps are required for IOS simulators and Real Devices. 
	* Place builds for simulator in src/test/resources/iOS/iosAppsSimulator. 
	* Place builds for real devices src/test/resources/iOS/iosAppsRealDevice.
  * Enter the 'testingPlatform' and respective device/simulator/emulator information.

## Framework
  * Different components of the framework are as follows : 
  * DriverSelector
  * DriverActions
  * DriverWait
  * Utils
  	 * CommonUtils
  	 * CredentialManager
  	 * ExtentReport
  	 * TestDataReader
  	 * CustomExceptionss
  * Locators
  * WebDriverActions
  * Pages
  * TestCases
  * TestRunners