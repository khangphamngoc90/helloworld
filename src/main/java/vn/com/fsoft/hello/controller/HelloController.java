package vn.com.fsoft.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("")
	public String hello() {
		return "home";
	}
}
