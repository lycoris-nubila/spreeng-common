
package com.spreeng.common.resume;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Work {

  /** e.g. Facebook */
  private String name;

  private String company;
  /** e.g. Menlo Park, CA */
  private String location;
  /** e.g. Social Media Company */
  private String description;
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
  /** Specify multiple accomplishments */
  @Valid private List<String> highlights = null;

  public Work withName(String name) {
    this.company = name;
    this.name = name;
    return this;
  }

  public Work withLocation(String location) {
    this.location = location;
    return this;
  }

  public Work withDescription(String description) {
    this.description = description;
    return this;
  }

  public Work withPosition(String position) {
    this.position = position;
    return this;
  }

  public Work withUrl(URI url) {
    this.url = url;
    return this;
  }

  public Work withStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public Work withEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public Work withSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public Work withHighlights(List<String> highlights) {
    this.highlights = highlights;
    return this;
  }
}
