package edu.swjtuhc.demo.model;

import java.util.Date;

public class Comment {
	 private int id;
	    private String description;
	    private Date createtime = new Date();
	    private int pid;
	    private int uid;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public Date getCreatetime() {
	        return createtime;
	    }

	    public void setCreatetime(Date createtime) {
	        this.createtime = createtime;
	    }

	    public int getPid() {
	        return pid;
	    }

	    public void setPid(int pid) {
	        this.pid = pid;
	    }

	    public int getUid() {
	        return uid;
	    }

	    public void setUid(int uid) {
	        this.uid = uid;
	    }
}
