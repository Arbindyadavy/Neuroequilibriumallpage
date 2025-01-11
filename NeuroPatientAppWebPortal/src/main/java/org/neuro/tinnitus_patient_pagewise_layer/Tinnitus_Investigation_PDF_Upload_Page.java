package org.neuro.tinnitus_patient_pagewise_layer;

import org.neuro.tinnitus_patient_PageOR_Layer.Tinnitus_Investigation_PDF_Upload_Page_OR;
import org.openqa.selenium.support.PageFactory;

import GenericMethod.WebGenericMethod;

public class Tinnitus_Investigation_PDF_Upload_Page extends Tinnitus_Investigation_PDF_Upload_Page_OR{


public WebGenericMethod WebUtil= WebGenericMethod.getObject();



public Tinnitus_Investigation_PDF_Upload_Page() {
	PageFactory.initElements(WebUtil.getDriver(),this);
	
}

















}
