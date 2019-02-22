package com.jou.service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jou.controller.MethodController;

@SuppressWarnings("serial")
@ManagedBean(name=SL2019Controller.CONTROLLER_NAME)
@SessionScoped
public class SL3010Controller extends MethodController {
	public static final String CONTROLLER_NAME = "sL3010Controller";
	private String controllerName ;
	
	
	@Override
	public void init() throws Exception {
		System.out.println("SL3010 Set controllerNAme");
		controllerName = "sL3010Controller";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAll() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportPDF() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportExcel() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String getControllerName() {
		return controllerName;
	}

	public void setControllerName(String controllerName) {
		this.controllerName = controllerName;
	}
	

}
