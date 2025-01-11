package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.Patient_Investigation_Page_OR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class Patient_Investigation_PageWise extends Patient_Investigation_Page_OR{

	
	WebGenericMethod WebUtil=WebGenericMethod.getObject();
	
	
public Patient_Investigation_PageWise() {
	
	PageFactory.initElements(WebUtil.getDriver(),this );
}
	
	
public void P_investigation() {


	WebUtil.ClickMethod(Investigation, "Investigation on click successfully");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	String file="Excel_Data\\P_ID.xlsx";		
	String  getPatientID=WebUtil.getOneDataExcel(file, "Patient ID", 1, 0);
	WebUtil.inputData(Patient_ID,getPatientID, "Patient_ID on click successful ");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	String date=WebUtil.getTimeStamp();
	WebUtil.inputData(Appiontment_Date, date, "Appiontment_Date sendKeyc successfully");
	
	
	try {
		
		
		Thread.sleep(400);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}


	WebUtil.ClickMethod(Date_click, "Date_click on click successfully");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}


	WebUtil.ClickMethod(Add_click, "Add_click on click successfully");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

public void Patient_THI() throws Exception {
	
	WebUtil.ClickMethod(THI_Button, "thi button clicked successfully");
    Thread.sleep(800);
    
	WebUtil.ClickMethod(Because_of_your_tinnitus1, "Because of your tinnitus button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_the_loudness_of_your2, "Does the loudness of your  button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( Does_your_tinnitus_make_you_angry3, " Does your tinnitus make you angry  button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_your_tinnitus_make_you_feel_confused4, "Does your tinnitus make you feel confused button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus5, " Because of your tinnitus button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Do_you_complain_a_great_deal6, "Do you complain a great deal=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus7, "Because of your tinnitus=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( Do_you_feel_as_though_8, " Do you feel as though === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( Does_your_tinnitus_interfere_with_your9, " Does your tinnitus interfere with your === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus10, "Do you complain a great deal=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus11, "Because of your tinnitus=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod( Does_your_tinnitus_make_it12 , " Does your tinnitus make it === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_your_tinnitus_interfere_with_your13, "Does your tinnitus interfere with your=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus_do_you14, "Because of your tinnitus, do you=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus_is_it_difficult_for_you_to_read15,"Because of your tinnitus, is it difficult for you to read=== >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_your_tinnitus_make_youupset_16,"Does your tinnitus make you upset=== >>>> button clicked successfully");
	Thread.sleep(800); 
	
	WebUtil.ClickMethod(Do_you_feel_that_your_tinnitus_problem_has_placed_stress_on_your_17,"Do you feel that your tinnitus problem has placed stress on your === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Do_you_find_it_difficult_to_focus_your_18,"Do you find it difficult to focus your === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Do_you_feel_that_you_have_no_control_19,". Do you feel that you have no control === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus_20,"Because of your tinnitus, === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Because_of_your_tinnitus_21,"Because of your tinnitus, do you feel depressed? === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_your_tinnitus_make_you_feel_anxious_22,"Does your tinnitus make you feel anxious === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Do_you_feel_that_you_can_no_longer_cope_with_your_tinnitus_23,"Do you feel that you can no longer cope with your tinnitus === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_your_tinnitus_get_worse_24,"Does your tinnitus get worse when you are under stress === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Does_your_tinnitus_make_you_feel_insecure_25," Does your tinnitus make you feel insecure === >>>> button clicked successfully");
	Thread.sleep(800);
	
	WebUtil.ClickMethod(Add_Button,"=== Add_Button >>>> button clicked successfully");
	Thread.sleep(800);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
}
