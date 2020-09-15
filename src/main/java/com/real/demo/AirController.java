package com.real.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AirController {
	
	@RequestMapping(value="/pilot")
	public String air()
	{
		return "pilot";
	}

}
