package com.hcl.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class MainController {
		
		@GetMapping("/")
		public String homeView() {
			return "index";
			
		}
//		@GetMapping("/base")
//		public String base() {
//			return "base";
//		}
		@GetMapping("/login")
		public String login() {
			return "login";
		}
		@GetMapping("/register")
		public String register() {
			return "register";
		}
		@GetMapping("/products")
		public String products() {
			return "product";
		}
		@GetMapping("/product")
		public String product() {
			return "view_product";
		}

	  
	}
