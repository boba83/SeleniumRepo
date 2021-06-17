package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	WebElement signIn;
	WebElement emailAdress;
	WebElement password;
	WebElement confirmSignIn;
	WebElement signOut;
	WebElement wrongCredentials;
	WebElement emptyCredentials;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailAdress() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSignIn() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

	}

	public WebElement getConfirmSignIn() {
		return driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	}

	public WebElement getSignOut() {
		return driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a"));
	}

	public WebElement getWrongCredentials() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}                                   

	public WebElement getEmptyCredentials() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}

	public void insertEmailAdress(String emailAdress) {
		this.getEmailAdress().clear();
		this.getEmailAdress().sendKeys(emailAdress);
	}

	public void insertPassword(String password) {
		this.getPassword().clear();
		this.getPassword().sendKeys(password);

	}

	public void signInbuttonClick() {
		this.getSignIn().click();
	}

	public void SignInButtonWithCredentials() {
		this.getConfirmSignIn().click();

	}

	public void signOutButton() {
		this.getSignOut().click();
	}
}
