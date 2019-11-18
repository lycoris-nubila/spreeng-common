package com.spreeng.message.user.notification;

import java.util.UUID;

import com.spreeng.message.user.UserRole;
import com.spreeng.message.user.UserStatus;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class UserNotification implements LycorisSubjectMessage {

  @NonNull private UUID id;

  @NonNull private Long updateDateTime;

  @NonNull private Long creationDateTime;

  @NonNull private UserRole role;

  @NonNull private UserStatus status;

  @NonNull private String lastName;

  @NonNull private String firstName;

  @NonNull private String emailAddress;

  private String phoneNumber;

  private String passwordHash;

  private UUID organizationId;

  private String activationCode;
}
