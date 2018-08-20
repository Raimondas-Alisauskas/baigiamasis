package com.vcs.examples.resource.reader;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalUnit;

import com.vcs.examples.mvn.parser.NameParser;

public class Reader {

	public static void main(String... strings) throws IOException {

		InputStream str = Reader.class.getResourceAsStream("/file.txt");

		System.out.println(str.available());

		if ((new Integer(1).equals(new Integer(1)))) {
			System.out.println("wow");
		}

		System.out.println("done " + (new NameParser()));

		LocalDateTime aa = LocalDateTime.of(2018, Month.APRIL, 13, 12, 0);
		LocalDateTime bb = LocalDateTime.of(2018, Month.APRIL, 26, 17, 0);

		Duration dur = Duration.between(aa, bb);
		
		Duration dd = Duration.ofHours(345);

		System.out.println("+ " + dur.toHours());
		System.out.println("+ " + dd.toHours());

	}

}
