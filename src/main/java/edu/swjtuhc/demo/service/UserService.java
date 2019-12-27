package edu.swjtuhc.demo.service;

//controller调用此层此方法传一个user给service，service返回一个失败或成功的代码给controller
import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
	public int register(SysUser user);//controller调用此层此方法传一个user给service，service返回一个失败或成功的代码给controller
	public int login(SysUser user);
	public int alter(SysUser user);
}
