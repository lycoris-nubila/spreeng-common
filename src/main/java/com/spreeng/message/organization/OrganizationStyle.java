package com.spreeng.message.organization;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrganizationStyle {
  private OrganizationFont font;

  @NonNull
  private String primaryColor;

  private String thinkColor;

  private String planColor;

  private String executeColor;

  private String alertColor;

  private String successColor;

  public static OrganizationStyleBuilder<?, ?> builder(@NonNull String primaryColor) {
    return new OrganizationStyleBuilderImpl().primaryColor(primaryColor);
  }
}
