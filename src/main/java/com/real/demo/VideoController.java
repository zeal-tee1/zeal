package com.real.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoController {

	@RequestMapping(value="/video")
	public String vids()
	{
		return "video";
	}
}
