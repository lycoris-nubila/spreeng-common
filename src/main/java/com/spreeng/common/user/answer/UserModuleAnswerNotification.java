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
  
  private UUID reportTaskId;
  
  private List<String> notes;
  
  private UUID pushOrgModuleId;

  private UUID kanbanOrgModuleId;
  
  private String pushOrgModuleName;

  private String kanbanOrgModuleName;

  private UserModuleAnswerTask task;

  private UUID kanbanModuleFirstColumnId;

  private List<UserModuleAnswerContact> contacts;
}
