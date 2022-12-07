package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Facebook {
	
	@FindBy(id="email")
	private WebElement User;
	@FindBy(id="pass")
	private WebElement Pass;
	@FindBy(name="login")
	private WebElement Login;

	//Initialization
	public Pom_Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void Username(String un)
	{
		User.sendKeys(un);
	}
	public void Password(String pwd)
	{
		Pass.sendKeys(pwd);
	}
		public void LoginClick()
	{
		Login.click();
	}
}
