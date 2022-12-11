import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


public class page {

WebDriver driver;
By MonthDropDown = By.xpath("/html/body/div[4]/span/select[3]");
By NonefromDueDate = By.cssSelector("#extra > select:nth-child(3) > option:nth-child(1)");
	
	@BeforeClass
    public void launch() {
		
		System.setProperty("webdriver.gecko.marionett", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/102/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

    
}

