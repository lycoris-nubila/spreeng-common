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
public class OrganizationEnabledNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "ORGANIZATION_ENABLED_NOTIFICATION";

  private UUID id;

  public static OrganizationEnabledNotificationBuilder<?, ?> builder(@NotNull UUID id) {
    return new OrganizationEnabledNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
