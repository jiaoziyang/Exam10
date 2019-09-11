package com.jzy.test;

import java.util.Date;

import org.junit.Test;

import com.jzy.utils.DateUtils;

public class TestDemo {

	@Test
	public void testDemo1() {
		
		int age = DateUtils.getAge(new Date());
		System.out.println(age);
	}
	
}
