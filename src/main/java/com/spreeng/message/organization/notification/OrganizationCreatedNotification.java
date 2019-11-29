package com.spreeng.message.organization.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.message.organization.OrganizationAddress;
import com.spreeng.message.organization.OrganizationStatus;
import com.spreeng.message.organization.OrganizationStyle;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class OrganizationCreatedNotification extends OrganizationNotification {

  public static final String SUBJECT = "ORGANIZATION_CREATED_NOTIFICATION";

  public static OrganizationCreatedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateDateTime,
      @NonNull Long creationDateTime,
      @NonNull String name,
      @NonNull OrganizationStatus status,
      @NonNull Float fees,
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

  protected OrganizationCreatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
