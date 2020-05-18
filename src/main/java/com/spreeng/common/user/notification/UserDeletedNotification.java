package com.spreeng.common.user.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDeletedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_DELETED_NOTIFICATION";

  public static UserDeletedNotificationBuilder<?, ?> builder(@NonNull UUID id) {
    return new UserDeletedNotificationBuilderImpl().id(id);
  }

  @NonNull private UUID id;

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
