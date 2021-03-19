package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import junit.framework.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HwBddpage;
import util.Browserfactory;

public class StepDefination {
	WebDriver driver;
	HwBddpage Page;

	@Before
	public void launch() {
		WebDriver driver = Browserfactory.init();
		HwBddpage Page = PageFactory.initElements(driver, HwBddpage.class);
	}

	@Given("^The user is at the given Website$")
	public void The_user_is_at_the_given_Website() {

		//Page.validateURL1();
	// Assert.assertEquals("xxx", "", "");

	}

	@When("^Set SkyBlue Background button exists$")
	public void Set_SkyBlue_Background_button_exists() {
		Page.setbackgroundblueButtonExist();
	}

	@When("^I click on the button$")
	public void I_click_on_the_button() {
		//Page.setbackgroundBlue();

	}

	@Then("^The background color will change to sky blue$")
	public void The_background_color_will_change_to_sky_blue() {
		//Page.ValidateBackBlue();
	}

}
