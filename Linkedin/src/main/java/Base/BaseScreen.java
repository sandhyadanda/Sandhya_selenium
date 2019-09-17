package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseScreen {

	public static Properties prop;
	public static WebDriver driver;
	public static String Env_poperties_path  = System.getProperty("user.dir") +"\\src\\main\\resources\\Configuration\\Enviroinment.properties";
	public static String TestData_Excel_path  = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\TestData.xlsx";


	@BeforeSuite
	public void properties() throws Exception {

		prop = new Properties();
		FileInputStream fisp = new FileInputStream(Env_poperties_path);
		prop.load(fisp);

	}


	

	@BeforeClass
	public static void instantiateDriver() {
		String browser = prop.getProperty("Browser");
		if(browser.equalsIgnoreCase("chrome")){


			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browser.contains("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			 driver = new ChromeDriver();


		}
		else if (browser.contains("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
			 driver = new ChromeDriver();



		}
	}
	
	
	public static WebDriver drivers() {
		return driver;
	}
	
	@Test
	public static void openURL() {
		String url = prop.getProperty("URL");

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}

	
	@AfterSuite
	public static void teardown() {
		driver.quit();
	}
	
}
