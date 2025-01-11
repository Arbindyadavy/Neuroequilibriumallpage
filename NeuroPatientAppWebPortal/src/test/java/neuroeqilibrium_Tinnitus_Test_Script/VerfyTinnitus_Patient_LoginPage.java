package neuroeqilibrium_Tinnitus_Test_Script;

import org.neuro.tinnitus_patient_pagewise_layer.Add_Patient_PageWise;
import org.neuro.tinnitus_patient_pagewise_layer.LoginPage;
import org.neuro.tinnitus_patient_pagewise_layer.Patient_Investigation_PageWise;
import org.neuro.tinnitus_patient_pagewise_layer.Patient_Tinnitus_History;
import org.neuro.tinnitus_patient_pagewise_layer.Tinnitus_Investigation_PageWise;
import org.neuro.tinnitus_patient_pagewise_layer.Tinnitus_Patient_HADS_PageWise;
import org.testng.annotations.Test;

import GenericMethod.Based_Class;

public class VerfyTinnitus_Patient_LoginPage extends Based_Class{

	
	
	 
	@Test(priority = 0)
	public void VerfyTest_Login_Page() {
		
		LoginPage login=new LoginPage();
		login.ValidLogin("DemoFixedCostClinic","Pass@1234");
	

	}
	
	@Test(priority = 1)
	public void VerfyTest_Tinnitus_Add_Patient() {
		Add_Patient_PageWise addpatient=new Add_Patient_PageWise();
		addpatient.Add_Patient();
		
	}
	
	@Test(priority = 2)

	public void VerfyTest_Tinnitus_History() {
		
		Patient_Tinnitus_History history= new Patient_Tinnitus_History();
		history.P_History();
	
	
	}
	
	
	@Test(priority = 3)
	public void VerfyTest_Tinnitus_Investigation() throws Exception {
//		LoginPage login=new LoginPage();
//		login.ValidLogin("DemoFixedCostClinic","Pass@1234");
		Patient_Investigation_PageWise investigation=new Patient_Investigation_PageWise();
		investigation.P_investigation();	

	
	}
	
	@Test(priority =4)
	public void THI() throws Exception {
		
		Patient_Investigation_PageWise investigation=new Patient_Investigation_PageWise();	
		investigation.Patient_THI();
	
	}
	
	@Test(priority =5)
    public void  VerfyTest_Tinnitus_HADS() {
		     
		
		Tinnitus_Patient_HADS_PageWise hads=new Tinnitus_Patient_HADS_PageWise();
		hads.HADS();
}
	
	@Test(priority =6)
	public void VerfyTest_Tinnitus_Investgation() throws Exception {
		
//		LoginPage login=new LoginPage();
//		login.ValidLogin("DemoFixedCostClinic","Pass@1234");
//		Patient_Investigation_PageWise investigation=new Patient_Investigation_PageWise();
//		investigation.P_investigation();	
		Tinnitus_Investigation_PageWise investgation= new Tinnitus_Investigation_PageWise();
		investgation.Patient_Investigation();
	}
	
	
	
	@Test(priority =7)
	public void VerfyTest_Tinnitus_Investgation_PDF_Upload() {
		
		
	}
	
	
	
	
	
	
	
	
	
}
