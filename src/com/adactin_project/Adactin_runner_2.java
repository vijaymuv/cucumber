package com.adactin_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_runner_2 {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void hotesl_creek() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s  = new Select(location);
        s.selectByVisibleText("New York");
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Creek");
		WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(room_type);
		s3.selectByVisibleText("Deluxe");
		WebElement room_no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(room_no);
		s4.selectByVisibleText("2 - Two");
		WebElement check_in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		check_in.sendKeys("05/07/2022");
		WebElement check_out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		check_out.sendKeys("12/07/2022");
	WebElement adult_per_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select s5 = new Select(adult_per_room);
	s5.selectByVisibleText("2 - Two");
	WebElement children_pr = driver.findElement(By.xpath("//select[@name='child_room']"));
	Select a = new Select(children_pr);
	a.selectByVisibleText("1 - One");

	WebElement search_btn = driver.findElement(By.xpath("//input[@id='Submit']"));
	search_btn.click();
	WebElement search_hotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	search_hotel.click();
	WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
	continue_btn.click();
	WebElement First_name = driver.findElement(By.xpath("//input[@id='first_name']"));
	First_name.sendKeys("doctor");
	WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
	last_name.sendKeys("strange");
	WebElement text_area = driver.findElement(By.xpath("//textarea[@name='address']"));
	text_area.sendKeys("info java technilogies, ecr , chennai");	
	WebElement creditcard_no = driver.findElement(By.xpath("//input[@id='cc_num']"));
	creditcard_no.sendKeys("1234567812345678");
	WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select  b = new Select(card_type);
	b.selectByVisibleText("American Express");
	WebElement expired_mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select c = new Select(expired_mon);
	c.selectByVisibleText("November");
	WebElement expired_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select d = new Select(expired_year);
			d.selectByVisibleText("2018");
			WebElement cvv_no = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			cvv_no	.sendKeys("336");
			
			WebElement book_now_btn= driver.findElement(By.xpath("//input[@id='book_now']"));
			book_now_btn.click();
			WebElement logout_btn = driver.findElement(By.xpath("//a[.='Logout']"));
				//logout_btn.click();		
			
	}
	
	public static void hotel_sunshine() {

		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s  = new Select(location);
        s.selectByVisibleText("London");
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(room_type);
		s3.selectByVisibleText("Standard");
		WebElement room_no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(room_no);
		s4.selectByVisibleText("2 - Two");
		WebElement check_in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		check_in.sendKeys("12/07/2022");
		WebElement check_out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		check_out.sendKeys("15/07/2022");
	WebElement adult_per_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select s5 = new Select(adult_per_room);
	s5.selectByVisibleText("2 - Two");
	WebElement children_pr = driver.findElement(By.xpath("//select[@name='child_room']"));
	Select a = new Select(children_pr);
	a.selectByVisibleText("1 - One");

	WebElement search_btn = driver.findElement(By.xpath("//input[@id='Submit']"));
	search_btn.click();
	WebElement search_hotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	search_hotel.click();
	WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
	continue_btn.click();
	WebElement First_name = driver.findElement(By.xpath("//input[@id='first_name']"));
	First_name.sendKeys("superman");
	WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
	last_name.sendKeys("strange");
	WebElement text_area = driver.findElement(By.xpath("//textarea[@name='address']"));
	text_area.sendKeys("info java technilogies, ecr , chennai");	
	WebElement creditcard_no = driver.findElement(By.xpath("//input[@id='cc_num']"));
	creditcard_no.sendKeys("1234567887654321");
	WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select  b = new Select(card_type);
	b.selectByVisibleText("VISA");
	WebElement expired_mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select c = new Select(expired_mon);
	c.selectByVisibleText("November");
	WebElement expired_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select d = new Select(expired_year);
			d.selectByVisibleText("2019");
			WebElement cvv_no = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			cvv_no	.sendKeys("331");
			
			WebElement book_now_btn= driver.findElement(By.xpath("//input[@id='book_now']"));
			book_now_btn.click();
			WebElement logout_btn = driver.findElement(By.xpath("//a[.='Logout']"));
		
	}
	public static void hotel_cornice() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s  = new Select(location);
        s.selectByVisibleText("Paris");
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Cornice");
		WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(room_type);
		s3.selectByVisibleText("Deluxe");
		WebElement room_no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(room_no);
		s4.selectByVisibleText("5 - Five");
		WebElement check_in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		check_in.sendKeys("12/07/2022");
		WebElement check_out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		check_out.sendKeys("15/07/2022");
	WebElement adult_per_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select s5 = new Select(adult_per_room);
	s5.selectByVisibleText("2 - Two");
	WebElement children_pr = driver.findElement(By.xpath("//select[@name='child_room']"));
	Select a = new Select(children_pr);
	a.selectByVisibleText("0 - None");

	WebElement search_btn = driver.findElement(By.xpath("//input[@id='Submit']"));
	search_btn.click();
	WebElement search_hotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	search_hotel.click();
	WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
	continue_btn.click();
	WebElement First_name = driver.findElement(By.xpath("//input[@id='first_name']"));
	First_name.sendKeys("Avatar");
	WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
	last_name.sendKeys("Thanos");
	WebElement text_area = driver.findElement(By.xpath("//textarea[@name='address']"));
	text_area.sendKeys("info java technilogies, ecr , chennai");	
	WebElement creditcard_no = driver.findElement(By.xpath("//input[@id='cc_num']"));
	creditcard_no.sendKeys("1234567887654321");
	WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select  b = new Select(card_type);
	b.selectByVisibleText("Master Card");
	WebElement expired_mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select c = new Select(expired_mon);
	c.selectByVisibleText("November");
	WebElement expired_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select d = new Select(expired_year);
			d.selectByVisibleText("2019");
			WebElement cvv_no = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			cvv_no	.sendKeys("331");
			
			WebElement book_now_btn= driver.findElement(By.xpath("//input[@id='book_now']"));
			book_now_btn.click();
			WebElement logout_btn = driver.findElement(By.xpath("//a[.='Logout']"));
		logout_btn.click();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.get("https://adactinhotelapp.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
user_name.sendKeys("Vijay0326");
WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
pass.sendKeys("9943924671");
WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
login.click();
hotel_cornice();
	}

}
