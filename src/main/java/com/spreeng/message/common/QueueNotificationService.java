package com.spreeng.message.common;

import eu.lycoris.spring.common.LycorisSubjectMessage;

public interface QueueNotificationService {

  boolean sendMessage(String topic, LycorisSubjectMessage message);
}
