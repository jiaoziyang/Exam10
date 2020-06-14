package com.jzy.utils;

import java.util.Date;

import org.junit.Test;

// test1

public class DateUtils {

	@Test
	public static int getAge(Date src) {
		// TODO

		Date nowDate = new Date();

		long times = nowDate.getTime() - src.getTime();

		int age = (int) (times / 1000 / 60 / 60 / 24);

		return age;
	}

	public static int getDaysByFuture(Date future) {
		// TODO

		Date nowDate = new Date();

		long times = future.getTime() - nowDate.getTime();

		int age = (int) (times / 1000 / 60 / 60 / 24);

		return age;
	}

	public static int getDaysByDeparted(Date departed) {
		// TODO
		Date nowDate = new Date();

		long times = nowDate.getTime() - departed.getTime();

		int age = (int) (times / 1000 / 60 / 60 / 24);

		return age;
	}

}
