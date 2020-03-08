package com.spreeng.common.notification.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.spreeng.common.notification.NotificationType;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class NotificationNotification implements LycorisSubjectMessage {

  @NonNull private UUID id;

  @NonNull private Long updateTimestamp;

  @NonNull private Long creationTimestamp;

  @NotNull private NotificationType type;

  private UUID sourceUserId;

  @NotNull private UUID targetUserId;
}
