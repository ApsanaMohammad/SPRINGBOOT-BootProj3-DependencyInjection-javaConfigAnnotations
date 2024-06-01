package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("stud")
public class Student {
	
	@Inject
	@Named("courseid")
    private ICourseMaterial material;
	
	public void preparation(String examName) {
		System.out.println("preparation started for "+examName);
		String cc=material.courseContent();
		double p=material.price();
		System.out.println("preparation going on using "+cc+"and its price is "+p);
		System.out.println("preparation is completed for exam");
	}
}
