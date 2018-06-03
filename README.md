# Mobile Automation
#  Introduction
  This repository is made for Mobile Automation of Login Module on PhasorLab Android apploication whose main aim is to connect people with wireless technologies.
# Installation
  You will need to install
  *  Java JDK-1.8 [Java Installation](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
     
     - Download java jdk based on Windows Operating system from the above mentioned link.
     - Configure java path in System variables
      -  Create new path in Environment variables as 
         - JAVA_HOME- C:\Program Files\Java\jdk1.8.0_161
         - PATH - C:\Program Files\Java\jdk1.8.0_161\bin
  * Node.js [Install Node.js](https://nodejs.org/en/download/)
    - Install 64-bit setup. 
    - Set Node Home variable Enviromental variable path
      - NODE_HOME- C:\Program Files\nodejs
      - PATH - C:\Program Files\nodejs\node_modules\npm\bin
      
  * Downlaod Appium Server from node
   - Open Command Prompt anf give command- install npm -g appium. Once it is done just type appium. 
   
   * Confiure Appium Client jars- Java client -6.0.0 [Downlaod appium jars](https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22io.appium%22%20AND%20a%3A%22java-client%22)
    - Give the knowledge of java client jars to your code just by adding external paths into it.
       
  * Eclipse [Install Eclipse](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/3a/eclipse-java-oxygen-3a-win32-x86_64.zip)
    - After Installing it, unzip the files in your system. Launch eclipse through eclipse.exe file.
 * Selenium -3.11.0 [Download Selenium jars](https://www.seleniumhq.org/download/)
   - After Installing it, unzip the files in your system. Give the knowledge of Selenium jars to your code just by adding external paths into it.
  * Apache common-lang-3-3.7.jar [Install common-lang jars](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.0)
    - After Installing it, unzip the files in your system. Give the knowledge of Apache common lang jars to your code just by adding external paths into it.
  
  * TestNG framework  [TestNG plugin](http://testng.org/doc/download.html)
    - Configure TestNG framework from the above mentioned link. Go to -Install from update site section
    -  Select Help / Install New Software in Eclipse 
    -  Enter the update site URL in "Work with:" field:
    - Update site for release: http://beust.com/eclipse.
     
    - Make sure the check box next to URL is checked and click Next.
    - Eclipse will then guide you through the process.
  
# Prerequisites before running the Script
  * Open the appium server just by giving appium command on command prompt 
  * Now check the port number to  make the connection with Appium server
   - And replace the port number in the script in the given command. Only the value which would vary is your port number i.e .4723
     - AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
  * Real devce shoul be connected to your system before ruuning the script. And then check your real device OS version.
    -You can do that just run the script for the very first time in Eclipse and check its error logs. Logs tell you what device is available and what OS version is required. 
    -And then you can repalce it in the script in the given command.
     - cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
 
# Contact
  - If you have any questions about this repository, or need some help to contribute, please do not hesitate to contact me.
