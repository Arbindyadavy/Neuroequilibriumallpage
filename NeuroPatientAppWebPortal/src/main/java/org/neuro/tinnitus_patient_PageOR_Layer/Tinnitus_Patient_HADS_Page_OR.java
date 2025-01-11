package org.neuro.tinnitus_patient_PageOR_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tinnitus_Patient_HADS_Page_OR {

	// ===============================================================HADS======================================================================================

	@FindBy(xpath = "//div[@class='panel panel-default-new']//preceding-sibling::a[text()='HADS ']")
	protected WebElement HADS_Button;

	@FindBy(id = "Tense")
	protected WebElement HADS_1;

	@FindBy(id = "EnjoyThings")
	protected WebElement HADS_2;

	@FindBy(id = "AwfulFeeling")
	protected WebElement HADS_3;

	@FindBy(id = "FunnySide")
	protected WebElement HADS_4;

	@FindBy(id = "Worrying")
	protected WebElement HADS_5;

	@FindBy(id = "Cheerful")
	protected WebElement HADS_6;

	@FindBy(id = "Relaxed")
	protected WebElement HADS_7;

	@FindBy(id = "FeelSlowed")
	protected WebElement HADS_8;

	@FindBy(id = "Frightened")
	protected WebElement HADS_9;

	@FindBy(id = "Appearance")
	protected WebElement HADS_10;

	@FindBy(id = "Restless")
	protected WebElement HADS_11;

	@FindBy(id = "Enjoyment")
	protected WebElement HADS_12;

	@FindBy(id = "Panic")
	protected WebElement HADS_13;

	@FindBy(id = "EnjoyBRT")
	protected WebElement HADS_14;

	@FindBy(xpath = "//div[@class='col-lg-12 ']//preceding-sibling::input[@name='AddHADS']")
	protected WebElement HADS_SAVE_BUTTON;

}
