package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPersonalInfo {
	WebDriver driver;

	WebElement curentPasswordField;
	WebElement newPasswordField;
	WebElement confirmationField;
	WebElement saveButton;
	WebElement succesfullUpdate;
	

	public MyPersonalInfo(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getCurentPasswordField() {
		return driver.findElement(By.id("old_passwd"));
	}

	public WebElement getNewPasswordField() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getConfirmationField() {
		return driver.findElement(By.id("confirmation"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span"));
	}
	public WebElement getSuccesfullUpdate() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
	}	

	public void curentPassword(String currentPassword) {
		this.getCurentPasswordField().clear();
		this.getCurentPasswordField().sendKeys(currentPassword);
	}

	public void newPassword(String newPassword) {
		this.getNewPasswordField().clear();
		this.getNewPasswordField().sendKeys(newPassword);
	}

	public void confirmation(String confirmationPassword) {
		this.getConfirmationField().clear();
		this.getConfirmationField().sendKeys(confirmationPassword);
	}

	public void saveButton() {
		this.getSaveButton().click();
	}

}
