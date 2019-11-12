package com.spreeng.message.organization.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.message.organization.OrganizationStatus;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class OrganizationUpdatedNotification extends OrganizationNotification {

  public static final String SUBJECT = "ORGANIZATION_UPDATED_NOTIFICATION";

  public static OrganizationUpdatedNotificationBuilder<?, ?> builder(
      @NotNull UUID id,
      @NotNull Long updateDateTime,
      @NotNull Long creationDateTime,
      @NotNull String name,
      @NotNull OrganizationStatus status,
      @NotNull Float fees) {
    return new OrganizationUpdatedNotificationBuilderImpl()
        .id(id)
        .creationDateTime(creationDateTime)
        .updateDateTime(updateDateTime)
        .name(name)
        .status(status)
        .fees(fees);
  }

  protected OrganizationUpdatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
