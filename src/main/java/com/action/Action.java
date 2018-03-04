package com.action;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SuppressWarnings("serial")
@SessionScoped
@ManagedBean(name= "act")
public class Action implements Serializable{

	private String locale= "en";

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	public String changeLang(String locale){
		this.locale= locale;
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(this.locale));
		return "";
	}
}
