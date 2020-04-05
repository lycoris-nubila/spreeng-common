package com.spreeng.common.user.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class UserAssociatedWithCoachNotification extends UserNotification {
  public static final String SUBJECT = "USER_ASSOCIATED_WITH_COACH_NOTIFICATION";

  @NonNull private UUID id;

  @NonNull private UUID coachId;
  
  public static UserAssociatedWithCoachNotificationBuilder<?, ?> builder(@NonNull UUID id, @NonNull UUID coachId) {
	    return new UserAssociatedWithCoachNotificationBuilderImpl().id(id).coachId(coachId);
	  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
