package cucumbersteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumberpages.AmazonSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchStep {
	
	private WebDriver driver = null;
	private AmazonSearchPage amazonSearchPage = null;
	
	
	@Given("I can access amazon India")
	public void i_can_access_amazon_india() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
		amazonSearchPage.openAmazonIndia();
	}	

	@Given("I select Electronics category from category dropdown")
	public void i_select_electronics_category_from_category_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		amazonSearchPage.selectProductCategory("search-alias=electronics");
	    
	}
	@Given("I enter headphones with mic in search textbox")
	public void i_enter_headphones_with_mic_in_search_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		amazonSearchPage.inputSearchText("headphones with mic");
	    
	}
		
	@When("I click amazon search")
	public void i_click_amazon_search() {
	    // Write code here that turns the phrase above into concrete actions
		amazonSearchPage.clickSearchButton();
	}	

	@Then("Amazon search results should be displayed")
	public void amazon_search_results_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		amazonSearchPage.getProductLists();
	}



}
