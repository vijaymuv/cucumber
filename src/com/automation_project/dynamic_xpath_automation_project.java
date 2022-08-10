package com.automation_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dynamic_xpath_automation_project {
public static WebDriver driver;
	public static ChromeOptions options;
	public static void register_account() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Signup1 = driver.findElement(By.xpath(""
				+ "//a[@title='Contact Us']//preceding::a[@title='Log in to your customer account']"));
			Signup1.click();
			WebElement Email = driver.findElement(By.xpath("//div[@class='submit']//preceding::input[@id='email_create']"));
			Email.sendKeys("Antmandoctor1997@gmail.com");

		WebElement create_account_btn = driver.findElement(By.xpath(""
				+ "//input[@id='email_create']//following::div[@class='submit']"));
		create_account_btn.click();
		WebElement Title = driver.findElement(By.xpath(""
				+ "//div[@id='uniform-id_gender1']/following::input[@id='id_gender2']"));
		Title.click();
		WebElement firstname = driver.findElement(By.xpath(""
				+ "//div[@class='required form-group']//following::input[@id='customer_firstname']"));
		firstname.sendKeys("blackpanther");
		WebElement lastname = driver.findElement(By.xpath(""
				+ "//input[@id='customer_firstname']//following::input[@id='customer_lastname']"));
		lastname.sendKeys("forever");
		WebElement emailid = driver.findElement(By.xpath(""
				+ "//input[@id='customer_lastname']//following::input[@id='email']"));
		emailid.sendKeys("antman032688@gmail.com");
		emailid.clear();
		emailid.sendKeys("Antmandoctor1997@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='email']//following::input[@id='passwd']"));
		password.sendKeys("antmanwasp@0326");
		WebElement days = driver.findElement(By.xpath("//div[@class='row']//descendant::select[@id='days']"));

		Select s = new Select(days);
		s.selectByVisibleText("26  ");		
		WebElement month = driver.findElement(By.xpath("//div[@class='row']//descendant::select[@id='months']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("August ");
		WebElement years = driver.findElement(By.xpath("//div[@class='row']//descendant::select[@id='years']"));
		Select s2 = new Select(years);
		s2.selectByVisibleText("1997  ");
		WebElement checkbox_newsletter = driver.findElement(By.xpath(""
				+ "//div[@class='checkbox']//following::div[@id='uniform-newsletter']"));
		checkbox_newsletter.click();
		
		WebElement checkbox_offer = driver.findElement(By.xpath(""
				+ "//div[@class='checkbox']//following::div[@id='uniform-optin']"));
		checkbox_offer.click();
		
		// your address
		WebElement firstName = driver.findElement(By.xpath("//h3[.='Your address']//following::input[@id='firstname']"));
		firstName.sendKeys("Black panther");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='lastname']"));
		lastName.sendKeys("forever");
		WebElement companyname = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='company']"));
		companyname.sendKeys("marvel studios & dc");

	
		WebElement address = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='address1']"));
		address.sendKeys("dc studios, chennai ");
		
		
		WebElement address_line_1 = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='address2']"));
		address_line_1.sendKeys("ecr east coast road");
		
		
		WebElement City = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='city']"));
		City.sendKeys("chennai tamilnadu");
		

		WebElement state = driver.findElement(By.xpath("//input[@id='firstname']//following::select[@id='id_state']"));
	Select s3 = new Select(state);
	s3.selectByVisibleText("California");
		
		WebElement postal_code = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='postcode']"));
		postal_code.sendKeys("400099");

		
		WebElement 	additional_info = driver.findElement(By.xpath("//input[@id='firstname']//following::textarea[@id='other']"));
		additional_info.sendKeys("nothing forever");

		WebElement home_phone_no = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='phone']"));
		home_phone_no.sendKeys("7688334455");
		WebElement mobile_phone = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='phone_mobile']"));
		mobile_phone.sendKeys("1234567892");


		WebElement address_for_future = driver.findElement(By.xpath("//input[@id='firstname']//following::input[@id='alias']"));
		address_for_future.sendKeys("nil");
		address_for_future.clear();
		address_for_future.sendKeys("Add nil.");
		WebElement register_btn = driver.findElement(By.xpath("//input[@id='firstname']//following::button[@id='submitAccount']"));
		register_btn.click();
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			register_account();
			}
	}