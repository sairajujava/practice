package com.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Helloworld {

	private String message;

	public Helloworld() {

	}

	public Helloworld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
