package com.real.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoadController {
	
	@RequestMapping(value="/trucks")
	public String rail()
	{
		return "trucks";
	}


}
