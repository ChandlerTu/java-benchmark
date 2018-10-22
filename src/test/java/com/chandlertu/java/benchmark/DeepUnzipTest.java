package com.chandlertu.java.benchmark;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class DeepUnzipTest {

	@Test
	public void test() {
		Path path = Paths.get("data/1.zip");
		String pathString = path.toAbsolutePath().toString();

		DeepUnZip deepUnZip = new DeepUnZip();

		long t1 = System.nanoTime();

		deepUnZip.unzip(pathString);

		long t2 = System.nanoTime();
		System.out.println(t2 - t1);
	}

}
