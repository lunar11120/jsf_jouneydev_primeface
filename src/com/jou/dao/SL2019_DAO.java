package com.jou.dao;

import java.util.ArrayList;
import java.util.List;

import com.jou.model.List101;
import com.jou.model.SL2019Bean;

public class SL2019_DAO {
	
	//sample List String 1 
	public List<List101> generateExampleList(){
		List<List101> ar101 = new ArrayList<List101>();
		List101 a01 = new List101("101", "Bloombing Company", "BBN");
		List101 a02 = new List101("102", "Zheng Company", "ZC");
		List101 a03 = new List101("103", "Route 1015 corp", "ROU");
		ar101.add(a01);
		ar101.add(a02);
		ar101.add(a03);
		
		System.out.println("GenerateExampleList invoking "+ar101.size());

		return ar101;
	}	
	
	public List<SL2019Bean> genDataSL2019Bean(){
		List<SL2019Bean> mainDataTableList = new ArrayList<SL2019Bean>();
		
		SL2019Bean sb1 = new SL2019Bean();
		sb1.setProjectCode("1025330");
		sb1.setStatus("Y");
		sb1.setApprDate("20180515");
		sb1.setSendStatus("PASS");
		sb1.setType("obj1");
		sb1.setAppealSendStatus("PASS");
		sb1.setAllowNormalSelectFlag(false);
		
		SL2019Bean sb2 = new SL2019Bean();
		sb2.setProjectCode("1114070");
		sb2.setStatus("Y");
		sb2.setApprDate("20180624");
		sb2.setSendStatus("PASS");
		sb2.setType("obj2");
		sb2.setAppealSendStatus("PASS");
		sb2.setAllowNormalSelectFlag(true);

		
		SL2019Bean sb3 = new SL2019Bean();
		sb3.setProjectCode("1315580");
		sb3.setStatus("Y");
		sb3.setApprDate("20180704");
		sb3.setSendStatus("NOTPASS");
		sb3.setType("obj3");
		sb3.setAppealSendStatus("NOTPASS");
		sb3.setAllowNormalSelectFlag(true);
		sb3.setAllowAppealSelectFlag(true);
		
		SL2019Bean sb4 = new SL2019Bean();
		sb4.setProjectCode("1855500");
		sb4.setStatus("Y");
		sb4.setApprDate("20180706");
		sb4.setSendStatus("NOTPASS");
		sb4.setType("obj4");
		sb4.setAppealSendStatus("NOTPASS");
		sb4.setAllowNormalSelectFlag(true);
		sb4.setAllowAppealSelectFlag(true);		
		
		//Generate  sample Data
		mainDataTableList.add(sb1); mainDataTableList.add(sb2); mainDataTableList.add(sb3); mainDataTableList.add(sb4);
		return mainDataTableList;
	}
	
	public List<SL2019Bean> genData_Select_SL2019(){
		List<SL2019Bean> mainDataTableList = new ArrayList<SL2019Bean>();
		
		SL2019Bean sb1 = new SL2019Bean();
		sb1.setApprDate("20180515");
		sb1.setBudgetCode("0125-3258-3221");
		sb1.setHcode("12510");
		sb1.setPayment(1252.25);

		
		SL2019Bean sb2 = new SL2019Bean();
		sb2.setApprDate("20180515");
		sb2.setBudgetCode("7805-3278-0001");
		sb2.setHcode("12510");
		sb2.setPayment(34500.25);
		
		SL2019Bean sb3 = new SL2019Bean();
		sb3.setApprDate("20180515");
		sb3.setBudgetCode("0105-1058-3221");
		sb3.setHcode("13010");
		sb3.setPayment(125000.25);
		
		//Generate  sample Data
		mainDataTableList.add(sb1); mainDataTableList.add(sb2); mainDataTableList.add(sb3);
		return mainDataTableList;
	}	
	
	public void testSL2019Method() {
		System.out.println("SL2019_DAO Method run test");
	}

}
