package com.vcs.examples.mvn.parser;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vcs.examples.mvn.tests.KlaidosTipas;
import com.vcs.examples.mvn.tests.NameUniqService;
import com.vcs.examples.mvn.tests.NevalidusVardas;

/**
 * Kai norim skip'int testus :)
 * 
 * <pre>
 * mvn clean package -DskipTests
 * </pre>
 * 
 * 
 * <pre>
 * mvn clean package -Dmaven.test.skip=true
 * </pre>
 * 
 * 
 * 
 */

public class NameParserTest {

	private NameParser parser;
	private NameUniqService service;

	@Before
	public void init() {

		service = mock(NameUniqService.class);
		parser = new NameParser(service);
		
		when(service.checkUniq(anyString())).thenReturn(true);
		
	}

	// @After
	// public void end() {
	// parser = null;
	// }

	@Test
	public void parseSucess() throws NevalidusVardas {
		
		Assert.assertEquals("Vardas", parser.parseUniqName("Vardas Pavarde"));
		Assert.assertEquals("vardas", parser.parseUniqName("vardas PAVARDE"));
		Assert.assertEquals("v", parser.parseUniqName("v p"));
		Assert.assertEquals("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV",
				parser.parseUniqName("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV p"));

	}
	
	@Test(expected = NevalidusVardas.class)
	public void parseFailsNull() throws NevalidusVardas {
		parser.parseUniqName(null);
	}

	@Test
	public void parseFails() {

		try {
			parser.parseUniqName(null);

			assertTrue(false);
		} catch (NevalidusVardas e) {
			Assert.assertEquals(KlaidosTipas.KRITINE, e.getTipas());
			Assert.assertNull(e.getVardas());
		}

	}

	@Test
	public void parseFails3in1() {

		try {
			parser.parseUniqName("a a s");

			fail("Jokio exception'o");

		} catch (NevalidusVardas e) {
			Assert.assertEquals("Zodziu kiekis netinka: 3", e.getMessage());
			Assert.assertNull(e.getVardas());
		}

	}
	
	
	@Test
	public void parseCheckServiceCall() throws NevalidusVardas {
		
		String name = "Oskaras";
		
		when(service.checkUniq(name)).thenReturn(false);
		//when(parser.validate(anyString())).thenReturn("Ona");
		
		parser.parseUniqName(name+" aaa");
		
		verify(service).createUniq("Ona");
	}

}