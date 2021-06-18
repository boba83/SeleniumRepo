package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAddressesTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void addAddress() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		myAccount.MyAdressesClick();
		Thread.sleep(2000);

		myAddresses.addNewAddressButton();
		Thread.sleep(2000);

		String address = citacIzExcela.getStringData("MyAddresses", 12, 2);
		myAddresses.addressField(address);
		Thread.sleep(2000);

		String city = citacIzExcela.getStringData("MyAddresses", 13, 2);
		myAddresses.cityField(city);
		Thread.sleep(2000);

		String state = citacIzExcela.getStringData("MyAddresses", 14, 2);
		myAddresses.selectStateField(state);
		Thread.sleep(2000);

		String zip = citacIzExcela.getStringData("MyAddresses", 15, 2);
		myAddresses.zipPostalCodeField(zip);
		Thread.sleep(2000);

		String homePhone = citacIzExcela.getStringData("MyAddresses", 16, 2);
		myAddresses.homePhoneField(homePhone);
		Thread.sleep(2000);

		myAddresses.saveButton();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void updateAddress() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		myAccount.MyAdressesClick();

		Thread.sleep(2000);
		myAddresses.updateButton();
		Thread.sleep(2000);

		String address = citacIzExcela.getStringData("MyAddresses", 29, 2);
		myAddresses.addressField(address);
		Thread.sleep(2000);

		String city = citacIzExcela.getStringData("MyAddresses", 30, 2);
		myAddresses.cityField(city);
		Thread.sleep(2000);

		String state = citacIzExcela.getStringData("MyAddresses", 31, 2);
		myAddresses.selectStateField(state);
		Thread.sleep(2000);

		String zip = citacIzExcela.getStringData("MyAddresses", 32, 2);
		myAddresses.zipPostalCodeField(zip);
		Thread.sleep(2000);

		String homePhone = citacIzExcela.getStringData("MyAddresses", 33, 2);
		myAddresses.homePhoneField(homePhone);
		Thread.sleep(2000);

		String assignAddress = citacIzExcela.getStringData("MyAddresses", 34, 2);
		myAddresses.assignAnAddressField(assignAddress);
		Thread.sleep(2000);

		myAddresses.saveButton();

		Thread.sleep(2000);

	}

	@Test(priority = 10)
	public void removeAddress() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		myAccount.MyAdressesClick();
		Thread.sleep(2000);
		myAddresses.deleteButton();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);	
	}

	@AfterMethod
	public void posleSvakogTesta() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
