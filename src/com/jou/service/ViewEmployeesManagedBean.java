package com.jou.service;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jou.model.Employee;


@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {
	private List<Employee> employees = new ArrayList<Employee>();
	String content1 = "employee test Page";
	String content2 = "This is SL2019 Mock Simple Page";

	public ViewEmployeesManagedBean(){

	}

	@PostConstruct
	public void populateEmployeeList(){
		for(int i = 1 ; i <= 5 ; i++){
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("name & description Employee#"+i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getContent1() {
		return content1;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}
	
	
}