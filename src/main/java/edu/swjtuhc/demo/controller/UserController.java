package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")  //说明UserController处理的映射全是user类的映射
public class UserController {
	
	@Autowired //注入service层
	UserService userService;
	
	@RequestMapping("/register")
//	public JSONObject register(String username,String password,String name,String email,Integer age,String gender) {
//		JSONObject result = new JSONObject();//result是用来装返回值的，JSONobject是返回值类型
//		
//		//调用service层对前端发过来的请求进行打包写进sysuser表
//		
////		result.put("state", 1);
//		
//		return result;
//	} // 返回参数方法的第一种写法
	//springboot将前端传过来的用户注册请求打包然后交给service层与数据库中的表的字段比对再将user写进我们的关系表
	public JSONObject register(@RequestBody SysUser user) {
		JSONObject result = new JSONObject(); 
		
		//调用service层对前端发过来的请求进行打包写进sysuser表
		int i = userService.register(user);
		if (i==1) {
			System.out.println("注册成功");
		}else if(i==2){
			System.out.println("该用户名已存在");
		}
		result.put("state", i);   //参数1、2……取决于调用service层的情况
		
		return result;
	}
}
