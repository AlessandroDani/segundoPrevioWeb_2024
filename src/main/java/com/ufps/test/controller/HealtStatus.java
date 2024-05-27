package com.ufps.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealtStatus {

	@GetMapping("status")
	public String status() {
		return "SERVIDOR ENCENDIDO";
	}
}
