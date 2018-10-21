package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	@Autowired
	private Configuration configuraton;
	
	
	@GetMapping("/limits")
	public LimitConfiguration reteriveAllLimitConfiguration(){
		
		LimitConfiguration limitCfg = new LimitConfiguration(configuraton.getMaximum(),configuraton.getMinimum());
		
		return limitCfg;
		
	}

}
