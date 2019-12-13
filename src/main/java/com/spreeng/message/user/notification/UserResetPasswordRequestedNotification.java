package com.spreeng.message.user.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class UserResetPasswordRequestedNotification implements LycorisSubjectMessage {

	public static final String SUBJECT = "USER_RESET_PASSWORD_REQUESTED_NOTIFICATION";
	
	@NonNull private UUID id;
	@NonNull private String resetCode;

	public static UserResetPasswordRequestedNotificationBuilder<?, ?> builder(@NonNull UUID id,
			@NonNull String resetCode) {
		return new UserResetPasswordRequestedNotificationBuilderImpl().id(id).resetCode(resetCode);
	}

	@Override
	@JsonIgnore
	public String getSubject() {
		return SUBJECT;
	}

}
