package Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

   public String URL = "https://twitter.com/?lang=en";
  
	public TestBase()  {
	
			 
                //set the path of chrome driver
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriverr.exe");

				// Initialize browser
				driver = new ChromeDriver();

				// Open the URL
				driver.get(URL);
				driver.manage().window().maximize();
			
			}
	}
