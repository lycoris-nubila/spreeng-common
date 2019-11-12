package com.spreeng.message.user.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEnabledNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_ENABLED_NOTIFICATION";

  private UUID id;

  public static UserEnabledNotificationBuilder<?, ?> builder(@NotNull UUID id) {
    return new UserEnabledNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
