# SeleniumBasics
First download selenium jar files 
then add project to IDE eclipse 

Use drivers for browsers and use the methods of web elements for testing.


WebDriver is the main class for Selenium
WebDriver is designed to provide a simpler, more concise programming interface in addition to addressing some limitations in the Selenium-RC API.

Selenium-WebDriver makes direct calls to the browser using each browser’s native support for automation


Test Selenium code for Chrome Browser
used maven :
		<dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-chrome-driver</artifactId>
		    <version>3.3.0</version>
		</dependency>

 public static void main( String[] args )
    {
	System.setProperty("webdriver.chrome.driver","/Users/sandeshlamsal/Downloads/chromedriver");
        WebDriver wd=new ChromeDriver();  // initially throws error or chromedriver exe has to be installed
        wd.get("www.sandeshlamsal.com.np")	
    }
To solve, below error
The path to the driver executable must be set by the webdriver.gecko.driver system property;
have to download the gecko driver for specific browser and set property in code level as
System.setProperty(“webdriver.geco.driver”,”c:\\selenium\\geckodriver.exe”);
download this from http://www.seleniumhq.org/download/, click on version and dnld for mac


To work with Firefox we have to add geckodriver not firefox driver

DEPENDENCY
	<dependency>
    	<groupId>org.seleniumhq.selenium</groupId>
   		 <artifactId>selenium-firefox-driver</artifactId>
    	<version>3.3.0</version>
		</dependency>

CODE
	System.setProperty("webdriver.gecko.driver","/Users/sandeshlamsal/Downloads/geckodriver");
        WebDriver wd=new FirefoxDriver();
        wd.get("http://www.sandeshlamsal.com.np");
	
