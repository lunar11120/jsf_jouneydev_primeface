package com.jou.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ListenerView {
	private String text1;

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}
	
	public void handleKeyEvent() {
		text1 = text1.toUpperCase();
	}
	
}
