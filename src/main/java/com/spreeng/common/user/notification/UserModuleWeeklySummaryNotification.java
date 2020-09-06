package com.spreeng.common.user.notification;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.user.UserDoneModule;

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
public class UserModuleWeeklySummaryNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "USER_MODULE_WEEKLY_SUMMARY_NOTIFICATION";

  @NonNull private UUID userId;

  @NonNull private List<UserDoneModule> userDoneModules;

  public static UserModuleWeeklySummaryNotificationBuilder<?, ?> builder(
      @NonNull UUID userId, @NonNull List<UserDoneModule> userDoneModules) {
    return new UserModuleWeeklySummaryNotificationBuilderImpl()
        .userId(userId)
        .userDoneModules(userDoneModules);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
