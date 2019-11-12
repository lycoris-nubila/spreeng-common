package com.spreeng.message.user.notification;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.message.user.UserRole;
import com.spreeng.message.user.UserStatus;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class UserUpdatedNotification extends UserNotification {

  public static final String SUBJECT = "USER_UPDATED_NOTIFICATION";

  public static UserUpdatedNotificationBuilder<?, ?> builder(
      @NotNull UUID id,
      @NotNull Long updateDateTime,
      @NotNull Long creationDateTime,
      @NotNull UserRole role,
      @NotNull UserStatus status,
      @NotBlank String lastName,
      @NotBlank String firstName,
      @NotBlank @Email String emailAddress) {
    return new UserUpdatedNotificationBuilderImpl()
        .id(id)
        .creationDateTime(creationDateTime)
        .updateDateTime(updateDateTime)
        .role(role)
        .status(status)
        .lastName(lastName)
        .firstName(firstName)
        .emailAddress(emailAddress);
  }

  protected UserUpdatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
