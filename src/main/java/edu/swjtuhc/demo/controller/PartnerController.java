package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Partner;
import edu.swjtuhc.demo.service.PartnerService;



@RestController
@RequestMapping("/partner")

public class PartnerController {
	
	@Autowired
	PartnerService partnerService;
	
	@RequestMapping("/search")
	public List<Partner> getList(){
		return partnerService.getPartnerList();
	
	}
}
