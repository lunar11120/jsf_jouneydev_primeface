package com.jou.controller;


import java.io.Serializable;

import com.jou.utillity.JsfUtil;

/**
 *
 * @author Aekasit
 */
@SuppressWarnings("serial")
public abstract class MethodController implements Serializable {

    public void openEditPage(String page) {
        NavigationController obj = (NavigationController) JsfUtil.getManagedBean(NavigationController.CONTROLLER_NAME);
        obj.nextPage(page, null);
    }

    public void openViewPage(String page) {
        NavigationController obj = (NavigationController) JsfUtil.getManagedBean(NavigationController.CONTROLLER_NAME);
        obj.nextPage(page, null);
    }

    public void openCreatePage(String page) {
        NavigationController obj = (NavigationController) JsfUtil.getManagedBean(NavigationController.CONTROLLER_NAME);
        obj.nextPage(page, null);
    }

    public abstract void init() throws Exception;

    public abstract void findAll() throws Exception;

    public abstract void find() throws Exception;

    public abstract void insert() throws Exception;

    public abstract void update() throws Exception;

    public abstract void delete() throws Exception;

    public abstract void cancel() throws Exception;

    public abstract void reportPDF() throws Exception;

    public abstract void reportExcel() throws Exception;
}
