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
public class ArticlePublishedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "ARTICLE_PUBLISHED_NOTIFICATION";

  private UUID id;

  public static ArticlePublishedNotificationBuilder<?, ?> builder(@NotNull UUID id) {
    return new ArticlePublishedNotificationBuilderImpl().id(id);
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
