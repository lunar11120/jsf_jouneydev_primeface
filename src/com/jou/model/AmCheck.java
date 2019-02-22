package com.jou.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.NotEmpty;;

@Entity
public class AmCheck {
	
	int id;
	
	@NotEmpty(message="Name cannot be Empty")
	String name;
	
	@Size(min=1 , message="URL cannot be Empty")
	@URL(message="URL not valid")
	String url;
	Timestamp updatetime;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public String toString() {
		java.util.Date today = new java.util.Date();
		return "AmCheck OBject : [name=" + name + ", updatetime=" + today.toString()+" : "+today.getTime() + "]";
	}

	
}
