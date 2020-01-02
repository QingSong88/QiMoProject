package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.PolicyMapper;
import edu.swjtuhc.demo.model.Policy;
import edu.swjtuhc.demo.service.PolicyService;

@Service
public class PolicyImpl implements PolicyService{

	@Autowired
	PolicyMapper policymapper;
	
	
	@Override
	public int issuse(Policy policy) {
		// TODO Auto-generated method stub
		int i=policymapper.insertPolicy(policy);
		return  i;
	}
	
}
