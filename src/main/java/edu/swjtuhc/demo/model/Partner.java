package edu.swjtuhc.demo.model;

public class Partner {
	private int MId;
	public   String merchantpic;
	public  String merchantname;
	public  String merchantdes;
	
	@Override
	public String toString() {
		return "Partner [MId=" + MId + ", merchantpic=" + merchantpic + ", merchantname=" + merchantname
				+ ", merchantdes=" + merchantdes + "]";
	}
	public int getMId() {
		return MId;
	}
	public void setMId(int mId) {
		MId = mId;
	}
	public String getMerchantpic() {
		return merchantpic;
	}
	public void setMerchantpic(String merchantpic) {
		this.merchantpic = merchantpic;
	}
	public String getMerchantname() {
		return merchantname;
	}
	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}
	public String getMerchantdes() {
		return merchantdes;
	}
	public void setMerchantdes(String merchantdes) {
		this.merchantdes = merchantdes;
	}
	
}
