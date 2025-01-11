package org.neuro.tinnitus_patient_PageOR_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_OR {

	@FindBy(xpath = "//input[@id='user']")
	protected WebElement locUser;


	@FindBy(xpath = "//input[@id='password']")
	protected WebElement locpassword;


	@FindBy(xpath = "//div[@class='checker']")
	protected WebElement chick_box_click;

	@FindBy(xpath = "//input[@type='submit']")
	protected WebElement Login_Button_Click;
}
