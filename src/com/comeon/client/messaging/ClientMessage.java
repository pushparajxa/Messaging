package com.comeon.client.messaging;

public class ClientMessage {
	public static final String UPDATE = "update";
	public static final String CLIENT_INIT = "client_init";
	public static final String NO_TYPE = "not_initialized";

	private String type=NO_TYPE;
	private String content;
	private int randomNumber;
	private int visibilityDuartion;
	private String randomString;

	public ClientMessage(final String type, final int visibilityDuration,
			final int randomNumber, final String randomString) {
		this.type = type;
		this.randomNumber = randomNumber;
		this.visibilityDuartion=visibilityDuration;
		this.randomString = randomString;
		this.content = randomNumber + ":" + randomString;
	}

	public ClientMessage() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return visibilityDuartion+":"+randomNumber + ":" + randomString;
	}

	public void setContent(String content) {
		this.content = content;
		if(type.equalsIgnoreCase(UPDATE)){
			String[] splits = content.split(":");
			this.visibilityDuartion=Integer.parseInt(splits[0]);
			this.randomNumber= Integer.parseInt(splits[1]);
			this.randomString=splits[2];
		}

	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public String getRandomString() {
		return randomString;
	}

	public int getVisibilityDuartion() {
		return visibilityDuartion;
	}

}