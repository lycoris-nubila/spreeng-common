
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Language {

  /** e.g. English, Spanish */
  private String language;
  /** e.g. Fluent, Beginner */
  private String fluency;

  public Language withLanguage(String language) {
    this.language = language;
    return this;
  }

  public Language withFluency(String fluency) {
    this.fluency = fluency;
    return this;
  }
}
