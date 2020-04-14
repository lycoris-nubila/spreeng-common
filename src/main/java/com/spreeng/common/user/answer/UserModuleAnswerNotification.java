package com.spreeng.common.user.answer;

import java.util.List;
import java.util.UUID;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class UserModuleAnswerNotification implements LycorisSubjectMessage {

  private UUID userId;

  private UUID pushOrgModuleId;

  private String pushOrgModuleName;

  private UserModuleAnswerTask task;

  private List<UserModuleAnswerContact> contacts;
}
