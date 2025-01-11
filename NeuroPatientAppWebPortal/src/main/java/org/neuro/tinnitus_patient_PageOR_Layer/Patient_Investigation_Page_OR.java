package org.neuro.tinnitus_patient_PageOR_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Patient_Investigation_Page_OR {

	@FindBy(xpath = "//div[@class='dashbordTile']//h3[text()='Investigations']")
	protected WebElement Investigation;

	@FindBy(xpath = "//form[@action='Investigation']//input[@name='user']")
	protected WebElement Patient_ID;

	@FindBy(xpath ="//form[@action='Investigation']//input[@name='date']")
	protected WebElement Appiontment_Date;

	@FindBy(xpath ="//td[@class='active day']")
	protected WebElement Date_click;

	@FindBy(xpath = "//form[@action='Investigation']//button[@type='submit']")
	protected WebElement Add_click;

	@FindBy(xpath = "//a[text()='THI ']")
	protected WebElement THI_Button;
	
	@FindBy(xpath = "//label[@for='concentrateRadio2']")
	protected WebElement Because_of_your_tinnitus1;
	
	@FindBy(xpath = "//label[@for='difficultHearingRadio2']")
	protected WebElement Does_the_loudness_of_your2;
	
	@FindBy(xpath = "//label[@for='makeAngryRadio3']")
	protected WebElement Does_your_tinnitus_make_you_angry3;
	
	@FindBy(xpath = "//label[@for='feelConfusedRadio2']")
	protected WebElement Does_your_tinnitus_make_you_feel_confused4;
	
	@FindBy(xpath = "//label[@for='feelDesperateRadio3']")
	protected WebElement Because_of_your_tinnitus5;
	
	@FindBy(xpath = "//label[@for='complainedRadio2']")
	protected WebElement Do_you_complain_a_great_deal6;
	
	@FindBy(xpath = "//label[@for='troubleToSleepRadio3']")
	protected WebElement Because_of_your_tinnitus7;
	
	@FindBy(xpath = "//label[@for='fellEscapeRadio3']")
	protected WebElement Do_you_feel_as_though_8;
	
	@FindBy(xpath = "//label[@for='interfereSocialActivityRadio2']")
	protected WebElement Does_your_tinnitus_interfere_with_your9;
	
	@FindBy(xpath = "//label[@for='feelFrustratedRadio2']")
	protected WebElement Because_of_your_tinnitus10;
	
	@FindBy(xpath = "//label[@for='feelTerribleRadio3']")
	protected WebElement Because_of_your_tinnitus11;
	
	@FindBy(xpath = "//label[@for='difficultEnjoyLifeRadio2']")
	protected WebElement Does_your_tinnitus_make_it12;
	
	@FindBy(xpath = "//label[@for='interfereHouseholdResponsibilitiesRadio3']")
	protected WebElement Does_your_tinnitus_interfere_with_your13;
	
	@FindBy(xpath = "//label[@for='oftenIrritableRadio2']")
	protected WebElement Because_of_your_tinnitus_do_you14;
	
	@FindBy(xpath = "//label[@for='difficultReadRadio2']")
	protected WebElement Because_of_your_tinnitus_is_it_difficult_for_you_to_read15;
	
	@FindBy(xpath = "//label[@for='stressWithRelationshipRadio2']")
	protected WebElement Does_your_tinnitus_make_youupset_16;
	
	@FindBy(xpath = "//label[@for='stressWithRelationshipRadio2']")
	protected WebElement Do_you_feel_that_your_tinnitus_problem_has_placed_stress_on_your_17;
	
	@FindBy(xpath = "//label[@for='difficultToFocusRadio3']")
	protected WebElement Do_you_find_it_difficult_to_focus_your_18;
	
	@FindBy(xpath = "//label[@for='feelNoControlRadio2']")
	protected WebElement Do_you_feel_that_you_have_no_control_19;
	
	@FindBy(xpath = "//label[@for='feelTiredRadio2']")
	protected WebElement Because_of_your_tinnitus_20;

	@FindBy(xpath = "//label[@for='feelDepressedRadio3']")
	protected WebElement Because_of_your_tinnitus_21;

	@FindBy(xpath = "//label[@for='feelAnxiousRadio2']")
	protected WebElement Does_your_tinnitus_make_you_feel_anxious_22;

	@FindBy(xpath = "//label[@for='feelCopeRadio3']")
	protected WebElement Do_you_feel_that_you_can_no_longer_cope_with_your_tinnitus_23;

	@FindBy(xpath = "//label[@for='underStressRadio2']")
	protected WebElement Does_your_tinnitus_get_worse_24;

	@FindBy(xpath = "//label[@for='feelInsecureRadio3']")
	protected WebElement Does_your_tinnitus_make_you_feel_insecure_25;

	@FindBy(xpath = "//div[@class='col-lg-12']//input[@name='AddTinnitusHandicapInventory']")
	protected WebElement Add_Button;




}
