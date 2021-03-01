package com.glaucus.increementController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glaucus.entity.IncrementNumber;
import com.glaucus.service.IncrementNumberServiceI;

@Controller
public class IncreementController {
	
	@Autowired
	IncrementNumberServiceI inrementNumberServiceImpl;
	
	@RequestMapping("/home")
	@ResponseBody
	synchronized IncrementNumber getHome()
	{
		IncrementNumber incrementNumber = inrementNumberServiceImpl.getIncrement();  //service call to increment value
		return incrementNumber;
	}

}
