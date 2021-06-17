package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	    public void logInWithValidCredentials() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
	    login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
        login.SignInButtonWithCredentials();
        
        String textForAssertion = citacIzExcela.getStringData("Login", 21, 2);
		String actualText = login.getSignOut().getText();
		assertEquals(actualText, textForAssertion);
	  
	}
	@Test(priority = 5)
	public void logInWithWrongPassword() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 3);
		Thread.sleep(2000);
		String password = citacIzExcela.getStringData("Login", 16, 3);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		
		String textForAssertion = citacIzExcela.getStringData("Login", 21, 3);
	    String actualText = login.getWrongCredentials().getText();
		assertEquals(actualText, textForAssertion);
	}
	@Test(priority = 10)
	public void logInWithWrongMail() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 4);
		Thread.sleep(2000);
		String password = citacIzExcela.getStringData("Login", 16, 4);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		String textForAssertion = citacIzExcela.getStringData("Login", 21, 4);
	    String actualText = login.getWrongCredentials().getText();
		assertEquals(actualText, textForAssertion);
	}
	@Test(priority = 15)
	public void logInWithEmptyCredentials() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 5);
		Thread.sleep(2000);
		String password = citacIzExcela.getStringData("Login", 16, 5);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		String textForAssertion = citacIzExcela.getStringData("Login", 21, 5);
	    String actualText = login.getEmptyCredentials().getText();
		assertEquals(actualText, textForAssertion);
		
	}
	@Test(priority = 20)
	public void logout() throws InterruptedException {
		logInWithValidCredentials();
		login.signOutButton();
		  String textForAssertion = citacIzExcela.getStringData("Login", 21, 6);
			String actualText = login.getSignOut().getText();
			assertEquals(actualText, textForAssertion);
	}
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();

}

}
