package com.real.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RailController {
	
	@RequestMapping(value="/trane")
	public String rail()
	{
		return "trane";
	}

}
