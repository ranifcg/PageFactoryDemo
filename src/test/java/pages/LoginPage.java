package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;
 

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.ID, using="username")
	WebElement user_name;
	
	@FindBy(id="password")
	WebElement user_password;
	
	//either of the condition. Name or Id matches
	@FindAll({
		@FindBy(name="login"),
		@FindBy(id="login_1")
	})
	WebElement login_btn;
	
	//Method to enter details and login
	public void loginAction(String uname, String pwd)
	{
		user_name.sendKeys(uname);
		user_password.sendKeys(pwd);
		
		login_btn.click();
	}
	
	

}
