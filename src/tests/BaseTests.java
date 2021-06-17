package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Login;
import pages.MyAccount;
import pages.MyAddresses;
import pages.MyPersonalInfo;
import pages.MyWishLists;




public class BaseTests {
	WebDriver driver;
	Login login;
	MyAccount myAccount;
	MyPersonalInfo myPersonalInfo;
	MyWishLists myWishLists;
	MyAddresses myAddresses;
	
	
	ExcelReader citacIzExcela;
	String homeUrl;

	@BeforeClass void preSihTestova() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new Login(driver);
		myAccount= new MyAccount(driver);
		myAddresses=new MyAddresses(driver);
		myPersonalInfo= new MyPersonalInfo(driver);
		myWishLists= new MyWishLists(driver);
		citacIzExcela =  new ExcelReader("data/SelenijumProjekat.xlsx");
		
		homeUrl = "http://automationpractice.com/index.php";
	
	}
	@AfterClass
	public void posleSihTestova() {
		driver.close();
	}
}