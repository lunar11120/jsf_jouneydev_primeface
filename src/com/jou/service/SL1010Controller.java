package com.jou.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jou.controller.MethodController;
import com.jou.dao.GenerateData2019;
import com.jou.dao.MasterFacade;

@SuppressWarnings("serial")
@ManagedBean(name = SL1010Controller.CONTROLLER_NAME)
@SessionScoped
public class SL1010Controller extends MethodController {

	public static final String CONTROLLER_NAME = "sl1010Controller";
	public String page;
	public List<String> data2019;
	public List<String> gyearList;
    public String gyearS;
    
    GenerateData2019 genernateData2019 = new GenerateData2019();
    MasterFacade masterFacade = new MasterFacade();
    
    @PostConstruct
	@Override
	public void init() {
    	
        @SuppressWarnings("unused")
		String METHOD_NAME = "init";
        System.out.println("method INIT : ====> run");
            
            gyearList = new ArrayList<String>();
            List<String> gList = masterFacade.findGyearMBudgetOrfV();
            for (int i = 0; i < gList.size(); i++) {
                gyearList.add(gList.get(i));
                gyearS = gList.get(i);
            }
            
            System.out.println("Init parameter =====>");
            System.out.println("Gyears ="+gList.toString());
            try {
				findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            

	}

	@Override
	public void findAll() throws Exception {
		String METHOD_NAME = "findAll";
		System.out.println("findall Method =====>" +METHOD_NAME);
		page="MAIN";
		
		data2019 = genernateData2019.find2019data();
		System.out.println("show data data2019 size :"+data2019.size());
		System.out.println("show data data2019 samp1 :"+data2019.get(0).toString());
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

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public List<String> getGyearList() {
		return gyearList;
	}


	public String getGyearS() {
		return gyearS;
	}

	public MasterFacade getMasterFacade() {
		return masterFacade;
	}

	public void setMasterFacade(MasterFacade masterFacade) {
		this.masterFacade = masterFacade;
	}

	public static String getControllerName() {
		return CONTROLLER_NAME;
	}
	
	

}//end managedBean
