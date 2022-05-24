package com.example.demo;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class NameServiceTest {

	@Test
	public void getNameTest() throws Exception {
		RestTemplate rest = mock(RestTemplate.class);
		doReturn("ZTI").when(rest).getForObject(eq("http://localhost:7070"), eq(String.class));
		NameService nameService = new NameService(rest);
		String name = nameService.getName();
		assertEquals(name, "ZTI");
	}

}