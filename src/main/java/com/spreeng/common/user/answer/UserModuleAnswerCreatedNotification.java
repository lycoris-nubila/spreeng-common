package com.spreeng.common.user.answer;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserModuleAnswerCreatedNotification extends UserModuleAnswerNotification {

  public static final String SUBJECT = "USER_MODULE_ANSWER_CREATED_NOTIFICATION";

  public static UserModuleAnswerCreatedNotificationBuilder<?, ?> builder(UUID userId) {
    return new UserModuleAnswerCreatedNotificationBuilderImpl().userId(userId);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
