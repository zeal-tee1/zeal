package com.real.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeaController {
	
	@RequestMapping(value="/boat")
	public String sea()
	{
		return "boat";
	}

}
