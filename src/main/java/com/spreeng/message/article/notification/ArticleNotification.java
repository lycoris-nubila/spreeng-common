package com.spreeng.message.article.notification;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spreeng.message.article.ArticleStatus;
import com.spreeng.message.article.ArticleVisibility;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class ArticleNotification implements LycorisSubjectMessage {

  @NotNull private UUID id;

  @NotNull private Long updateDateTime;

  @NotNull private Long creationDateTime;

  private String videoId;

  @NotBlank private String pictureUrl;

  @NotNull private ArticleStatus status;

  @NotNull private ArticleVisibility visibility;

  @NotNull private UUID authorId;
}
