
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Reference {

  /** e.g. Timothy Cook */
  private String name;
  /**
   * e.g. Joe blogs was a great employee, who turned up to work at least once a week. He exceeded my
   * expectations when it came to doing nothing.
   */
  private String reference;

  public Reference withName(String name) {
    this.name = name;
    return this;
  }

  public Reference withReference(String reference) {
    this.reference = reference;
    return this;
  }
}
