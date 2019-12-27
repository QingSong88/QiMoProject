package edu.swjtuhc.demo.serviceImpl;


import org.apache.commons.lang.StringUtils;
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
	//注册
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		//写逻辑
		//调用mapper实现注册（方法：1、查询username是否已存在；2、在数据库插入用户）
		SysUser user1 = userMapper.selectUserByStuID(user.getstuID());
	
		int i = -1;
		if (user1==null) {
			i = userMapper.insertUser(user);
		}else {
			i = 2;
		}
		return i;
	}
	//登录
	@Override
	public int login(SysUser user) {
		// TODO Auto-generated method stub
		int i = -1;
		if (!StringUtils.isEmpty(user.getstuID())
				&&!StringUtils.isEmpty(user.getPassword())) {
		SysUser user2 = userMapper.selectUserByStuID(user.getstuID());
			if (user2!=null&&user2.getPassword().equals(user.getPassword())) {
				i=1;
			}else if(user2==null){
				i=2;
			}else if (user2!=null&&!user2.getPassword().equals(user.getPassword())) {
				i=3;
			}
		}
		return i;
	}
	//修改密码
	@Override
	public int alter(SysUser user) {
		// TODO Auto-generated method stub
		int i=-1;
		if (!StringUtils.isEmpty(user.getstuID())){
			if (!StringUtils.isEmpty(user.getPassword())) {
				if (!StringUtils.isEmpty(user.getNewPassword())) {
					SysUser user3 = userMapper.selectUserByStuID(user.getstuID());
					if (user3!=null&&user3.getPassword().equals(user.getPassword())
							&&!user.getPassword().equals(user.getNewPassword())) {
							i = userMapper.alterUserPassword(user);
					}else if (user3==null) {
						i=2;
					}else if (user3!=null&&!user3.getPassword().equals(user.getPassword())) {
						i=3;
					}else if (user3!=null&&user.getPassword().equals(user.getNewPassword())) {
						i=4;
					}
				} else {
					i=-3;
				}
			} else {
				i=-2;
			}
		}else {
			i=-1;
		}
	return i;
	}
}

