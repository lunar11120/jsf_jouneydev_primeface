package com.jou.dao;

import java.util.ArrayList;
import java.util.List;

public class MasterFacade {
	
	public List<String> findGyearMBudgetOrfV(){
		List<String> gyearList = new ArrayList<String>();
		gyearList.add("2017");
		gyearList.add("2018");
		gyearList.add("2019");
		return gyearList;
	}
}
