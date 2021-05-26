package com.spreeng.common.user.answer;

import java.util.List;
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

  private Boolean isAutoSave;
  
  private UUID pushOrgModuleId;

  private UUID organizationModuleId;
  
  private List<UserModuleAnswerContact> contacts;

  public static UserModuleAnswersSavedNotificationBuilder<?, ?> builder(
      UUID userId, Boolean isAutoSave, UUID organizationModuleId) {
    return new UserModuleAnswersSavedNotificationBuilderImpl()
        .userId(userId)
        .isAutoSave(isAutoSave)
        .organizationModuleId(organizationModuleId);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
