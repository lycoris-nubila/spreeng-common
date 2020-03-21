package com.spreeng.common.article;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ArticleI18n {

  @NonNull private String title;

  @NonNull private String content;

  @NonNull private String language;

  @NonNull private String pictureUrl;

  private String videoId;

  public static ArticleI18nBuilder<?, ?> builder(
      @NonNull String title,
      @NonNull String content,
      @NonNull String language,
      @NonNull String pictureUrl) {
    return new ArticleI18nBuilderImpl()
        .content(content)
        .language(language)
        .pictureUrl(pictureUrl)
        .title(title);
  }
}
