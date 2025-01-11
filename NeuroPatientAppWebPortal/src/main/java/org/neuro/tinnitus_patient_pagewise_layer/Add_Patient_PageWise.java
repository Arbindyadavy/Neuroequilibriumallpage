package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.Add_Patient_PageOR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class Add_Patient_PageWise extends Add_Patient_PageOR{

	WebGenericMethod WebUtil =WebGenericMethod.getObject();
	
	
	
	public Add_Patient_PageWise() {
		PageFactory.initElements(WebUtil.getDriver(),this);
		
	}
	
	public void Add_Patient() {

		WebUtil.ClickMethod(AddNewPatient, "Add New Patient on click");

		try {
			Thread.sleep(1101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.selectByindex(Tinnitus,2,"");
		
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		WebUtil.selectByvalue(Mr, "Male"); 

		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		WebUtil.selectByindex(prifix, 1,""); 
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(FastName, " Test", "Patient First Name has been sent successfully");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(LastName, "jain", "successfull sendkey");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(PatientAge, "28", "Patient age input successful");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(Gender1, "Male", "Patient Gender Sent Successfully");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(Add_Mobile_Number, "9773355463", "Patient Of Mobile Number Add Successfully");
	//	WebUtil.VerifyString(null, null);
		
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(Patient_Height, "5/05", "Patient Height Sending Successfully");
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(Weight, "50", "Patient Age Sending Successfully");
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	 String gmailString=WebUtil.getSaltString();
//	
	 WebUtil.inputData(PatientGmail, gmailString+"@gmail.com","Patient Of gamil Send Successfully");
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HospitalPatientID, "1234", "hospital id generated successfully sending");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(PatientAddress, "Gopal nagar jaipur ", "Patient Of Address Sent Successfully");

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(PatientCity, "jaipur", "Patient Of City Sent Successfully");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebUtil.inputData(PatientPinNumber, "302015", "Patient Address Of Pin Number in Sent successfully");

		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		String date = WebUtil.getTimeStamp();
		WebUtil.inputData(Appointment_Date, date, "Appointment_data  in Send successfull");

		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.ClickMethod(DateClick, "Patient Date Successfully Clicking ");

		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(referred_By, "Doctor", "Referred Doctor Name Sent Successfully");
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(Doctor_Name, "Rishi Mathur", "Doctor Name Sent Successfully");
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//
//		WebUtil.selectByvalue(selectTechician, "Doctor");
//		try {	
//			Thread.sleep(1001);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}	 

		WebUtil.selectByindex(selectTechician, 1,"");
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebUtil.inputData(selectTechician, "Self", "Tech 1 in send successfull");
//		try {	
//			Thread.sleep(1001);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}	
		// WebUtil.inputData(DoctorName, "Rishi", "");

		// WebUtil.inputData(Comment, "good ", "");

//		
//		WebUtil.inputData(Physiotherapist, "Yes", "");
//		try {	
//			Thread.sleep(1001);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}	
//
//	WebUtil.inputData(Prosthetist, "yes", "");
//		try {	
//			Thread.sleep(1001);
//		} catch (InterruptedException e) {
//			e.printStackTrace();	
//			
//		
//		}	
//
//		WebUtil.inputData(Test_Done_By, "ok", "");
//	
//		try {	
//			Thread.sleep(1001);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}	
//WebUtil.ClickMethod(RGHS_Patient, "");

		WebUtil.ClickMethod(Submit_Button, "Submit button clicked successfully");

		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String file = "Excel_Data\\P_ID.xlsx";
		String getText = WebUtil.getText(getID);
		String[] getext = getText.split(" ");
		WebUtil.writeOneData(file, "Patient ID", getext[7], 1, 0);

		System.out.println(getext[7]);

		// WebUtil.CloseBrowser();
		WebUtil.ClickMethod(dashborad, "After all columns are submitted the dashboard clicked again successfully");
		//com.aventstack.extentreports.util.Assert.assertEquals("dashborad", "dashborad");

	}

	
	
	
	
	
	
	
	
	
	
	
}
