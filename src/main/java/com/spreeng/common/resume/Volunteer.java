
package com.spreeng.common.resume;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Volunteer {

  /** e.g. Facebook */
  private String organization;
  /** e.g. Software Engineer */
  private String position;
  /** e.g. http://facebook.example.com */
  private URI url;
  /** resume.json uses the ISO 8601 date standard e.g. 2014-06-29 */
  private String startDate;
  /** e.g. 2012-06-29 */
  private String endDate;
  /** Give an overview of your responsibilities at the company */
  private String summary;
  /** Specify accomplishments and achievements */
  @Valid private List<String> highlights = null;

  public Volunteer withOrganization(String organization) {
    this.organization = organization;
    return this;
  }

  public Volunteer withPosition(String position) {
    this.position = position;
    return this;
  }

  public Volunteer withUrl(URI url) {
    this.url = url;
    return this;
  }

  public Volunteer withStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public Volunteer withEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public Volunteer withSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public Volunteer withHighlights(List<String> highlights) {
    this.highlights = highlights;
    return this;
  }
}
