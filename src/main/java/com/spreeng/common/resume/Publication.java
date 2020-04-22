
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Publication {

  /** e.g. The World Wide Web */
  private String name;
  /** e.g. IEEE, Computer Magazine */
  private String publisher;
  /** e.g. 1990-08-01 */
  private String releaseDate;
  /** e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html */
  private String url;
  /** Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML. */
  private String summary;

  public Publication withName(String name) {
    this.name = name;
    return this;
  }

  public Publication withPublisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  public Publication withReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  public Publication withUrl(String url) {
    this.url = url;
    return this;
  }

  public Publication withSummary(String summary) {
    this.summary = summary;
    return this;
  }
}
