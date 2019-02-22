package com.jou.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
public class MenuView2 {
	private MenuModel model;
	
	@PostConstruct
	public void init() {
		model = new DefaultMenuModel();
		
		//subMenu1 tutorial path1
		DefaultSubMenu firstSubmenu = new DefaultSubMenu("For Tutorial P1");
		
		DefaultMenuItem menuitem = new DefaultMenuItem("Page 1");
		String url1 = "http://localhost:8080/jsf_jouneydev_primeface/faces/page1.xhtml";
		menuitem.setUrl(url1);		
		firstSubmenu.addElement(menuitem);
		
		menuitem = new DefaultMenuItem("Page 3");
		String url2 = "http://localhost:8080/jsf_jouneydev_primeface/faces/page3.xhtml";
		menuitem.setUrl(url2);
		firstSubmenu.addElement(menuitem);
		
		model.addElement(firstSubmenu);
	}
	
    public MenuModel getModel() {
		return model;
	}

	public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
