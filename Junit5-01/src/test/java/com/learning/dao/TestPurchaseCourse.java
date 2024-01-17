package com.learning.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.service.PackageCourse;

class TestPurchaseCourse {

	@Test
	void testproceedWithCourse() {
		
		PackageCourse pc =new PackageCourse();
		boolean status =pc.proceedWithCourse(new JavaCourse());
		assertFalse(status);
		
		
	}

}
