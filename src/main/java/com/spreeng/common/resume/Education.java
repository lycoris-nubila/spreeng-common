
package com.spreeng.common.resume;

import java.util.List;

import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Education {

  /** e.g. Massachusetts Institute of Technology */
  private String institution;
  /** e.g. Arts */
  private String area;
  /** e.g. Bachelor */
  private String studyType;
  /** e.g. 2014-06-29 */
  private String startDate;
  /** e.g. 2012-06-29 */
  private String endDate;
  /** grade point average, e.g. 3.67/4.0 */
  private String gpa;
  /** List notable courses/subjects */
  @Valid private List<String> courses = null;

  public Education withInstitution(String institution) {
    this.institution = institution;
    return this;
  }

  public Education withArea(String area) {
    this.area = area;
    return this;
  }

  public Education withStudyType(String studyType) {
    this.studyType = studyType;
    return this;
  }

  public Education withStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public Education withEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public Education withGpa(String gpa) {
    this.gpa = gpa;
    return this;
  }

  public Education withCourses(List<String> courses) {
    this.courses = courses;
    return this;
  }
}
