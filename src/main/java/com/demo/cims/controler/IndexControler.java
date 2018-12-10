package com.demo.cims.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControler {
	
	@RequestMapping(value="index")
	public String index() {
		return "hello";
	}
}
