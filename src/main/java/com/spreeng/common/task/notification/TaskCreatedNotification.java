package com.spreeng.common.task.notification;

import java.util.UUID;

import com.spreeng.common.task.TaskType;

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
public class TaskCreatedNotification extends TaskNotification {

  public static final String SUBJECT = "TASK_CREATED_NOTIFICATION";

  public static TaskCreatedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateTimestamp,
      @NonNull Long creationTimestamp,
      @NonNull UUID ownerId,
      @NonNull TaskType type,
      @NonNull Long dueTimestamp) {
    return new TaskCreatedNotificationBuilderImpl()
        .id(id)
        .updateTimestamp(updateTimestamp)
        .creationTimestamp(creationTimestamp)
        .ownerId(ownerId)
        .type(type)
        .dueTimestamp(dueTimestamp);
  }

  @Override
  public String getSubject() {
    return SUBJECT;
  }
}
