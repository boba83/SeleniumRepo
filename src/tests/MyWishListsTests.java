package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MyWishLists;

public class MyWishListsTests extends BaseTests {
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void addMyWishList() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		myAccount.MyWishListClick();
		String name = citacIzExcela.getStringData("MyWishLists", 11, 2);
		myWishLists.nameOfList(name);
		myWishLists.saveButton();
		String actualText = myWishLists.textFromDirectLink();
		String textForAssertion = citacIzExcela.getStringData("MyWishLists", 15, 2);
		assertEquals(actualText, textForAssertion);

	}

	@Test(priority = 5)
	public void addMultipleMyWishList() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		myAccount.MyWishListClick();
		String name1 = citacIzExcela.getStringData("MyWishLists", 22, 2);
		String name2 = citacIzExcela.getStringData("MyWishLists", 24, 2);
		myWishLists.nameOfList(name1);
		myWishLists.saveButton();
		myWishLists.nameOfList(name2);
		myWishLists.saveButton();
		Thread.sleep(2000);

		String actualText = myWishLists.textFromDirectLink();
		String textForAssertion = citacIzExcela.getStringData("MyWishLists", 28, 2);
		assertEquals(actualText, textForAssertion);

	}

	@Test(priority = 10)
	public void deleteMyWishList() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
		login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
		login.SignInButtonWithCredentials();
		myAccount.MyWishListClick();
		myWishLists.deleteButton();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String actualText = myWishLists.textFromWelcomeToYourAccount();
		String textForAssertion = citacIzExcela.getStringData("MyWishLists", 39, 2);
		assertEquals(actualText, textForAssertion);

	}

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();

	}

}
