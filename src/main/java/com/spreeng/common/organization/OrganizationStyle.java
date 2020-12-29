package com.spreeng.common.organization;

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
  
  private String primaryPastelColor;

  private String primaryTextColor;

  private String secondaryColor;
  
  private String secondaryPastelColor;

  private String secondaryTextColor;

  private String negativeColor;

  private String positiveColor;

  private String textColor;

  private String textSecondaryColor;
  
  private String componentColoredBackgroundColor;

  @Enumerated(STRING)
  private OrganizationFont font;

  public static OrganizationStyleBuilder<?, ?> builder(@NonNull String primaryColor) {
    return new OrganizationStyleBuilderImpl().primaryColor(primaryColor);
  }
}
