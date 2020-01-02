package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Policy;


@Mapper
public interface PolicyMapper {
	public int insertPolicy(Policy policy);	 
}
