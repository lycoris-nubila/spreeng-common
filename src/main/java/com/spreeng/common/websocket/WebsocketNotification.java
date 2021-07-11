package com.spreeng.common.websocket;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class WebsocketNotification implements LycorisSubjectMessage {

  private WebsocketEventType eventType;
  private Long connectTimestamp;
  private Long requestTimestamp;
  private String connectionId;
  private String requestId;
  private String userAgent;
  private String sourceIp;
  private String stage;
}
