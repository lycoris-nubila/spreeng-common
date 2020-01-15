package com.spreeng.common.common;

import eu.lycoris.spring.common.LycorisSubjectMessage;

public interface QueueNotificationService {

  boolean sendMessage(String topic, LycorisSubjectMessage message);
}
