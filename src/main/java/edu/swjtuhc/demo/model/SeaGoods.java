package edu.swjtuhc.demo.model;

public class SeaGoods {
	private String stuID;
	private String GoodsName;
	private String GoodsAmount;
	private String GoodsDescribe;
	private String StuQQnumber;
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getGoodsName() {
		return GoodsName;
	}
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	public String getGoodsAmount() {
		return GoodsAmount;
	}
	public void setGoodsAmount(String goodsAmount) {
		GoodsAmount = goodsAmount;
	}
	public String getGoodsDescribe() {
		return GoodsDescribe;
	}
	public void setGoodsDescribe(String goodsDescribe) {
		GoodsDescribe = goodsDescribe;
	}
	public String getStuQQnumber() {
		return StuQQnumber;
	}
	public void setStuQQnumber(String stuQQnumber) {
		StuQQnumber = stuQQnumber;
	}
	@Override
	public String toString() {
		return "searchGoods [stuID=" + stuID + ", GoodsName=" + GoodsName + ", GoodsAmount=" + GoodsAmount
				+ ", GoodsDescribe=" + GoodsDescribe + ", StuQQnumber=" + StuQQnumber + "]";
	}
}
