package com.spreeng.common.user.notification;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserPlanCreatedNotification implements LycorisSubjectMessage {
  public static final String SUBJECT = "USER_PLAN_CREATED_NOTIFICATION";

  private UUID userId;

  private List<UUID> firstModulesId;

  public static UserPlanCreatedNotificationBuilder<?, ?> builder(
      @NonNull UUID userId, @NonNull List<UUID> firstModulesId) {
    return new UserPlanCreatedNotificationBuilderImpl()
        .userId(userId)
        .firstModulesId(firstModulesId);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
