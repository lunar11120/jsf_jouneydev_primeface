package com.jou.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean(name=NavController.CONTROLLER_NAME)
@SessionScoped
public class NavController implements Serializable {
	public static final String CONTROLLER_NAME = "navController";
	
	public String moveToPage1() {
		return "page1";
	}
	
	public String moveToPage2() {
		return "page2_listener";
	}
	
	public String moveToPage3() {
		return "page3";
	}	
	
	public String moveToPage4() {
		return "page4";
	}	
	public String moveToPage5() {
		return "page5";
	}	
	public String moveToPage6() {
		return "page6";
	}	
	public String moveToPage7() {
		return "page7";
	}	
	public String moveToPage8() {
		return "page8";
	}		
	public String moveToPage9() {
		return "page9";
	}	
	public String moveToPage14() {
		return "page14";
	}	
	public String moveToPage15() {
		return "page15";
	}		
	
	public String moveToPage16() {
		return "page16_bdo_database_index";
	}

	public String moveTo_Site2_page1() {
		return "/site2/s2page1";
	}	
	
	public String backToIndex() {
		return "index";
	}
	
	public String goPrimeface1() {
		return "prime1";
	}
	
	
	//Test Workshop Mock SL2019
	public String moveToSL2019() {
		return "pages/master/sl2019";
	}	

	
	
}
