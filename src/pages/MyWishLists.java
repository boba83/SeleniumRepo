package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishLists {
	WebDriver driver;

	WebElement nameOfListButton;
	WebElement saveButton;
	WebElement deleteButton;
	WebElement backToYourAccount;
	WebElement welcomeToYourAccount;
	WebElement directLink;

	public MyWishLists(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getNameOfListButton() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"submitWishlist\"]/span"));
	}

	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_34849\"]/td[6]/a/i"));
	}

	public WebElement getBackToYourAccount() {
		return driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a/span"));
	}

	public WebElement getWelcomeToYourAccount() {
		return driver.findElement(By.className("info-account"));
	}

	public WebElement getDirectLink() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35525\"]/td[5]/a"));
	}

	public void nameOfList(String name) {
		this.getNameOfListButton().clear();
		this.getNameOfListButton().sendKeys(name);
	}

	public void saveButton() {
		this.getSaveButton().click();
	}

	public void deleteButton() {
		this.getDeleteButton().click();
	}

	public String textFromWelcomeToYourAccount() {
		return this.getWelcomeToYourAccount().getText();
	}

	public String textFromDirectLink() {
		return this.getDirectLink().getText();
	}

}
