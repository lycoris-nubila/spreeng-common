package com.spreeng.common.user.answer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserModuleAnswerSavedNotification extends UserModuleAnswerNotification {

  public static final String SUBJECT = "USER_MODULE_ANSWER_SAVED_NOTIFICATION";

  public static UserModuleAnswerSavedNotificationBuilder<?, ?> builder() {
    return new UserModuleAnswerSavedNotificationBuilderImpl();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
