package com.spreeng.message.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spreeng.message.common.QueueNotificationService;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import eu.lycoris.spring.sns.LycorisSnsManager;

@Component
public class SnsQueueNotificationService implements QueueNotificationService {

  @Autowired private LycorisSnsManager snsManager;

  @Override
  public boolean sendMessage(String topic, LycorisSubjectMessage message) {
    try {
      snsManager.sendMessage(topic, message);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
