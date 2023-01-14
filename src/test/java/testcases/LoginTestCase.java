package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class LoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com");
		
		//instantiate login page a special way
		
		LoginPage objLogin = PageFactory.initElements(driver, LoginPage.class);
		objLogin.loginAction("raniselen", "adactin");
	
	}
}
