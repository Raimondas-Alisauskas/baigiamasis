package com.vcs.examples.spring.RestTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestService {

	@RequestMapping("/")
	public String index() {
		return "{\"msg\" : \"I'm alive!!!\"}";
	}

}
