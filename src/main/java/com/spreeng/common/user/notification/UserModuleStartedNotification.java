package com.spreeng.common.user.notification;

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
public class UserModuleStartedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_MODULE_STARTED_NOTIFICATION";

  private UUID coachId;

  private UUID coacheeId;

  private UUID organizationModuleId;

  public static UserModuleStartedNotificationBuilder<?, ?> builder(
      @NonNull UUID coacheeId, @NonNull UUID coachId, @NonNull UUID organizationModuleId) {
    return new UserModuleStartedNotificationBuilderImpl()
        .organizationModuleId(organizationModuleId)
        .coacheeId(coacheeId)
        .coachId(coachId);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
