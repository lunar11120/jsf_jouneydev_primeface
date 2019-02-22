package com.jou.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jou.dao.SL2019_DAO;
import com.jou.model.SL2019Bean;

@ManagedBean(name = "userBean" , eager = true)
@SessionScoped
public class UserBean {
	String userName;
	String msgText;
	String selectItemType;
	SL2019Bean selectItem;
	Double sumPayment;
	List<SL2019Bean> selectDataTableList;
	List<SL2019Bean> mainDataTableList;
	
	SL2019_DAO sl2019_dao = new SL2019_DAO();
	
    @PostConstruct
	public void init() {
    	
    	//Debug show when Method init
		@SuppressWarnings("unused")
		String METHOD_NAME = "init";
        mainDataTableList= new ArrayList<SL2019Bean>();
        try {
            //Test Generatelist
        	
        	mainDataTableList = sl2019_dao.genDataSL2019Bean();
        	System.out.println("sample data from init"+mainDataTableList.get(0).toString());
		} catch (Exception e) {System.out.println("init error");}
	}// init end here	
	
	public String outcome() {
		System.out.println("Invoking outcome : userBean");
		System.out.println("userName value :"+userName);
		return "result";
	}
	
	public String selectDenyItemDetail() {
		String methodName = "Invoking selectDenyITem";
		System.out.println(methodName);
		System.out.println("select item :"+selectItem.toString());
		System.out.println("sslectITEMType : "+selectItemType);
		return methodName;
	}
	
	@SuppressWarnings("unused")
	public String selectItemToApprove() {
		@SuppressWarnings("unused")
		String METHOD_NAME = "selectItemToApprove";
		String methodName = "Invoking selectItem To Approve";
		
		System.out.println(methodName);
		System.out.println("Approve : select item :"+selectItem.toString());
		System.out.println("Approve :sslectITEMType : "+selectItemType);
		
		try 
		{
            msgText = "";
            selectDataTableList = new ArrayList<SL2019Bean>();
            
            sumPayment = 250125800.225;	
            String period = "";
            @SuppressWarnings("unused")
			Integer typeFund = null;
            @SuppressWarnings("unused")
			String appealFlag = "";

            //period input check  ----------------------
            if (selectItem != null && selectItem.getApprDate() != null) 
            {
                if (selectItem.getApprDate().trim().length() > 8) {
                    period = selectItem.getApprDate().trim().substring(0, 8);
                } else {
                    period = selectItem.getApprDate().trim();
                }
            }  
            System.out.println("show period : "+period);
            
            //appealFlag check  ----------------------
            if ("Data Normal".equalsIgnoreCase(selectItemType)) {
                appealFlag = "0";
            } else if ("Data Retry".equalsIgnoreCase(selectItemType)) {
                appealFlag = "1";
            }   
            
            // type fund check ----------------------
            if (selectItem != null && selectItem.getType() != null) {typeFund = 0;}
            
            System.out.println("update : EBUDGETSENDLOCAL "+">> period="+period+" : >> typeFund="+typeFund+" >> userid = 10221455");
            System.out.println("Insert To Tmp Success."); 
            
            selectDataTableList = sl2019_dao.genData_Select_SL2019();
            System.out.println("sample data selectDataTableList"+selectDataTableList.get(0).toString());
            
		} catch (Exception e) {e.getMessage().toString();}
		return methodName;
	}
	
	public void approve() {
		System.out.println("Invoking Approve button");
	}
	
	public String getSelectItemType() {
		return selectItemType;
	}

	public void setSelectItemType(String selectItemType) {
		this.selectItemType = selectItemType;
	}

	public SL2019Bean getSelectItem() {
		return selectItem;
	}

	public void setSelectItem(SL2019Bean selectItem) {
		this.selectItem = selectItem;
	}

	public List<SL2019Bean> getMainDataTableList() {
		return mainDataTableList;
	}

	public void setMainDataTableList(List<SL2019Bean> mainDataTableList) {
		this.mainDataTableList = mainDataTableList;
	}

	public SL2019_DAO getSl2019_dao() {
		return sl2019_dao;
	}

	public void setSl2019_dao(SL2019_DAO sl2019_dao) {
		this.sl2019_dao = sl2019_dao;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMsgText() {
		return msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public Double getSumPayment() {
		return sumPayment;
	}

	public void setSumPayment(Double sumPayment) {
		this.sumPayment = sumPayment;
	}

	public List<SL2019Bean> getSelectDataTableList() {
		return selectDataTableList;
	}

	public void setSelectDataTableList(List<SL2019Bean> selectDataTableList) {
		this.selectDataTableList = selectDataTableList;
	}
	
	
}
