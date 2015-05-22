package com.comeon.server.messaging;

public class UpdateMessage extends ServerMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1685610258287671334L;
	private int randomNumber;
	private String randomString;
	private int visibilityDuration;
	public UpdateMessage(final int number,final int visibilityDuration,final String randomString) {
		this.randomNumber=number;
		this.visibilityDuration=visibilityDuration;
		this.randomString=randomString;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public int getVisibilityDuration(
			) {
		return visibilityDuration;
	}

	public String getRandomString(){
		return randomString;
	}
	
}
