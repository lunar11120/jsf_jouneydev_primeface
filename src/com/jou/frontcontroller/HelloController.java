package com.jou.frontcontroller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.jou.service.HelloSpringService;

@ManagedBean
@SessionScoped
public class HelloController {
	
	@ManagedProperty(value="#{message}")
	private Message messageBean;
	
	@ManagedProperty(value="#{helloSpringService}")
	private HelloSpringService helloSpringService;
	
	private String msg1;
	public String sayHello() {
		if(messageBean != null) {
			//msg1=messageBean.getMsg2();
			msg1=helloSpringService.configBeanshow();
		}
		
		return msg1;
	}
	public String getMsg1() {
		msg1="msg1 : say Hello YEH";
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public Message getMessageBean() {
		return messageBean;
	}
	public void setMessageBean(Message messageBean) {
		this.messageBean = messageBean;
	}
	public HelloSpringService getHelloSpringService() {
		return helloSpringService;
	}
	public void setHelloSpringService(HelloSpringService helloSpringService) {
		this.helloSpringService = helloSpringService;
	}
	
	
}
