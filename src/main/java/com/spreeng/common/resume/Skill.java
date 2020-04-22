
package com.spreeng.common.resume;

import java.util.List;
import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Skill {

  /** e.g. Web Development */
  private String name;
  /** e.g. Master */
  private String level;
  /** List some keywords pertaining to this skill */
  @Valid private List<String> keywords = null;

  public Skill withName(String name) {
    this.name = name;
    return this;
  }

  public Skill withLevel(String level) {
    this.level = level;
    return this;
  }

  public Skill withKeywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }
}
