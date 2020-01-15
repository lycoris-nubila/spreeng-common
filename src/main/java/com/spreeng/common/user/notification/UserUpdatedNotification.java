package com.spreeng.common.user.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.user.UserRole;
import com.spreeng.common.user.UserStatus;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class UserUpdatedNotification extends UserNotification {

  public static final String SUBJECT = "USER_UPDATED_NOTIFICATION";

  public static UserUpdatedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateDateTime,
      @NonNull Long creationDateTime,
      @NonNull UserRole role,
      @NonNull UserStatus status,
      @NonNull String lastName,
      @NonNull String firstName,
      @NonNull String emailAddress,
      @NonNull Boolean enabled) {
    return new UserUpdatedNotificationBuilderImpl()
        .id(id)
        .creationDateTime(creationDateTime)
        .updateDateTime(updateDateTime)
        .role(role)
        .status(status)
        .lastName(lastName)
        .firstName(firstName)
        .emailAddress(emailAddress)
        .enabled(enabled);
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
