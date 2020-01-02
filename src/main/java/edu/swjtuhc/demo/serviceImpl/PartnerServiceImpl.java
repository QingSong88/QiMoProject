package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.PartnerMapper;
import edu.swjtuhc.demo.model.Partner;
import edu.swjtuhc.demo.service.PartnerService;

@Service

public class PartnerServiceImpl implements PartnerService{

	@Autowired
	PartnerMapper partnerMapper;
	
	@Override
	public List<Partner> getPartnerList() {
		// TODO Auto-generated method stub
		return partnerMapper.selectAllPartners();
	}
	
}
