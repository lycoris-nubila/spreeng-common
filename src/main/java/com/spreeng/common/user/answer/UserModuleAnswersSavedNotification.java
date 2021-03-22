package com.spreeng.common.user.answer;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserModuleAnswersSavedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_MODULE_ANSWERS_SAVED_NOTIFICATION";

  private UUID userId;

  private UUID contactId;

  private Boolean markFinished;

  private UUID organizationModuleId;

  public static UserModuleAnswersSavedNotificationBuilder<?, ?> builder(
      UUID userId, Boolean markFinished, UUID organizationModuleId) {
    return new UserModuleAnswersSavedNotificationBuilderImpl()
        .userId(userId)
        .markFinished(markFinished)
        .organizationModuleId(organizationModuleId);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}