package testcases;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumGridDemo {
	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		String url = "http://adactinhotelapp.com";
		String node = "http://192.168.1.31:444/wd/hub";;
		EdgeOptions opt = new EdgeOptions();
		driver = new RemoteWebDriver(new URL(node),opt);
		driver.navigate().to(url);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
