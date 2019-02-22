package com.jou.frontcontroller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "message" , eager = true)
@SessionScoped
public class Message {
	private String msg2 = "bean Inject : MSG2 Hello OK";

	public String getMsg2() {
		return msg2;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	
	
}
