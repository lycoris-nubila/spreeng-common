package com.spreeng.common.document.notification;

import java.util.UUID;

import com.spreeng.common.document.DocumentType;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class DocumentNotification implements LycorisSubjectMessage {

  @NonNull private UUID id;

  @NonNull private UUID ownerId;

  private UUID orgModule;

  @NonNull private DocumentType type;

  @NonNull private Long updateTimestamp;

  @NonNull private Long creationTimestamp;
}
