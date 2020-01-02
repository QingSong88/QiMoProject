package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Partner;

@Mapper
public interface PartnerMapper {
	public List<Partner> selectAllPartners();
	
	
}
