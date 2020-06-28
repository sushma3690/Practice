package Concurrency;

import java.util.Date;

public class DummyUser {
	
	private String stringName;
	private int code;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStringName() {
		return stringName;
	}
	public void setStringName(String stringName) {
		this.stringName = stringName;
	}
	public Date getCode() {
		return new Date();
	}
	public void setCode(int code) {
		this.code = code;
	}
	public DummyUser(int id) {
		super();
		this.id = id;
	}
	
	

}
