package com.comeon.client.messaging;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
public class MessageDecoder implements Decoder.Text<ClientMessage> {

	  @Override
	  public ClientMessage decode(String jsonMessage) throws DecodeException {

	    JsonObject jsonObject = Json
	        .createReader(new StringReader(jsonMessage)).readObject();
	    ClientMessage message = new ClientMessage();
	    message.setType(jsonObject.getString("type"));
	    message.setContent(jsonObject.getString("content"));
	    return message;


	  }

	  @Override
	  public boolean willDecode(String jsonMessage) {

		  System.out.println("Started decoding the message");
		  System.out.println("Receive json Message is "+jsonMessage);
	  /* try {
	    try {

	      // Check if incoming message is valid JSON
	      Json.createReader(new StringReader(jsonMessage)).readObject();
	      return true;
	    } catch (Exception e) {
	      return false;

	    }*/
		  return jsonMessage!=null;

	  }

	  @Override
	  public void init(EndpointConfig ec) {
	    System.out.println("MessageDecoder -init method called");
	  }

	  @Override
	  public void destroy() {
	    System.out.println("MessageDecoder - destroy method called");
	  }

	}
