package com.spreeng.common.websocket;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WebsocketDisconnectNotification extends WebsocketNotification {

  public static final String SUBJECT = "WEBSOCKET_DISCONNECT";
  
  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
