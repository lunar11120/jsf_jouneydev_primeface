package com.jou.controller;

import java.awt.MenuItem;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSeparator;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
@SessionScoped
public class MenuManagedBean {
	
	private MenuModel menumodel = new DefaultMenuModel();
	private MenuModel menu = new DefaultMenuModel();
	
	public String openAction(){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Open action has activiated asynchrounsly !"));
		return "";
	}
	
	public String openEdit() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Edit Content"));
		return "";
	}
	
	public void genMenu() {
		DefaultSubMenu sub1 = new DefaultSubMenu("s1 menu");
		DefaultSubMenu sub2 = new DefaultSubMenu("help option");
		
		DefaultMenuItem $open = new DefaultMenuItem("open file");
		DefaultMenuItem $edit = new DefaultMenuItem("edit option");
		DefaultMenuItem $exit = new DefaultMenuItem("exit menu");
		
		sub1.addElement($open);
		sub1.addElement($edit);
		sub2.addElement($exit);
		
		menumodel.addElement(sub1);
		menumodel.addElement(sub2);
	}
	
	public MenuManagedBean(){
		// Create submenu
		DefaultSubMenu file = new DefaultSubMenu("File");
		// Create submenu
		DefaultSubMenu help = new DefaultSubMenu("Help");
		// Create menuitem
		DefaultMenuItem open = new DefaultMenuItem("Open");
		// Create menuitem
		DefaultMenuItem edit = new DefaultMenuItem("Edit");
		// Create menuitem
		DefaultMenuItem exit = new DefaultMenuItem("Exit");

		// Create menuitem
		DefaultMenuItem about = new DefaultMenuItem("About Primefaces");
		// Create menuitem
		DefaultMenuItem contact = new DefaultMenuItem("Contact Us");
		// Create menuitem
		DefaultMenuItem helpMenuItem = new DefaultMenuItem("Help");		

		// Determine menuitem action
		open.setCommand("#{menuManagedBean.openAction}");

		// Associate menuitem with submenu
		file.addElement(open);
		file.addElement(edit);
		file.addElement(new DefaultSeparator());
		file.addElement(exit);

		help.addElement(about);
		help.addElement(contact);
		help.addElement(new DefaultSeparator());
		help.addElement(helpMenuItem);

		// Associate submenu with menu
		menu.addElement(file);
		menu.addElement(help);
	}

	public MenuModel getMenu() {
		return menu;
	}

	public void setMenu(MenuModel menu) {
		this.menu = menu;
	}
	

	public MenuModel getMenumodel() {
		return menumodel;
	}

	public void setMenumodel(MenuModel menumodel) {
		this.menumodel = menumodel;
	}
	
	
}