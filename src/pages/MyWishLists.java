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
	WebElement okPopUpButton; // kako inspect od ovoga???

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

	public WebElement getOkPopUpButton() { // kako inspect od ovoga???
		return okPopUpButton; // kako inspect od ovoga???
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

	public void okPopUp() { // kako ovo???
		this.getOkPopUpButton().click(); // kako ovo??
	}

}
