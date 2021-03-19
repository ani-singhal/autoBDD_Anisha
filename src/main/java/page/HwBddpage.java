package page;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.Browserfactory;
public class HwBddpage {

	WebDriver driver;

//	public HwBddpage(WebDriver driver) {
//		this.driver = driver;
//	}

	//@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']") WebElement SkyBlueBackButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]") WebElement SkyBlueBackButton;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement SkyWhiteBackButton;
	
	public void validateURL1() {
//		String uurl=driver.getCurrentUrl();
//		System.out.println(uurl);
	System.out.println("XXXX");
	}
	@Test
	public void setbackgroundblueButtonExist() {
	driver =Browserfactory.init();
		//String But = SkyBlueBackButton.getText();
		
		//Assert.assertE
		if (SkyBlueBackButton.isDisplayed()) {
			System.out.println("Set SkyBlue Background BUTTON EXISTS");
		}
		else {
			System.out.println("NOT There YET");
		}
	}

//	public void setbackgroundBlue() {
//		SkyBlueBackButton.click();
//	}
//
//	public void ValidateBackBlue() {
//		String color = driver.findElement(By.xpath("//body")).getAttribute("style");
//		System.out.println(color);
//		//Assert.assertEquals("INVALIDATED", color, "skyblue");
//		
//		if (color.contains("skyblue"))
//			System.out.println("VALIDATED the Change in color");
//	}
}
