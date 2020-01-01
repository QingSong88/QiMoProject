package edu.swjtuhc.demo.model;

public class Goods {
	private String GoodsType;
	private String stuID;
	private String GoodsName;
	private String GoodsAmount;
	private String GoodsPrice;
	private String GoodsDescribe;
	private String GoodsDegree;
	private String GoodsPicture;
	private String StuQQnumber;

	public String getGoodsType() {
		return GoodsType;
	}
	public void setGoodsType(String goodsType) {
		GoodsType = goodsType;
	}
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
	public String getGoodsPrice() {
		return GoodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		GoodsPrice = goodsPrice;
	}
	public String getGoodsDescribe() {
		return GoodsDescribe;
	}
	public void setGoodsDescribe(String goodsDescribe) {
		GoodsDescribe = goodsDescribe;
	}
	public String getGoodsDegree() {
		return GoodsDegree;
	}
	public void setGoodsDegree(String goodsDegree) {
		GoodsDegree = goodsDegree;
	}
	public String getGoodsPicture() {
		return GoodsPicture;
	}
	public void setGoodsPicture(String goodsPicture) {
		GoodsPicture = goodsPicture;
	}
	public String getStuQQnumber() {
		return StuQQnumber;
	}
	public void setStuQQnumber(String stuQQnumber) {
		StuQQnumber = stuQQnumber;
	}
	@Override
	public String toString() {
		return "Goods [GoodsType=" + GoodsType + ", stuID=" + stuID + ", GoodsName=" + GoodsName + ", GoodsAmount="
				+ GoodsAmount + ", GoodsPrice=" + GoodsPrice + ", GoodsDescribe=" + GoodsDescribe + ", GoodsDegree="
				+ GoodsDegree + ", GoodsPicture=" + GoodsPicture + ", StuQQnumber=" + StuQQnumber + "]";
	}
}
