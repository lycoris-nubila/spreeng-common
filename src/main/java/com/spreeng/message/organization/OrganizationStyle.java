package com.spreeng.message.organization;

import static javax.persistence.EnumType.STRING;

import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrganizationStyle {

  @NonNull private String primaryColor;

  @NonNull private String secondaryColor;

  @NonNull private String tertiaryColor;

  @Enumerated(STRING)
  private OrganizationFont font;

  private String negativeColor;

  private String positiveColor;

  private String primaryTextColor;

  private String secondaryTextColor;

  public static OrganizationStyleBuilder<?, ?> builder(
      @NonNull String primaryColor, @NonNull String secondaryColor, @NonNull String tertiaryColor) {
    return new OrganizationStyleBuilderImpl()
        .primaryColor(primaryColor)
        .secondaryColor(secondaryColor)
        .tertiaryColor(tertiaryColor);
  }
}
