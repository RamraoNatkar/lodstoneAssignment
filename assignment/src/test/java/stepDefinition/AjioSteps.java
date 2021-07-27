package stepDefinition;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageRepos.AjioPage;

public class AjioSteps {
	AjioPage pageRepo;
	String price;
	public WebDriver driver;
	@Given("^user navigate to Ajio webpage$")
	public void user_navigate_to_Ajio_webpage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ram\\Desktop\\Lodstone\\assignment\\resources\\chromedriver91.0.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
	   
	}

	@Given("^Click on the Search text box$")
	public void click_on_the_Search_text_box() {
		
	    System.out.println("user clicks on searchbox");
	}

	@When("^Type the value “Shoes”$")
	public void type_the_value_Shoes()  {
		pageRepo=new AjioPage(driver);
		pageRepo.searchItem("shoes");
		
	}

	@When("^Click on the Search button$")
	public void click_on_the_Search_button(){
		pageRepo.clickOnSearch();
	   
	}

	@When("^get the first six items name,price and discounted price$")
	public void get_the_first_six_items_name_price_and_discounted_price()  {
		pageRepo.getProductDetails();
		
		
	   
	}

	@Then("^print name,price and discounted price$")
	public void print_name_price_and_discounted_price() {
		System.out.println("printed first six product details");
	   
	}

	@Then("^find highest price among six$")
	public void find_highest_price_among_six()  {
		 price=pageRepo.getHighestprice();
				
	    
	}
	@Then("^print product name with highest price$")
	public void print_product_name_with_highest_price()  {
	  
		System.out.println("Highest price is ="+price);
	}

}
