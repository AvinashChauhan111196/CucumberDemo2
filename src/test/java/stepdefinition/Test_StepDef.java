package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_StepDef {

	WebDriver driver;
	
//	@Given("User is on {string} selenium easy page")
//	public void user_is_on_selenium_easy_page(String url) {
//		openBrowser("webdriver.chrome.driver","C:\\Users\\avinashkc\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe", "chrome");
//		driver.manage().window().maximize();
//		driver.get(url);
//	   
//	}
//	
//	@When("User click radio checkbox")
//	public void user_click_radio_checkbox() throws InterruptedException {
//	    
//	    singleRadioMethod(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input"));
//	}
//	
//
//	
//	@Then("User is able to click check value button")
//	public void user_is_able_to_click_check_value_button() {
//	  
//		clickOnElement(By.xpath("//*[@id='buttoncheck']"));
//	}
	
	@Given("User is on {string} selenium easy page")
	public void user_is_on_selenium_easy_page(String string) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\avinashkc\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(string);
	}

	@When("User click radio checkbox")
	public void user_click_radio_checkbox() {
	   driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input")).click();
	}

	@Then("User is able to click check value button")
	public void user_is_able_to_click_check_value_button() {
	    driver.findElement(By.xpath("//*[@id='buttoncheck']")).click();
	}

}
