package com.spreeng.common.organization.notification;

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
public class OrganizationDisabledNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "ORGANIZATION_DISABLED_NOTIFICATION";

  @NonNull private UUID id;

  public static OrganizationDisabledNotificationBuilder<?, ?> builder(@NonNull UUID id) {
    return new OrganizationDisabledNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
