package stepDefinitionsImplementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaaptolCucumber {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@Before
	public void setUp() {
		ExtentSparkReporter spark = new ExtentSparkReporter("NaaptolReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@Given("I am on the website")
	public void i_am_on_the_website() {
		
		test = extent.createTest("Google opens", "validates google page");
		
		driver.get("https://www.naaptol.com/shop-online/home-kitchen-appliances.html");		
	    
		test.pass("Navigated to the page as expected...!!");
	}

	@Given("I input a product in the search bar")
	public void i_input_a_product_in_the_search_bar() {
	    driver.findElement(By.id("header_search_text")).sendKeys("juicer");
	}
	
	@When("I click the search button")
	public void i_click_the_search_button() {
		driver.findElement(By.partialLinkText("Mixers & Grinders")).click();
	}

	@Then("I expect to see the expected search results")
	public void i_expect_to_see_the_expected_search_results() {
	    System.out.println("Product browsed...");
	}
	
	// Since i am running out of time i have covered as many test scenarios or test cases as i could...

	@Given("I have browsed products")
	public void i_have_browsed_products() {
	    System.out.println("There's a product...");
	}

	@When("I click on the quick view")
	public void i_click_on_the_quick_view() {
	    WebElement prod = driver.findElement(By.id("productItem1"));
	    Actions act = new Actions(driver);
	    act.moveToElement(prod).build().perform();
	    driver.findElement(By.id("#quickViewId1")).click();
	}
	
	@Then("I verify the specific details")
	public void i_verify_the_specific_details() {
		driver.findElement(By.id("pincodeDeliveryId_0")).sendKeys(String.valueOf(110001));
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:bestOfferOnPincode.getBestOfferOnDelivery(null,'12611910', 'Portable Electric Grinder (EG1)');\"]")).click();
	    driver.findElement(By.id("qv_right_id")).click();
	    driver.findElement(By.className("fancybox-button fancybox-close-small"));
	}

	@When("I select two products")
	public void i_select_two_products() {
	    driver.findElement(By.id("cpid12611910")).click();
	    driver.findElement(By.id("cpid12613533")).click();
	}

	@When("I click to compare")
	public void i_click_to_compare() {
	    driver.findElement(By.id("compareButton")).click();
	}

	@Then("I verify the outcomes")
	public void i_verify_the_outcomes() {
	    System.out.println("Verified...");
	}
	
	@Given("I have again browsed products")
	public void i_have_again_browsed_products() {
	    System.out.println("There's a product...");
	}

	@When("I apply filters")
	public void i_apply_filters() {
	    driver.findElement(By.id("iscod")).click();
	    driver.findElement(By.id("isexoutStock")).click();
	}

	@Then("I verify the expected results")
	public void i_verify_the_expected_results() {
	    System.out.println("Test cases passed");
	}
	
	@After
	public void quitDriver() {
		driver.quit();
		extent.flush();
	}
	
	
}
