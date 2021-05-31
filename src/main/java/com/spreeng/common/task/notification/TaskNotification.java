package com.spreeng.common.task.notification;

import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.spreeng.common.task.TaskType;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class TaskNotification implements LycorisSubjectMessage {

  private Boolean done;

  @NonNull private UUID id;

  private String todoTitle;

  private UUID moduleTaskId;

  private UUID participantId;

  private String contactName;
  
  private List<UUID> modulesId;

  @NotNull private UUID ownerId;

  private String todoDescription;

  @NotNull private TaskType type;

  @NotNull private Long dueTimestamp;

  @NonNull private Long updateTimestamp;

  @NonNull private Long creationTimestamp;
}
