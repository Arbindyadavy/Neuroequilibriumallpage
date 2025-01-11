package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.Patient_Tinnitus_History_OR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class Patient_Tinnitus_History extends Patient_Tinnitus_History_OR {

	WebGenericMethod WebUtil = WebGenericMethod.getObject();

	public Patient_Tinnitus_History() {

		PageFactory.initElements(WebUtil.getDriver(), this);
	}

	public void P_History() {

		WebUtil.ClickMethod(Patient_history, "Patient History button successfully clicked");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		String file = "Excel_Data\\P_ID.xlsx";
		String getPatientID = WebUtil.getOneDataExcel(file, "Patient ID", 1, 0);
		WebUtil.inputData(Patient_ID, getPatientID, "Patient_ID  send successfully");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String date = WebUtil.getTimeStamp();

		WebUtil.inputData(Patient_Date, date, "Patient Date Successfully Clicking");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.ClickMethod(Patient_Date_Clicl, "Patient_Date_Clicl on click successful");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(Choice_Language, "English", "Patient Of Choice Language send successful");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.ClickMethod(Patient_Add_Button, "Patient_Add_Historyl  on click successful");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(When_did_the_sound_in_your_earstart, "10",
				"When did the sound in your ear start Ans Send Successfully");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebUtil.selectByindex(how_did_it_start, 1, "select option Suddenly");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.selectByindex(How_Has_It_progressed, 3, "How Has It progressed Choose Ans Fluctuant");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebUtil.ClickMethod(What_are_the_aggravating_factors," What are the aggravating factors == And click Chek Box Successfully");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 WebUtil.inputData(Define1, "11 Define", "Define");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebUtil.ClickMethod(What_are_the_relieving_factors," What are the aggravating factors == And click Chek Box Successfully");
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
     WebUtil.inputData(Define2, "11 Define", "Define");
     try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
     
     WebUtil.selectByindex(Triggers, 2, "Triggers");
     
     try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    WebUtil.ClickMethod(Do_you_have_hearing_loss, "Do you have hearing loss == Button clicked Successfully"); 
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
     
    WebUtil.selectByindex(Which_Side_Hearing_Loss,2, "Which Side Hearing Loss  Ans ===  Left ");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    WebUtil.inputData(How_Long_It_is_associated, "11", "Define");
    
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    WebUtil.selectByindex(Character_Of_Hearing_Loss,2, "Which Side Hearing Loss  Ans === Fluctuant ");
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    WebUtil.ClickMethod(Is_it_associated_with_dizziness, "Is it associated with dizziness Button Click Successfully=== ");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    WebUtil.inputData(How_long_it_is_associated, "11", "How long it is associated Enter Message Successfully ");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    WebUtil.ClickMethod(Do_you_have_any_co_morbidities, "Do you have any co–morbidities Button Clicked Successfully");
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Diabetes, "Diabetes Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Have_you_been_exposed_to_loud_sounds, "Have you been exposed to loud sounds Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.selectByindex(How_you_been_exposed_to_loud_sounds,1, "Have you been exposed to loud sounds Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Do_you_consume_tea, "Do you consume tea Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    
    
    WebUtil.selectByindex(How_Much_Coffee, 1, "Less than 4 cups/ day");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.selectByindex(Which_ear_is_affected,5, "Which ear is affected? Button Clicked Successfully"); 
    
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.selectByindex(What_Is_The_Character_Of_Sound, 6, "What_Is_The_Character_Of_Sound select Successfully");
    
   
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Smoking, "Smoking Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Alcohol, "Alcohol Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Substance_Abuse, "Substance Abuse Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Ototoxic_Drug_history, "Ototoxic Drug history Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(Add_History_Button, "Add_History_Button Clicked Successfully");
    
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
    WebUtil.ClickMethod(dashborad, "After all columns are submitted the dashboard clicked again successfully");
    
    
	}
	
	
	
	
	
	
	

}
