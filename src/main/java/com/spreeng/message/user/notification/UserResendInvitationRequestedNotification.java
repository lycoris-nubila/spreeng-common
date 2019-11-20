package com.spreeng.message.user.notification;

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
public class UserResendInvitationRequestedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_RESEND_INVITATION_REQUESTED_NOTIFICATION";

  @NonNull private UUID id;

  public static UserResendInvitationRequestedNotificationBuilder<?, ?> builder(@NonNull UUID id) {
    return new UserResendInvitationRequestedNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
