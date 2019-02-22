package com.jou.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jou.model.AmCheck;

public class AmCheck_service {
	
	AmCheck_DAO bean = new AmCheck_DAO();
	
	public List<AmCheck> findAll(){
		List<AmCheck> amList = new ArrayList<AmCheck>();
		try {
			amList = bean.daoFindAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amList;
		
	}
	
	public String save(AmCheck amCheck) throws SQLException {
		String statusInsert = bean.insertAmCheck(amCheck);
		return statusInsert;
	}
}
