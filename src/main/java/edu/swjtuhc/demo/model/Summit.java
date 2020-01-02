package edu.swjtuhc.demo.model;

public class Summit {
	private  int hId;
	public String hMessage;
	public String hPicture;
	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public String gethMessage() {
		return hMessage;
	}
	public void sethMessage(String hMessage) {
		this.hMessage = hMessage;
	}
	public String gethPicture() {
		return hPicture;
	}
	public void sethPicture(String hPicture) {
		this.hPicture = hPicture;
	}
	@Override
	public String toString() {
		return "Summit [hId=" + hId + ", hMessage=" + hMessage + ", hPicture=" + hPicture + "]";
	}
	
	
}
