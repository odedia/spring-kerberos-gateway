package com.fha.kerberos.gateway.zuul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyRestController {
	@GetMapping("/hello")
	public String hi() {
		return "hi.";
	}
}
