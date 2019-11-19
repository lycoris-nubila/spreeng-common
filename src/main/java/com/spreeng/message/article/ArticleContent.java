package com.spreeng.message.article;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ArticleContent {

  private String videoId;

  @NonNull private String title;

  @NonNull private String content;

  @NonNull private String language;

  @NonNull private String pictureUrl;

  public static ArticleContentBuilder<?, ?> builder(
      @NonNull String title,
      @NonNull String content,
      @NonNull String language,
      @NonNull String pictureUrl) {
    return new ArticleContentBuilderImpl()
        .content(content)
        .language(language)
        .pictureUrl(pictureUrl)
        .title(title);
  }
}
