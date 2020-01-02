package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Summit;
import edu.swjtuhc.demo.service.SummitService;
import net.sf.json.JSONObject;


@RestController
@RequestMapping("/help")
public class HelpController {
	
	@Autowired
	SummitService summitService;
	
	@RequestMapping("/summit")
	public JSONObject summit(@RequestBody Summit summit) {
		
		JSONObject result = new JSONObject();
		
		int i = summitService.advice(summit);
		
		result.put("state", i); 
		
		return result;
	}
	
}
