package com.spreeng.common.organization.notification;

import java.util.UUID;

import com.spreeng.common.organization.OrganizationAddress;
import com.spreeng.common.organization.OrganizationStatus;
import com.spreeng.common.organization.OrganizationStyle;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class OrganizationNotification implements LycorisSubjectMessage {

  @NonNull private UUID id;

  @NonNull private Long updateDateTime;

  @NonNull private Long creationDateTime;

  @NonNull private String name;

  private String logoUrl;

  @NonNull private OrganizationStatus status;

  private Float fees;

  @NonNull private OrganizationStyle style;

  @NonNull private OrganizationAddress address;
}
