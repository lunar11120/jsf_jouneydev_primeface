package com.jou.service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = EmployeeDialog.CONTROLLER_NAME)
@SessionScoped
public class EmployeeDialog {
	public static final String CONTROLLER_NAME = "employeeDialog";
	  String msg1 = "Employee Dialog Tutorial";
	  private List<String> selectedEmployees;
	  private List<String> employees;

	  @PostConstruct
	  public void init() {
	      employees = Arrays.asList("MR.Warhki Minu" , "MR.Churapong Bookam" , "MS.Viranda pongthorn");
	  }	
	   
	  public List<String> getSelectedEmployees() {
		return selectedEmployees;
	}

	public void setSelectedEmployees(List<String> selectedEmployees) {
		this.selectedEmployees = selectedEmployees;
	}



	public List<String> getEmployees() {
		return employees;
	}



	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}



	public String getTime() {
	      return LocalTime.now().toString();
	  }	
	
	
	public String getMsg1() {
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public static String getControllerName() {
		return CONTROLLER_NAME;
	}
	
	
	
	

}
