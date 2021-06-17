package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	WebDriver driver;
	WebElement OrderHistoryAndDetails;
	WebElement MyCreditLips;
	WebElement MyAdresses;
	WebElement MyPersonalInformation;
	WebElement MyWishList;
	WebElement Home;

	public MyAccount(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getOrderHistoryAndDetails() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
	}

	public WebElement getMyCreditLips() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span"));
	}

	public WebElement getMyAdresses() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
	}

	public WebElement getMyPersonalInformation() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	}

	public WebElement getMyWishList() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}

	public WebElement getHome() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
	}

	public void orderHistoryAndDetailsClick() {
		this.getOrderHistoryAndDetails().click();
	}

	public void MyCreditLipsClick() {
		this.getMyCreditLips().click();

	}

	public void MyAdressesClick() {
		this.getMyAdresses().click();

	}

	public void MyPersonalInformationClick() {
		this.getMyPersonalInformation().click();

	}

	public void MyWishListClick() {
		this.getMyWishList().click();
	}

	public void HomeButtonClick() {
		this.getHome().click();
	}
}
