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
public class UserEnabledNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_ENABLED_NOTIFICATION";

  @NonNull private UUID id;

  public static UserEnabledNotificationBuilder<?, ?> builder(@NonNull UUID id) {
    return new UserEnabledNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
