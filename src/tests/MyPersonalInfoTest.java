package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTest extends BaseTests {
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void insertingNewPassword() throws InterruptedException {
		login.signInbuttonClick();
		String emailAdress = citacIzExcela.getStringData("Login", 12, 2);
		String password = citacIzExcela.getStringData("Login", 16, 2);
	    login.insertEmailAdress(emailAdress);
		Thread.sleep(2000);
		login.insertPassword(password);
		Thread.sleep(2000);
        login.SignInButtonWithCredentials();
        myAccount.MyPersonalInformationClick();
        Thread.sleep(2000);
		String currentPassword = citacIzExcela.getStringData("MyPersonalInfo", 11, 2);
		String newPassword  = citacIzExcela.getStringData("MyPersonalInfo", 12, 2);
		String confirmationPassword  = citacIzExcela.getStringData("MyPersonalInfo", 13, 2);
		myPersonalInfo.curentPassword(currentPassword);
		Thread.sleep(2000);
		myPersonalInfo.newPassword(newPassword);
		myPersonalInfo.confirmation(confirmationPassword);
        
        String textForAssertion = citacIzExcela.getStringData("MyPersonalInfo", 21, 2);
     	String actualText = myPersonalInfo.getSuccesfullUpdate().getText();
   

	}
	
       
        	
	
			
		
			
			
		
		@AfterMethod
		public void posleSvakogTesta() throws InterruptedException {		
//			driver.manage().deleteAllCookies();
			driver.navigate().refresh();		
}
}