package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

//mapper层相当于数据库dao层       注：写后台的一定要和写mapper的沟通好，mapper为写后台的同学提供方法
@Mapper
public interface UserMapper {
	
	public SysUser selectUserByStuID(String stuID);
	
	public int insertUser(SysUser user);
	
	public int alterUserPassword(SysUser user);
}
