package com.spreeng.message.user.notification;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spreeng.message.user.UserRole;
import com.spreeng.message.user.UserStatus;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class UserNotification implements LycorisSubjectMessage {

  @NotNull private UUID id;

  @NotNull private Long updateDateTime;

  @NotNull private Long creationDateTime;

  @NotNull private UserRole role;

  @NotNull private UserStatus status;

  @NotBlank private String lastName;

  @NotBlank private String firstName;

  @NotBlank @Email private String emailAddress;

  private String phoneNumber;

  private String passwordHash;

  private UUID organizationId;
}
