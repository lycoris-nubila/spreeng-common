package com.spreeng.common.document.notification;

import java.util.UUID;

import com.spreeng.common.document.DocumentType;

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
public class DocumentCreatedNotification extends DocumentNotification {

  public static final String SUBJECT = "DOCUMENT_CREATED_NOTIFICATION";

  public static DocumentCreatedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateTimestamp,
      @NonNull Long creationTimestamp,
      @NonNull UUID ownerId,
      @NonNull DocumentType type) {
    return new DocumentCreatedNotificationBuilderImpl()
        .id(id)
        .updateTimestamp(updateTimestamp)
        .creationTimestamp(creationTimestamp)
        .ownerId(ownerId)
        .type(type);
  }

  @Override
  public String getSubject() {
    return SUBJECT;
  }
}
