package com.spreeng.common.article.notification;

import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.common.article.ArticleContent;
import com.spreeng.common.article.ArticleStatus;
import com.spreeng.common.article.ArticleVisibility;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class ArticleCreatedNotification extends ArticleNotification {

  public static final String SUBJECT = "ARTICLE_CREATED_NOTIFICATION";

  public static ArticleCreatedNotificationBuilder<?, ?> builder(
      @NotNull UUID id,
      @NotNull Long updateDateTime,
      @NotNull Long creationDateTime,
      @NotNull String pictureUrl,
      @NotNull String videoId,
      @NotNull List<ArticleContent> content,
      @NotNull ArticleStatus status,
      @NotNull ArticleVisibility visibility,
      @NotNull UUID authorId) {
    return new ArticleCreatedNotificationBuilderImpl()
        .id(id)
        .updateDateTime(updateDateTime)
        .creationDateTime(creationDateTime)
        .pictureUrl(pictureUrl)
        .videoId(videoId)
        .content(content)
        .status(status)
        .visibility(visibility)
        .authorId(authorId);
  }

  protected ArticleCreatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
