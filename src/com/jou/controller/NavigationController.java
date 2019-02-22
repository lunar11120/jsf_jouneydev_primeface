package com.jou.controller;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * @author MR Aekasit Sengnualnim (Aek) Senior Software Developer
 *
 * SSC Solutions Co., Ltd. 333 Lao Peng Nguan Tower 1, 27th A Floor,
 * Viphavadee-Rangsit Road, Jomphol, Jatujak, Bangkok 10900 Thailand Tel :+66
 * (0) 2618 8638-9 Fax :+66 (0) 2618 8640 Mobile : +66 8912 90006 Skype :
 * s.aekasit Email : aekasit@tsoc.co.th / aekasit@sscs.co.th MSN :
 * s.aekasit@hotmail.com http://www.sscs.co.th/
 *
 * @create 21-09-2555 11:24:22
 */
@SuppressWarnings("serial")
@ManagedBean(name = NavigationController.CONTROLLER_NAME)
@SessionScoped
public class NavigationController implements Serializable {

    public static final String CONTROLLER_NAME = "navigationController";
    private String currentPage;


    public NavigationController() {
    }

    @PostConstruct
    public void init() {

        FacesContext cont = FacesContext.getCurrentInstance();
        cont.getViewRoot().getViewMap();

        currentPage = "blank";
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    @SuppressWarnings({ "unused", "rawtypes" })
	public void nextPage(String page, String controller) {

        FacesContext fc = FacesContext.getCurrentInstance();
        Map sessionMap = fc.getExternalContext().getSessionMap();

        this.currentPage = page;
    }
}