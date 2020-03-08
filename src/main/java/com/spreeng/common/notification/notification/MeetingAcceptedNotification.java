package com.spreeng.common.notification.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.notification.NotificationType;

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
public class MeetingAcceptedNotification extends NotificationNotification {

  public static final String SUBJECT = "MEETING_ACCEPTED_NOTIFICATION";

  @NonNull private UUID coachId;

  @NonNull private Long endTimestamp;

  @NonNull private Long startTimestamp;

  public static MeetingAcceptedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateTimestamp,
      @NonNull Long creationTimestamp,
      @NotNull NotificationType type,
      @NotNull UUID sourceUserId,
      @NotNull UUID targetUserId,
      @NonNull UUID coachId,
      @NonNull Long endTimestamp,
      @NonNull Long startTimestamp) {
    return new MeetingAcceptedNotificationBuilderImpl()
        .id(id)
        .updateTimestamp(updateTimestamp)
        .creationTimestamp(creationTimestamp)
        .type(type)
        .sourceUserId(sourceUserId)
        .targetUserId(targetUserId)
        .coachId(coachId)
        .endTimestamp(endTimestamp)
        .startTimestamp(startTimestamp);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
