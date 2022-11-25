package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPediaPage extends BaseClass {
	@FindBy(css = "input[id='searchInput']")
	WebElement input;
	@FindBy(xpath = "//h3[text()='Pushpa: The Rise']")
	WebElement ser;
	@FindBy(xpath = "(//div[@class='plainlist'])[4]")
	WebElement da;
	@FindBy(xpath = "//th[normalize-space()='Country']/following::td[1]")
	WebElement con;

	public WikiPediaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public void wikipedias()  {
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		input.sendKeys("Pushpa: The Rise");
		ser.click();
	}

	public String relDate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return da.getText();
	}

	public String country() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return con.getText();

	}

}
