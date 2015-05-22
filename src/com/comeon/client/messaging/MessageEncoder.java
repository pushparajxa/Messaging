package com.comeon.client.messaging;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<ClientMessage> {

  @Override
  public String encode(ClientMessage message) throws EncodeException {

    JsonObject jsonObject = Json.createObjectBuilder()
        .add("type", message.getType())
        .add("content", message.getContent()).build();
    return jsonObject.toString();

  }

  @Override
  public void init(EndpointConfig ec) {
    System.out.println("MessageEncoder - init method called");
  }

  @Override
  public void destroy() {
    System.out.println("MessageEncoder - destroy method called");
  }

}
