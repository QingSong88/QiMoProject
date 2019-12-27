package edu.swjtuhc.demo.model;

//模型类，响应UserController
public class SysUser {
	String  stuID;
    String username;
    String password;
    String name;
    String newPassword;
    String email;
    int age;
    String gender;
    
	@Override
	public String toString() {
		return "SysUser [stuID=" + stuID + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", newPassword=" + newPassword + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getstuID() {
		return stuID;
	}
	public void setstuID(String stuID) {
		this.stuID = stuID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
