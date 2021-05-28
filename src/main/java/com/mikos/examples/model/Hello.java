package com.mikos.examples.model;

import java.util.UUID;

public class Hello {

	private UUID id;
	private String remoteIP;
	private String message;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getRemoteIP() {
		return remoteIP;
	}

	public void setRemoteIP(String remoteIP) {
		this.remoteIP = remoteIP;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Hello(UUID id, String remoteIP, String message) {
		super();
		this.id = id;
		this.remoteIP = remoteIP;
		this.message = message;
	}

}
