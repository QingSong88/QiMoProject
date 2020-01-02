package edu.swjtuhc.demo.model;

public class Policy {
	
	private  int poID;	
	public String poMessage; 
	public int getPoID() {
		return poID;
	}
	public void setPoID(int poID) {
		this.poID = poID;
	}
	public String getPoMessage() {
		return poMessage;
	}
	public void setPoMessage(String poMessage) {
		this.poMessage = poMessage;
	}
	@Override
	public String toString() {
		return "Policy [poID=" + poID + ", poMessage=" + poMessage + "]";
	}
}
