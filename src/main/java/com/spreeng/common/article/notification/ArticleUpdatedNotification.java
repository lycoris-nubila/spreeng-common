package com.spreeng.common.article.notification;

import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.article.ArticleI18n;
import com.spreeng.common.article.ArticleStatus;
import com.spreeng.common.article.ArticleVisibility;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class ArticleUpdatedNotification extends ArticleNotification {

  public static final String SUBJECT = "ARTICLE_UPDATED_NOTIFICATION";

  public static ArticleUpdatedNotificationBuilder<?, ?> builder(
      @NotNull UUID id,
      @NotNull Long updateDateTime,
      @NotNull Long creationDateTime,
      @NotNull List<ArticleI18n> content,
      @NotNull ArticleStatus status,
      @NotNull ArticleVisibility visibility,
      @NotNull UUID authorId) {
    return new ArticleUpdatedNotificationBuilderImpl()
        .id(id)
        .updateDateTime(updateDateTime)
        .creationDateTime(creationDateTime)
        .status(status)
        .localizations(content)
        .visibility(visibility)
        .authorId(authorId);
  }

  protected ArticleUpdatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
