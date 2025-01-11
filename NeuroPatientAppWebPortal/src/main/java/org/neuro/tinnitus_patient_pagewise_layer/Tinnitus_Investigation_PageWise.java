package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.Tinnitus_Investigation_Page_OR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class Tinnitus_Investigation_PageWise extends Tinnitus_Investigation_Page_OR{

	
WebGenericMethod WebUtil =WebGenericMethod.getObject();

 
	
	
	public Tinnitus_Investigation_PageWise() {
		PageFactory.initElements(WebUtil.getDriver(),this);
	}
	
	
	public void Patient_Investigation() throws Exception {
		
   WebUtil.ClickMethod(Tinnitus, "Tinnitus investigation clicked Successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Perforation_Left1, "Perforation Left Button Clicked Successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Perforation_Right2, "Perforation Right=======>>> Button Clicked Successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Rinne_test_right3, "Rinne test right Button Clicked Successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Rinne_test_left3A, "Rinne_test_left3A  Button Clicked Successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Weber_Test_4, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(PTA_1_dB_right_5, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Weber_Test_5B, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Weber_Test_6, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Weber_Test_5BB, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	
	WebUtil.selectByindex(Weber_Test_7, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Weber_Test_8, "2", "Weber test option selected successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Weber_Test_9, 2, "Weber test option selected successfully");
	Thread.sleep(800);
	
	
	WebUtil.ClickMethod(Tinnitus_Matching, "Tinnitus Matching? Button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Amplitude_10A , "10", "Amplitude input data enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Amplitude_10B , "10", "Amplitude input data enter successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Type_Amplitude_10B, 2, "Type_Amplitude_10B selected successfully");
	Thread.sleep(800);
	
    WebUtil.inputData(Most_Comfortable_loudness_level_MCL_11_A, "10", "Amplitude input data enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Minimum_Masking_Level_Frequency_11_B, "10", "Amplitude input data enter successfully");
	Thread.sleep(800);
		
	WebUtil.selectByindex(Minimum_Masking_Level_Type_11_C, 1, "Minimum Masking Level Type Selected successfully");
	Thread.sleep(800);
		
	WebUtil.ClickMethod(TEN_v2_dead_region_found_12, "Most Comfortable loudness level(MCL) Db input data Enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(TEN_v2_dead_region_found_12_A, "10", "TEN_v2_dead_region_found_12_A input data Enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Speech_Recognition_Threshold_SRT_Left_13_A, "10", "Speech Recognition Threshold(SRT) Left input data Enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Speech_Recognition_Threshold_SRT_Right_13_B, "10", "Speech Recognition Threshold(SRT) Right input data Enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Speech_Identification_Score_SIS_14_a, "10", "Speech Recognition Threshold(SRT) Right input data Enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Speech_Identification_Score_SIS_14_B, "10", "Speech Recognition Threshold(SRT) Right input data Enter successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Small_increment_sensitivity_index_SISI_15,"Small increment sensitivity index(SISI) Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Tone_Decay,"Tone Decay Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Eustacian_Tube_function_Left,"Eustacian Tube function Left Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Eustacian_Tube_function_Right,"Eustacian Tube function Right Clicked successfully");
	Thread.sleep(800);	
	
	WebUtil.ClickMethod(Acoustic_Reflex_Left,"Acoustic Reflex Left Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra18A,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( At_1000_Hz_Ipsi_18_C,"At_1000_Hz_Ipsi_18_C Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( At_1000_Hz_Contra_18_D,"At_1000_Hz_Contra_18_D Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( At_1000_Hz_Ipsi_18_E,"At_1000_Hz_Ipsi_18_E Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_1000_Hz_Ipsi_18_F,"At_1000_Hz_Ipsi_18_E Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_1000_Hz_Ipsi_18_G,"At_1000_Hz_Ipsi_18_E Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_1000_Hz_Ipsi_18_H,"At_1000_Hz_Ipsi_18_E Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_A,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_B,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_C,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_D,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_E,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_F,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_G,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(At_500_Hz_Contra_18_H,"At 500 Hz Contra Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Tympanogram_type_Left_19A,2,"Tympanogram type Left Selected  successfully");
	Thread.sleep(800);
	
	WebUtil.selectByindex(Tympanogram_type_Right_19B,2,"Tympanogram type Right Selected successfully");
	Thread.sleep(800);
	
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_, "Otoacoustic Emission(OAE) Left Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_B, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_C, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_D, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emission_OA_Right_20_aA, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_aB, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_aC, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Otoacoustic_Emissio_OAE_Left_20_aD, "Otoacoustic Emission(OAE) Left 2kHz Button Clicked successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(HAND_21_A, "20", "HADS Anxiety input data enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(HAND_21_B, "20", "HAND_21_A input data enter successfully");
	Thread.sleep(800);
	
	WebUtil.inputData(Tinnitus_Handicap_Index_THI_22, "20", "Tinnitus Handicap Index(THI) input data enter successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Add_Save_Button, "Add_Save_Button Clicked successfully");
	Thread.sleep(800);
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
