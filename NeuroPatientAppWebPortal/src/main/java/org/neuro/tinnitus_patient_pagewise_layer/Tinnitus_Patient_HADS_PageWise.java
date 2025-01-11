package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.Tinnitus_Patient_HADS_Page_OR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class Tinnitus_Patient_HADS_PageWise extends Tinnitus_Patient_HADS_Page_OR{

	
WebGenericMethod WebUtil =WebGenericMethod.getObject();


	public Tinnitus_Patient_HADS_PageWise() {
		
		PageFactory.initElements(WebUtil.getDriver(),this);
		
	}
	
	public void HADS() {
		
		WebUtil.ClickMethod(HADS_Button, "HADS_Button clicked Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_1, "Most of the time ","Most of the time Selected  Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_2, "Not quite so much","Not quite so much Selected  Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_3, "Very definitely and quite badly","Very definitely and quite badly Selected  Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_4, "As much as I always could","As much as I always could Selected  Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_5, "A great deal of the time","A great deal of the time Selected  Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_6, "Not at all ","Not at all Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_7, "Not at all ","Not at all Selected  Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_8, "Not at all ","Not at all Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_9, "Not at all ","Not at all Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_10, "Definitely","Not at all Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_11, "Not at all ","Not at all Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_12, "As much as I ever did","As much as I ever did Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_13, "Most of the time","Most of the time Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.inputData(HADS_14, "Sometimes  ","Sometimes Selected Successfully");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebUtil.ClickMethod(HADS_SAVE_BUTTON, "HADS_SAVE_BUTTON Clicked Successfully");


		try {
			Thread.sleep(2020);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
}
