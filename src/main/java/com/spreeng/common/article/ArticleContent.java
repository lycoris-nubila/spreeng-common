package com.spreeng.common.article;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ArticleContent {

  @NonNull private String title;

  @NonNull private String content;

  @NonNull private String language;


  public static ArticleContentBuilder<?, ?> builder(
      @NonNull String title,
      @NonNull String content,
      @NonNull String language) {
    return new ArticleContentBuilderImpl()
        .content(content)
        .language(language)
        .title(title);
  }
}
