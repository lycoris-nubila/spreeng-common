package com.spreeng.common.websocket;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WebsocketAuthenticateNotification extends WebsocketNotification {

  public static final String SUBJECT = "WEBSOCKET_AUTHENTICATE";

  private String action;
  private UUID userId;
  private String jwt;
  
  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
