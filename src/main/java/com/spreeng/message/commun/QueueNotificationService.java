package com.spreeng.message.commun;

import eu.lycoris.spring.common.LycorisSubjectMessage;

public interface QueueNotificationService {

  boolean sendMessage(String topic, LycorisSubjectMessage message);
}
