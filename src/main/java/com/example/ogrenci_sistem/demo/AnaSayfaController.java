package com.example.ogrenci_sistem.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnaSayfaController {
	
	@RequestMapping("/home")
	public String goHome() {
		return "index";
	}
}
