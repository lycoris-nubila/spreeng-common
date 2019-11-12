package com.spreeng.message.article.notification;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class ArticleUnpublishedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "ARTICLE_UNPUBLISHED_NOTIFICATION";

  private UUID id;

  public static ArticleUnpublishedNotificationBuilder<?, ?> builder(@NotNull UUID id) {
    return new ArticleUnpublishedNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
