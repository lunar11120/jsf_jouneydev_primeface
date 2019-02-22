package com.jou.service;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jou.dao.AmCheck_service;
import com.jou.model.AmCheck;

@ManagedBean(name = "checkListController" , eager = true)
@SessionScoped
public class CheckListController {
	
	AmCheck_service bean = new AmCheck_service();
	
	List<AmCheck> amList;
	
	private AmCheck amCheck = new AmCheck();
	private String test1;
	private String message1 = "site Monitor 0101";

	@PostConstruct
	public void loadCheckList() {
		System.out.println("INIT : loadCheckList Run ====>");
		amList = bean.findAll();
	}
	
	public void saveAmCheckList() throws SQLException {
		String status1 = bean.save(amCheck);
		System.out.println(status1);
		amList = bean.findAll();
		message1 = "site Monitor 0101 : update data ";

	}
	
	public void setCheck(AmCheck amCheck) {
		System.out.println("invoking set check button : EDIT "+amCheck.toString());
	}

	public AmCheck_service getBean() {
		return bean;
	}

	public void setBean(AmCheck_service bean) {
		this.bean = bean;
	}

	public List<AmCheck> getAmList() {
		return amList;
	}

	public void setAmList(List<AmCheck> amList) {
		this.amList = amList;
	}


	public AmCheck getAmCheck() {
		return amCheck;
	}

	public void setAmCheck(AmCheck amCheck) {
		this.amCheck = amCheck;
	}


	public String getTest1() {
		return test1;
	}

	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	
}
