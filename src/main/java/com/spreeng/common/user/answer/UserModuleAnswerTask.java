package com.spreeng.common.user.answer;

import java.time.Instant;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserModuleAnswerTask {

  private UUID userTaskId;

  private String taskLabel;

  private UUID moduleTaskid;

  private Instant taskDueDateTime;
}
