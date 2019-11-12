package com.spreeng.message.organization.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class OrganizationDisabledNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "ORGANIZATION_DISABLED_NOTIFICATION";

  private UUID id;

  public static OrganizationDisabledNotificationBuilder<?, ?> builder(@NotNull UUID id) {
    return new OrganizationDisabledNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
