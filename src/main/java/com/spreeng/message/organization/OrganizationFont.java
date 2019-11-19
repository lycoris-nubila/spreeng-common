package com.spreeng.message.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationFont {
  ROBOT("'Roboto', sans-serif"),
  OPEN_SANS("'Open Sans', sans-serif"),
  MONTESERRAT("'Montserrat', sans-serif");

  private String font;
}