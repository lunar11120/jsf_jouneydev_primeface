package com.jou.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jou.controller.MethodController;
import com.jou.dao.SL2019_DAO;
import com.jou.model.List101;
import com.jou.model.SL2019Bean;

@SuppressWarnings("serial")
@ManagedBean(name=SL2019Controller.CONTROLLER_NAME)
@SessionScoped
public class SL2019Controller extends MethodController{
	public static final String CONTROLLER_NAME = "sL2019Controller";
	
	private String msgText;
	private String msgText2;
	private List<SL2019Bean> mainDataTableList;
	private List<SL2019Bean> selectDataTableList;
    private SL2019Bean selectItem;
    private List<List101> list101;
    
    SL2019_DAO sl2019_dao = new SL2019_DAO();
    
    @PostConstruct
	@Override
	public void init() {
    	
    	//Debug show when Method init
		String METHOD_NAME = "init";
		msgText = "Init Controller Run complete";
		msgText2 = "Data from Bean SL2019";
        System.out.println("method INIT : ====> " +SL2019Controller.CONTROLLER_NAME+" : ["+METHOD_NAME+"]");   
        list101 = new ArrayList<List101>();
        try {
            //Test Generatelist
        	
        	list101 = sl2019_dao.generateExampleList();
        	sl2019_dao.testSL2019Method();
        	findAll();
		} catch (Exception e) {
			System.out.println("init error");
		}

		
	}
	@Override
	public void findAll() throws Exception {

		String METHOD_NAME = "findAll";
		 mainDataTableList = new ArrayList<SL2019Bean>();
		 try {
			//s List<TypedMap> listType = mRegisterApprDAOLocal.findAllSL2019();
			 System.out.println("method FindAll : ====> " +SL2019Controller.CONTROLLER_NAME+" : ["+METHOD_NAME+"]"); 
			 mainDataTableList = sl2019_dao.genDataSL2019Bean();
		} catch (Exception e) {
			System.out.println("method FINDALL error : ");
		}
		
	}
	
	public void setCheck(SL2019Bean selectItem) throws Exception {
		System.out.println("setCheck Object "+selectItem.toString() );
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
	public List<SL2019Bean> getMainDataTableList() {
		return mainDataTableList;
	}
	public void setMainDataTableList(List<SL2019Bean> mainDataTableList) {
		this.mainDataTableList = mainDataTableList;
	}
	public SL2019Bean getSelectItem() {
		return selectItem;
	}
	public void setSelectItem(SL2019Bean selectItem) {
		this.selectItem = selectItem;
	}

	public List<List101> getList101() {
		return list101;
	}
	public void setList101(List<List101> list101) {
		this.list101 = list101;
	}
	public SL2019_DAO getSl2019_dao() {
		return sl2019_dao;
	}
	public void setSl2019_dao(SL2019_DAO sl2019_dao) {
		this.sl2019_dao = sl2019_dao;
	}
	public static String getControllerName() {
		return CONTROLLER_NAME;
	}
	public String getMsgText() {
		return msgText;
	}
	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}
	public String getMsgText2() {
		return msgText2;
	}
	public void setMsgText2(String msgText2) {
		this.msgText2 = msgText2;
	}
	public List<SL2019Bean> getSelectDataTableList() {
		return selectDataTableList;
	}
	public void setSelectDataTableList(List<SL2019Bean> selectDataTableList) {
		this.selectDataTableList = selectDataTableList;
	}
	

}
