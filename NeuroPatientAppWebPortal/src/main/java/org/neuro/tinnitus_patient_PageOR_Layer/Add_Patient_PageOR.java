package org.neuro.tinnitus_patient_PageOR_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Patient_PageOR {

	
	@FindBy(xpath = "//h3[text()='Add New Patient']")
	protected   WebElement AddNewPatient;


	@FindBy(xpath = "//select[@name='patientType']")	
	protected   WebElement Tinnitus;
	
	
	@FindBy(id = "gender")	
	protected   WebElement Mr;
	
	
	
     @FindBy(id="prefix")
     protected WebElement prifix;

	@FindBy(id = "FirstName")
	protected   WebElement FastName;

	@FindBy(id = "LastName")
	protected   WebElement LastName;


	@FindBy(id = "age")
	protected   WebElement PatientAge;

	@FindBy(id = "gender")
	protected  WebElement Gender1 ;
	
	@FindBy(id = "height")
	protected   WebElement Patient_Height;

	@FindBy(id="weight")
	protected WebElement Weight;
	
	@FindBy(id = "Phone")
	protected WebElement Add_Mobile_Number;
	

	@FindBy(id = "Email")
	protected   WebElement PatientGmail;
	
	
	@FindBy(id = "HospID")
	protected   WebElement HospitalPatientID;

	@FindBy(id = "Address")
	protected   WebElement PatientAddress;

	@FindBy(id = "City")
	protected   WebElement PatientCity;

	@FindBy(id = "ZipCode")
	protected   WebElement PatientPinNumber;

	@FindBy(id = "appointment")
	protected   WebElement Appointment_Date;

	@FindBy(xpath ="//div[@class='datepicker-days']//table//tr//td[@class='active day']")
	protected   WebElement DateClick;

	@FindBy(id = "Reference")
	protected  WebElement referred_By;
 
	@FindBy(id = "Refdoctor")
	protected  WebElement Doctor_Name;
 
	
	
	@FindBy(id = "tech")
	protected  WebElement selectTechician;
	
//	@FindBy(xpath = "input[@id='comment']")	
//	protected  WebElement Comment;
	
//	@FindBy(xpath  = "div[@class='addPatientForm']preceding-sibling::select[@id='tech']")
//	protected WebElement selectTechician;


//	@FindBy(xpath="input[@id='Prosthetist']")
//	protected WebElement Physiotherapist;
//
//	@FindBy(xpath="input[@id='Physiotherapist']")
//	protected WebElement Prosthetist;
//
//	@FindBy(xpath="input[@id='TestDoneBy']")
//	protected WebElement Test_Done_By;
//	
//	
//	@FindBy(xpath="span[@class='box']")
//	protected WebElement RGHS_Patient;
//
    @FindBy(xpath="//input[@type='submit']")
	protected WebElement Submit_Button;

   @FindBy(xpath = "//div[@title='Copy PatientID']")
   protected WebElement getID;
   @FindBy(xpath = "//span[text()='Dashboard']")
   protected WebElement dashborad;

}
