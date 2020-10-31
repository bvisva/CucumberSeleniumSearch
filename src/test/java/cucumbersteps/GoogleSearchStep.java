package cucumbersteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumberpages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStep {
	
	private WebDriver driver = null;
	private GoogleSearchPage googleSearchPage = null;
	
	@Given("I can access google India")
	public void i_can_access_google_india() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
		googleSearchPage.openGoogleIndia();
	    
	}

	@Given("I enter Selenium Turotial in search textbox")
	public void i_enter_selenium_turotial_in_search_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		googleSearchPage.inputSearchText("Selenium Tutorial");
	    
	}
	
	@When("I click google search")
	public void i_click_google_search() {
	    // Write code here that turns the phrase above into concrete actions
		googleSearchPage.clickGoogleSearch();		
		
	}


	

	@Then("Google search results should be displayed")
	public void google_search_results_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		googleSearchPage.displaySearchResults();
	}
	
	@Given("I enter {string} in search textbox")
	public void i_enter_searchvalue_in_search_textbox(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		googleSearchPage.inputSearchText(arg1);
	}
	
	@Then("I enter <value> in search textbox testcontrol")
	public void i_enter_value_in_search_textbox_testcontrol() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
