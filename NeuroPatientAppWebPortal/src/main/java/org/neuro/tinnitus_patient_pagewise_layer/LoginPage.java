package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.LoginPage_OR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class LoginPage extends LoginPage_OR{

	WebGenericMethod webUtil=WebGenericMethod.getObject();
	
	
	
public LoginPage() {
	PageFactory.initElements(webUtil.getDriver(),this);
	
}
	
public void ValidLogin(String name,String password) {
	
	webUtil.inputData(locUser,name, "enter username textbox");
		
		try {
			Thread.sleep(1100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
		webUtil.inputData(locpassword, password, "enter userpassword in userpassword textbox");
		         
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		webUtil.ClickMethod(chick_box_click, "chick_box_click on click");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	webUtil.ClickMethod(Login_Button_Click, "Login_Button_Click on click");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
	
		
		//	webUtil.inputData(hhhl, "", "");
		}
	
		
	
	
	}
	
}
