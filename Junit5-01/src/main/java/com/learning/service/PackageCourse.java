package com.learning.service;

import com.learning.dao.Course;

public class PackageCourse {
	
	private Course course;
	
	public boolean proceedWithCourse(Course course) {  //Course course =new JavaCourse()
		return course.coursePurchased();
	}

}
