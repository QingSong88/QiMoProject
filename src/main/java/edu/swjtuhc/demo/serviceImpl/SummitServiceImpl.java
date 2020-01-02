package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.SummitMapper;
import edu.swjtuhc.demo.model.Summit;
import edu.swjtuhc.demo.service.SummitService;

@Service
public class SummitServiceImpl implements SummitService{

	@Autowired
	SummitMapper summitMapper;
	
	
	@Override
	public int advice(Summit summit) {
		// TODO Auto-generated method stub
		//调用mapper
	
		Summit s1 = summitMapper.selectSumByhPicture(summit.gethPicture());
		int i=1;
			if (s1==null) {
				i= summitMapper.insertSummit(summit);
			}else {
				i=2;
			}
		
		return i;
	}
	
}
