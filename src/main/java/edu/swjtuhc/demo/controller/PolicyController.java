package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Policy;
import edu.swjtuhc.demo.service.PolicyService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/policy")

public class PolicyController {
	@Autowired
	PolicyService policyservice;
	
	@RequestMapping("/polist")
	public JSONObject policy(@RequestBody Policy policy) {
		
		JSONObject result = new JSONObject();
		
		int i = policyservice.issuse(policy);
		
		result.put("state", i); 
		
		return result;
}}
