package com.nt.beans;

import javax.inject.Named;

@Named("ui")
public class UICourseMaterial implements ICourseMaterial {
	
	

	public UICourseMaterial() {
		System.out.println("UI course material");
	}

	public String courseContent() {
		return "html,css,javascript";
	}

	public double price() {
		
		return 300;
	}

}
