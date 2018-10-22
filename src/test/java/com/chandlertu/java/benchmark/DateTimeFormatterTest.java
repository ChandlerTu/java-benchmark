package com.chandlertu.java.benchmark;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Test;

public class DateTimeFormatterTest {

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	@Test
	public void testDateTimeFormatter() {
		long start = System.nanoTime();

		LocalDateTime localDateTime = LocalDateTime.parse("1967-07-16 03:32:00.123", formatter);
		long epochMilli = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

		long time = System.nanoTime() - start;

		System.out.println(time);
		System.out.println(epochMilli);
	}

	@Test
	public void testDateFormat() throws ParseException {
		long start = System.nanoTime();

		Date date = format.parse("1967-07-16 03:32:00.123");
		long epochMilli = date.getTime();

		long time = System.nanoTime() - start;

		System.out.println(time);
		System.out.println(epochMilli);
	}

}
