package com.spreeng.message.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationFont {
  ROBOTO("'Roboto', sans-serif"),
  OPEN_SANS("'Open Sans', sans-serif"),
  MONTSERRAT("'Montserrat', sans-serif");

  private String font;
}
