package com.automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_project_Registeran_account  {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		WebElement Signup1 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		Signup1.click();
		Thread.sleep(3000);
		WebElement Email = driver.findElement(By.xpath("//input[@name='email_create']"));
		Email.sendKeys("java2033260345@gmail.com");
		Email.clear();
		Email.sendKeys("java2033315@gmail.com");

	WebElement create_account_btn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
	create_account_btn.click();
	Thread.sleep(3000);
	WebElement Title = driver.findElement(By.xpath("(//div[@id='uniform-id_gender1']"));
	Title.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
	firstname.sendKeys("javajsele");
	WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
	lastname.sendKeys("pythonysele");
	WebElement emailid = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	emailid.sendKeys("bcdef30220326344@gmail.com");
	emailid.clear();
	emailid.sendKeys("java3033456764@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
	password.sendKeys("java@20453438");
	WebElement days = driver.findElement(By.xpath("//select[@name='days']"));

	Select s = new Select(days);
	s.selectByIndex(1);
	
	WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
	Select s1 = new Select(month);
	s1.selectByIndex(1);
	WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
	Select s2 = new Select(years);
	s2.selectByIndex(2);
	WebElement checkbox_newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));
	checkbox_newsletter.click();
	
	WebElement checkbox_offer = driver.findElement(By.xpath("//input[@name='optin']"));
	checkbox_offer.click();
	
	// your address
	WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
	firstName.sendKeys("seleniumselenium");
	
	WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
	lastName.sendKeys("javajava");
	WebElement companyname = driver.findElement(By.xpath("//input[@id='company']"));
	companyname.sendKeys("greens technology");

	
	WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
	address.sendKeys("0305, east coast road( ecr), adayar, greens tech");
	
	
	WebElement address_line_1 = driver.findElement(By.xpath("//input[@id='address2']"));
	address_line_1.sendKeys("apart no; 30894, floor 6,adayar bustand");
	
	
	WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
	City.sendKeys("chennaichennai");
	

	WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
Select s3 = new Select(state);
s3.selectByIndex(9);
	
	WebElement postal_code = driver.findElement(By.xpath("//input[@name='postcode']"));
	postal_code.sendKeys("99507");

	
	WebElement 	additional_info = driver.findElement(By.xpath("//textarea[@name='other']"));
	additional_info.sendKeys("Green Technology "
			+ "Address: 4th floor, W122, 3rd Ave, W Block, "
			+ "Annanagar East, Chennai, Tamil Nadu 600040");

	WebElement home_phone_no = driver.findElement(By.xpath("//input[@name='phone']"));
	home_phone_no.sendKeys("9949236732");
	WebElement mobile_phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	mobile_phone.sendKeys("8838389977");


	WebElement address_for_future = driver.findElement(By.xpath("//input[@name='alias']"));
	address_for_future.sendKeys("address for futur");
	WebElement register_btn = driver.findElement(By.xpath("//span[text()='Register']"));
	register_btn.click();
	
	
	}
	
}