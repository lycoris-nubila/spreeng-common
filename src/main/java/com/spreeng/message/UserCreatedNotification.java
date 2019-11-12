package com.spreeng.message;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class UserCreatedNotification extends UserNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_CREATED_NOTIFICATION";

  public static UserCreatedNotificationBuilder<?, ?> builder(
      @NotNull UUID id,
      @NotNull Long updateDateTime,
      @NotNull Long creationDateTime,
      @NotNull UserRole role,
      @NotNull UserStatus status,
      @NotBlank String lastName,
      @NotBlank String firstName,
      @NotBlank @Email String emailAddress) {
    return new UserCreatedNotificationBuilderImpl()
        .id(id)
        .creationDateTime(creationDateTime)
        .updateDateTime(updateDateTime)
        .role(role)
        .status(status)
        .lastName(lastName)
        .firstName(firstName)
        .emailAddress(emailAddress);
  }

  protected UserCreatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
