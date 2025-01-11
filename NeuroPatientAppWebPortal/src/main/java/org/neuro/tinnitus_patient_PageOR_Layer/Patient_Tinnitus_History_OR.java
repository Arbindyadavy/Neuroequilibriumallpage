package org.neuro.tinnitus_patient_PageOR_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Patient_Tinnitus_History_OR {

	@FindBy(xpath = "//h3[text()=' History ']")
	protected WebElement Patient_history;

	@FindBy(xpath    = "//div[@id='histreport']//input[@name='user']")
	protected WebElement Patient_ID;

	@FindBy(xpath = "//form[@action='History']//div//input[@name='date']")
	protected WebElement Patient_Date;

	@FindBy(xpath = "//div[@class='datepicker-days']//table//tr//td[@class='active day']")
	protected WebElement Patient_Date_Clicl;

	@FindBy(xpath = "//select[@id='language']")
	protected WebElement Choice_Language;
	
	@FindBy(xpath = "//button[@name='checkhistory']")
	protected WebElement Patient_Add_Button;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='soundStartCount']")
	protected WebElement When_did_the_sound_in_your_earstart;
	
	@FindBy(xpath = "//select[@name='startedBy']")
	protected WebElement how_did_it_start;

	@FindBy(xpath = "//select[@name='progressedBy']")
	protected WebElement How_Has_It_progressed;

	@FindBy(xpath = "//label[@for='aggravatingFactorYes']")
	protected WebElement What_are_the_aggravating_factors;

	@FindBy(id ="aggravatingFactorText")
	protected WebElement Define1;
	
	
	@FindBy(xpath = "//label[@for='relievingFactorYes']")
	protected WebElement What_are_the_relieving_factors;

	@FindBy(id = "relievingFactorText")
	protected WebElement Define2;

	@FindBy(id = "trigger")
	protected WebElement Triggers;
	
	@FindBy(xpath = "//label[@for='hearingLossRadioYes']")
	protected WebElement Do_you_have_hearing_loss;
	
	@FindBy(xpath = "//input[@id='hearingTimeCount']")
	protected WebElement How_Long_It_is_associated;
	
	@FindBy(xpath = "//select[@id='earSide']")
	protected WebElement Which_Side_Hearing_Loss;
	
	@FindBy(xpath = "//select[@id='charHearLoss']")
	protected WebElement Character_Of_Hearing_Loss;
	
	@FindBy(xpath = "//label[@for='associatedWithDVRadioYes']")
	protected WebElement Is_it_associated_with_dizziness;
	
	@FindBy(xpath = "//input[@id='associatedDVTimeCount']")
	protected WebElement How_long_it_is_associated;
	
	@FindBy(xpath = "//label[@for='coMorbiditiesYes']")
	protected WebElement Do_you_have_any_co_morbidities;	
	
	
	@FindBy(xpath = "//label[@for='diabetes']")
	protected WebElement Diabetes;	
	
	@FindBy(xpath = "//label[@for='loudSoundsRadioYes']")
	protected WebElement Have_you_been_exposed_to_loud_sounds;	
	
	@FindBy(xpath = "//select[@id='soundExposure']")
	protected WebElement How_you_been_exposed_to_loud_sounds;
	
	@FindBy(xpath = "//label[@for='consumesCTRadioYes']")
	protected WebElement Do_you_consume_tea;
	
	@FindBy(xpath = "//select[@id='cupCount']")
	protected WebElement How_Much_Coffee;
	
	@FindBy(xpath = "//select[@id='affectedEar']")
	protected WebElement Which_ear_is_affected;
	
	@FindBy(xpath = "//select[@id='soundCharacter']")
	protected WebElement What_Is_The_Character_Of_Sound;
	
	@FindBy(xpath = "//label[@for='smokeRadioYes']")
	protected WebElement Smoking;
	
	@FindBy(xpath = "//label[@for='alcoholRadioYes']")
	protected WebElement Alcohol;
	
	@FindBy(xpath = "//label[@for='abuseSubstanceRadioYes']")
	protected WebElement Substance_Abuse;
	
	@FindBy(xpath = "//label[@for='tbMedicines']")
	protected WebElement Ototoxic_Drug_history;
	
	@FindBy(xpath = "//div[@class='row']//div//input[@value='Add History']")
	protected WebElement Add_History_Button;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	protected WebElement dashborad;
	
	
	
	
	
	
}
