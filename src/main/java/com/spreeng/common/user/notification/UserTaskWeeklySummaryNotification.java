package com.spreeng.common.user.notification;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.user.UserDueTask;

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
public class UserTaskWeeklySummaryNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_TASK_WEEKLY_SUMMARY_NOTIFICATION";

  @NonNull private UUID userId;

  @NonNull private List<UserDueTask> userDueTasks;

  public static UserTaskWeeklySummaryNotificationBuilder<?, ?> builder(
      @NonNull UUID userId, @NonNull List<UserDueTask> userDueTasks) {
    return new UserTaskWeeklySummaryNotificationBuilderImpl()
        .userId(userId)
        .userDueTasks(userDueTasks);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
