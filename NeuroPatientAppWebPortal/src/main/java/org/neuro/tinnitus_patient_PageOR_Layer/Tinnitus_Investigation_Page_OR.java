package org.neuro.tinnitus_patient_PageOR_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tinnitus_Investigation_Page_OR {

	@FindBy(xpath = "//a[text()='Tinnitus Investigation ']")
	protected WebElement Tinnitus;
	
	@FindBy(xpath = "//label[@for='PerforationYes']")
	protected WebElement Perforation_Left1;
	
	@FindBy(xpath = "//label[@for='PerforationYesRight']")
	protected WebElement Perforation_Right2;
	
	@FindBy(xpath = "//label[@for='RinneRYes']")
	protected WebElement Rinne_test_right3;
	
	@FindBy(xpath = "//label[@for='RinneLYes']")
	protected WebElement Rinne_test_left3A;
	
	@FindBy(xpath = "//select[@id='Weber']")
	protected WebElement Weber_Test_4;
	
	@FindBy(xpath = "//select[@id='PTA1Right']")
	protected WebElement PTA_1_dB_right_5;
	
	@FindBy(xpath = "//select[@id='PTA2Right']")
	protected WebElement Weber_Test_5B;
	
	@FindBy(xpath = "//select[@id='PTA1Left']")
	protected WebElement Weber_Test_6;
	
	@FindBy(xpath = "//select[@id='PTA2Left']")
	protected WebElement Weber_Test_5BB;
	
	@FindBy(xpath = "//select[@id='Audiogram']")
	protected WebElement Weber_Test_7;
	
	@FindBy(xpath = "//input[@id='MCL']")
	protected WebElement Weber_Test_8;
	
	@FindBy(xpath = "//select[@id='UCL']")
	protected WebElement Weber_Test_9;
	
	@FindBy(xpath = "//label[@for='TinMatchYes']")
	protected WebElement Tinnitus_Matching;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='TinMatchAmpl']")
	protected WebElement Amplitude_10A;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='TinMatchFreq']")
	protected WebElement Amplitude_10B;
	
	@FindBy(xpath = "//select[@id='TinMatchType']")
	protected WebElement Type_Amplitude_10B;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='Masking']")
	protected WebElement Most_Comfortable_loudness_level_MCL_11_A;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='MaskingFreq']")
	protected WebElement Minimum_Masking_Level_Frequency_11_B;
	

	@FindBy(xpath = "//select[@id='MaskingType']")
	protected WebElement Minimum_Masking_Level_Type_11_C;
	
	@FindBy(xpath = "//label[@for='DeadRegionFoundYes']")
	protected WebElement TEN_v2_dead_region_found_12;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='DeadRegion']")
	protected WebElement TEN_v2_dead_region_found_12_A;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='SRT']")
	protected WebElement Speech_Recognition_Threshold_SRT_Left_13_A;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='SRTRight']")
	protected WebElement Speech_Recognition_Threshold_SRT_Right_13_B;
	
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='SIS']")
	protected WebElement Speech_Identification_Score_SIS_14_a;
		
	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='SISRight']")
	protected WebElement Speech_Identification_Score_SIS_14_B;
	
	
	
	
	
	
	
	@FindBy(xpath = "//select[@id='UCL']")
	protected WebElement Uncomfortable_loudness_level_UCL;
	
	@FindBy(xpath = "//label[@for='SISIYes']")
	protected WebElement Small_increment_sensitivity_index_SISI_15;
	
	@FindBy(xpath = "//label[@for='DecayYes']")
	protected WebElement Tone_Decay;
	
	@FindBy(xpath = "//label[@for='EustacianYes']")
	protected WebElement Eustacian_Tube_function_Left;
	
	@FindBy(xpath = "//label[@for='EustacianRightYes']")
	protected WebElement Eustacian_Tube_function_Right;
	
	@FindBy(xpath = "//label[@for='Reflex1Yes']")
	protected WebElement Acoustic_Reflex_Left;
	
	@FindBy(xpath = "//label[@for='Reflex1ContraLeftYes']")
	protected WebElement At_500_Hz_Contra18A;
	
	@FindBy(xpath = "//label[@for='Reflex2Yes']")
	protected WebElement At_1000_Hz_Ipsi_18_C;
	
	@FindBy(xpath = "//label[@for='Reflex2ContraLeftYes']")
	protected WebElement At_1000_Hz_Contra_18_D;
	
	@FindBy(xpath = "//label[@for='Reflex3Yes']")
	protected WebElement At_1000_Hz_Ipsi_18_E;
	
	@FindBy(xpath = "//label[@for='Reflex3ContraLeftYes']")
	protected WebElement At_1000_Hz_Ipsi_18_F;
	
	@FindBy(xpath = "//label[@for='Reflex4Yes']")
	protected WebElement At_1000_Hz_Ipsi_18_G;
	
	@FindBy(xpath = "//label[@for='Reflex4ContraLeftYes']")
	protected WebElement At_1000_Hz_Ipsi_18_H;
	
	@FindBy(xpath = "//label[@for='Reflex1YesRight']")
	protected WebElement At_500_Hz_Contra_18_A;
	
	@FindBy(xpath = "//label[@for='Reflex1ContraRightYes']")
	protected WebElement At_500_Hz_Contra_18_B;
	
	@FindBy(xpath = "//label[@for='Reflex2YesRight']")
	protected WebElement At_500_Hz_Contra_18_C;
	
	@FindBy(xpath = "//label[@for='Reflex2ContraRightYes']")
	protected WebElement At_500_Hz_Contra_18_D;
	
	@FindBy(xpath = "//label[@for='Reflex3YesRight']")
	protected WebElement At_500_Hz_Contra_18_E;
	
	@FindBy(xpath = "//label[@for='Reflex3ContraRightYes']")
	protected WebElement At_500_Hz_Contra_18_F;
	
	
	@FindBy(xpath = "//label[@for='Reflex4YesRight']")
	protected WebElement At_500_Hz_Contra_18_G;
	
	@FindBy(xpath = "//label[@for='Reflex4ContraRightYes']")
	protected WebElement At_500_Hz_Contra_18_H;
	
	@FindBy(xpath = "//label[@for='Reflex1ContraRightYes']")
	protected WebElement At_500_Hz_Contra_19_A;

	@FindBy(xpath = "//select[@id='Tympanogram']")
	protected WebElement Tympanogram_type_Left_19A;

	@FindBy(xpath = "//select[@id='TympanogramRight']")
	protected WebElement Tympanogram_type_Right_19B;
	
	@FindBy(xpath = "//label[@for='OAE1Yes']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_;

	@FindBy(xpath = "//label[@for='OAE2Yes']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_B;

	@FindBy(xpath = "//label[@for='OAE3Yes']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_C;

	@FindBy(xpath = "//label[@for='OAE4Yes']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_D;

	@FindBy(xpath = "//label[@for='OAE1YesRight']")
	protected WebElement Otoacoustic_Emission_OA_Right_20_aA;

	@FindBy(xpath = "//label[@for='OAE2YesRight']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_aB;

	@FindBy(xpath = "//label[@for='OAE3YesRight']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_aC;

	@FindBy(xpath = "//label[@for='OAE4YesRight']")
	protected WebElement Otoacoustic_Emissio_OAE_Left_20_aD;

	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='THIScore']")
	protected WebElement HAND_21_A;

	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='THIScoreDepression']")
	protected WebElement HAND_21_B;

	@FindBy(xpath = "//div[@class='form-group form-md-line-input']//input[@id='HADSScore']")
	protected WebElement Tinnitus_Handicap_Index_THI_22;

	@FindBy(xpath = "//div[@class='col-lg-12 ']//input[@name='AddTInvestigation']")
	protected WebElement Add_Save_Button;
	
	
	
	
	
}
