package com.spreeng.common.user.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.section.SectionType;

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
public class UserPlanCreatedNotification implements LycorisSubjectMessage {
  public static final String SUBJECT = "USER_PLAN_CREATED_NOTIFICATION";

  UUID userId;

  UUID moduleId;

  SectionType sectionType;

  public static UserPlanCreatedNotificationBuilder<?, ?> builder(
      @NonNull UUID userId, @NonNull UUID moduleId, @NonNull SectionType sectionType) {
    return new UserPlanCreatedNotificationBuilderImpl()
        .userId(userId)
        .moduleId(moduleId)
        .sectionType(sectionType);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
