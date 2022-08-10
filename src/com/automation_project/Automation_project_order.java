package com.automation_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_project_order {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void register_account() {
		WebElement Signup1 = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			Signup1.click();
			WebElement Email = driver.findElement(By.xpath("//input[@id='email_create']"));
			Email.sendKeys("Antmandoctor0326@gmail.com");

		WebElement create_account_btn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		create_account_btn.click();
		WebElement Title = driver.findElement(By.xpath("//input[@id='id_gender2']"));
		Title.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		firstname.sendKeys("Antman.M");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lastname.sendKeys("wasp.A");
		WebElement emailid = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		emailid.sendKeys("antman032688@gmail.com");
		emailid.clear();
		emailid.sendKeys("Antmandoctor0326@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("antmanwasp@0326");
		WebElement days = driver.findElement(By.xpath("//select[@name='days']"));  

		Select s = new Select(days);
		s.selectByVisibleText("5  ");		
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("May ");
		WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
		Select s2 = new Select(years);
		s2.selectByVisibleText("2018  ");
		WebElement checkbox_newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));
		checkbox_newsletter.click();
		
		WebElement checkbox_offer = driver.findElement(By.xpath("//input[@name='optin']"));
		checkbox_offer.click();
		
		// your address
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstName.sendKeys("strange doctor");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys("multiverse");
		WebElement companyname = driver.findElement(By.xpath("//input[@id='company']"));
		companyname.sendKeys("marvel studios");

		
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("marvel studios, (ecr), besantnagar, ");
		
		
		WebElement address_line_1 = driver.findElement(By.xpath("//input[@id='address2']"));
		address_line_1.sendKeys("apart no:001,ecr,amet");
		
		
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("chengam.tv");
		

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
	Select s3 = new Select(state);
	s3.selectByVisibleText("Arizona");
		
		WebElement postal_code = driver.findElement(By.xpath("//input[@name='postcode']"));
		postal_code.sendKeys("85018");

		
		WebElement 	additional_info = driver.findElement(By.xpath("//textarea[@name='other']"));
		additional_info.sendKeys("nothing f");

		WebElement home_phone_no = driver.findElement(By.xpath("//input[@name='phone']"));
		home_phone_no.sendKeys("9819236741");
		WebElement mobile_phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		mobile_phone.sendKeys("8345381239");


		WebElement address_for_future = driver.findElement(By.xpath("//input[@name='alias']"));
		address_for_future.sendKeys("address Future.nothing");
		address_for_future.clear();
		address_for_future.sendKeys("Address.");
		WebElement register_btn = driver.findElement(By.xpath("//span[text()='Register']"));
		register_btn.click();
		
		
		}
	public static void order_place() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(11));
		WebElement Signup1 = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		wait.until(ExpectedConditions.visibilityOf(Signup1));

		Signup1.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='passwd']//preceding::input[@id='email']"));
		//email.sendKeys("Antmandoctor0326@gmail.com");
		email.sendKeys("black0326@gmail.com");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys("antmanwasp@0326");
	
		//black0326
		WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		wait.until(ExpectedConditions.visibilityOf(signin));

		signin.click();

		WebElement dresses = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		Actions a = new Actions(driver); 
		a.moveToElement(dresses).perform();
		WebElement eveningdress = driver.findElement(By.xpath(""
				+ "//li[@id='category-thumbnail']//following::a[@title='Dresses']//following::li//a[@title='Evening Dresses']"));
		a.moveToElement(eveningdress).perform();
		a.click(eveningdress).perform();
	WebElement images = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
	wait.until(ExpectedConditions.visibilityOf(images));
	images.click();
	
	wait = new WebDriverWait(driver,Duration.ofSeconds(11));
	driver.switchTo().frame(0);
	WebElement another_image = driver.findElement(By.xpath("//li[@id='thumbnail_11']"));
	wait = new WebDriverWait(driver,Duration.ofSeconds(11));
	wait.until(ExpectedConditions.visibilityOf(another_image));
	another_image.click();
	WebElement Quantity_btn = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	wait.until(ExpectedConditions.visibilityOf(Quantity_btn));
	Quantity_btn.click();

	WebElement size_of_dress = driver.findElement(By.xpath("//select[@id='group_1']"));
	Select s = new Select(size_of_dress);
	s.selectByVisibleText("M");
	WebElement color_of_dress = driver.findElement(By.xpath("//ul[@id='color_to_pick_list']//child::a[@id='color_24']"));
	wait.until(ExpectedConditions.visibilityOf(color_of_dress));
	color_of_dress.click();
	WebElement add_to_cart = driver.findElement(By.xpath("//span[.='Add to cart']"));
	wait.until(ExpectedConditions.visibilityOf(add_to_cart));
	add_to_cart.click();
	wait = new WebDriverWait(driver,Duration.ofSeconds(11));
	driver.switchTo().defaultContent();

	WebElement proceed_to_checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	wait.until(ExpectedConditions.visibilityOf(proceed_to_checkout));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",proceed_to_checkout);	

WebElement order_details = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
wait.until(ExpectedConditions.visibilityOf(order_details));

order_details.click();

WebElement textbox = driver.findElement(By.xpath("//textarea[@name='message']"));
textbox.sendKeys("ordered");
	WebElement Address_proceed_to_checkout = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
	wait.until(ExpectedConditions.visibilityOf(Address_proceed_to_checkout));

	Address_proceed_to_checkout.click();
	WebElement terms_of_service = driver.findElement(By.xpath("//input[@id='cgv']"));

	terms_of_service.click();
	WebElement shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	wait.until(ExpectedConditions.visibilityOf(shipping));

	shipping.click();
	WebElement payment = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	payment.click();
	WebElement confirm_btn = driver.findElement(By.xpath("//button[@type='submit']//child::span[.='I confirm my order']"));
	confirm_btn.click();
	WebElement back_to_order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
	back_to_order.click();
	WebElement logout = driver.findElement(By.xpath("//a[@title='Log me out']"));
	//logout.click();
	}
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("http://automationpractice.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
			driver.manage().window().maximize();		
			order_place();
		
		}

}
    