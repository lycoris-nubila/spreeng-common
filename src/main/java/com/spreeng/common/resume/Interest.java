
package com.spreeng.common.resume;

import java.util.List;

import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Interest {

  /** e.g. Philosophy */
  private String name;

  @Valid private List<String> keywords = null;

  public Interest withName(String name) {
    this.name = name;
    return this;
  }

  public Interest withKeywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }
}
