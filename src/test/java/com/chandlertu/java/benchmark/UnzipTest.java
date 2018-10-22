package com.chandlertu.java.benchmark;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class UnzipTest {

	@Test
	public void test() {
		Path path = Paths.get("data/5710_39_2339227_17_40000_20170914132234.788.zip");
		String pathString = path.toAbsolutePath().toString();

		long t1 = System.nanoTime();

		UnZip2.unzip(pathString);

		long t2 = System.nanoTime();
		System.out.println(t2 - t1);
	}

}
