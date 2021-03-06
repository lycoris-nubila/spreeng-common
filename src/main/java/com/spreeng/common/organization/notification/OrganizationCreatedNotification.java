package com.spreeng.common.organization.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.organization.OrganizationAddress;
import com.spreeng.common.organization.OrganizationStatus;
import com.spreeng.common.organization.OrganizationStyle;

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
public class OrganizationCreatedNotification extends OrganizationNotification {

  public static final String SUBJECT = "ORGANIZATION_CREATED_NOTIFICATION";

  public static OrganizationCreatedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateDateTime,
      @NonNull Long creationDateTime,
      @NonNull String name,
      @NonNull OrganizationStatus status,
      Float fees,
      @NonNull OrganizationStyle style,
      @NonNull OrganizationAddress address) {
    return new OrganizationCreatedNotificationBuilderImpl()
        .id(id)
        .creationDateTime(creationDateTime)
        .updateDateTime(updateDateTime)
        .name(name)
        .status(status)
        .fees(fees)
        .style(style)
        .address(address);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
