package com.example.demo.base;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

import org.junit.Before;
import com.example.demo.NameController;
import com.example.demo.NameProperties;


public class NameBase {

	@Before
	public void setup() {
		NameProperties nameProperties = new NameProperties();
		nameProperties.setName("ZTI");
		RestAssuredMockMvc.standaloneSetup(new NameController(nameProperties));
	}
}
