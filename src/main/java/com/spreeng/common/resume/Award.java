
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Award {

  /** e.g. One of the 100 greatest minds of the century */
  private String title;
  /** e.g. 1989-06-12 */
  private String date;
  /** e.g. Time Magazine */
  private String awarder;
  /** e.g. Received for my work with Quantum Physics */
  private String summary;

  public Award withTitle(String title) {
    this.title = title;
    return this;
  }

  public Award withDate(String date) {
    this.date = date;
    return this;
  }

  public Award withAwarder(String awarder) {
    this.awarder = awarder;
    return this;
  }

  public Award withSummary(String summary) {
    this.summary = summary;
    return this;
  }
}
