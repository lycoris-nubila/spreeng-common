
package com.spreeng.common.resume;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Project {

  /** e.g. The World Wide Web */
  private String name;
  /** Short summary of project. e.g. Collated works of 2017. */
  private String description;
  /** Specify multiple features */
  @Valid private List<String> highlights = null;
  /** Specify special elements involved */
  @Valid private List<String> keywords = null;
  /** resume.json uses the ISO 8601 date standard e.g. 2014-06-29 */
  private String startDate;
  /** e.g. 2012-06-29 */
  private String endDate;
  /** e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html */
  private URI url;
  /** Specify your role on this project or in company */
  @Valid private List<String> roles = null;
  /** Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ' */
  private String entity;
  /** e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference' */
  private String type;

  public Project withName(String name) {
    this.name = name;
    return this;
  }

  public Project withDescription(String description) {
    this.description = description;
    return this;
  }

  public Project withHighlights(List<String> highlights) {
    this.highlights = highlights;
    return this;
  }

  public Project withKeywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public Project withStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public Project withEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public Project withUrl(URI url) {
    this.url = url;
    return this;
  }

  public Project withRoles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Project withEntity(String entity) {
    this.entity = entity;
    return this;
  }

  public Project withType(String type) {
    this.type = type;
    return this;
  }
}
