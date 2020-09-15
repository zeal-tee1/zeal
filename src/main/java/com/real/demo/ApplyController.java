package com.real.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplyController {

	@RequestMapping(value="/apply")
	public String apply()
	{
		return "apply";
	}
}
