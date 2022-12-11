import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test extends page {
	
	
	 @Test
		public void login3() { 
		       	

	    	WebElement monthdropDownList =driver.findElement(MonthDropDown);
	    	monthdropDownList.click();

	    	
	    	
//	    	String a = driver.findElement(MonthDropDown).getText();	
	    	String b = driver.findElement(NonefromDueDate).getText();	
	    	
	    	Assert.assertEquals("month dropdown has all months validation successful","None", b);
		}
}
