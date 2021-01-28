package com.spring.boardPrac01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		return "boardPrac01/main";
	}
}
