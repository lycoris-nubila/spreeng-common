package com.spreeng.common.user.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.spreeng.common.user.UserRole;
import com.spreeng.common.user.UserStatus;

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

  @NotNull private Boolean enabled;

  private String phoneNumber;

  private String passwordHash;

  private UUID organizationId;

  private String activationCode;

  private UUID coachId;
}
