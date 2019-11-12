package com.spreeng.message.organization.notification;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spreeng.message.organization.OrganizationStatus;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class OrganizationNotification implements LycorisSubjectMessage {

  @NotNull private UUID id;
  
  @NotNull private Long updateDateTime;

  @NotNull private Long creationDateTime;

  @NotBlank private String name;

  @NotNull private OrganizationStatus status;

  @NotNull private Float fees;
}
