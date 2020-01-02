package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Summit;

@Mapper
public interface SummitMapper {
	public Summit selectSumByhPicture(String hPicture);
	public int insertSummit(Summit summit);	 
}
