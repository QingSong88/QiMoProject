package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

//实现service接口

@Service  //该注解实现service服务
public class UserServiceImpl implements UserService{

	@Autowired   //注入mapper
	UserMapper userMapper;
	@Override  //添加没有实现的register注册方法
	public int register(SysUser user) {
		// TODO Auto-generated method stub
	//写逻辑
		//调用mapper实现注册（方法：1、查询username是否已存在；2、在数据库插入用户）
		SysUser user1 = userMapper.selectUserByUsername(user.getUsername());
	
		int i = -1;
		if (user1==null) {
			i = userMapper.insertUser(user);
		}else {
			i = 2;
		}
		
		return i;
	}

}
