package edu.swjtuhc.demo.model;

import java.util.Date;

public class Product {
	 private int id;
	    private String name;
	    private String description;
	    private Date createtime = new Date();
	    private int cid;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
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

	    public int getCid() {
	        return cid;
	    }

	    public void setCid(int cid) {
	        this.cid = cid;
	    }
}
