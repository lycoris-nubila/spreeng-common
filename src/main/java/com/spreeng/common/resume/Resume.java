
package com.spreeng.common.resume;

import java.util.List;
import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Resume {

  @Valid private Basics basics;
  @Valid private List<Work> work = null;
  @Valid private List<Volunteer> volunteer = null;
  @Valid private List<Education> education = null;
  /** Specify any awards you have received throughout your professional career */
  @Valid private List<Award> awards = null;
  /** Specify your publications through your career */
  @Valid private List<Publication> publications = null;
  /** List out your professional skill-set */
  @Valid private List<Skill> skills = null;
  /** List any other languages you speak */
  @Valid private List<Language> languages = null;

  @Valid private List<Interest> interests = null;
  /** List references you have received */
  @Valid private List<Reference> references = null;
  /** Specify career projects */
  @Valid private List<Project> projects = null;
  /** The schema version and any other tooling configuration lives here */
  @Valid private Meta meta;

  public Resume withBasics(Basics basics) {
    this.basics = basics;
    return this;
  }

  public Resume withWork(List<Work> work) {
    this.work = work;
    return this;
  }

  public Resume withVolunteer(List<Volunteer> volunteer) {
    this.volunteer = volunteer;
    return this;
  }

  public Resume withEducation(List<Education> education) {
    this.education = education;
    return this;
  }

  public Resume withAwards(List<Award> awards) {
    this.awards = awards;
    return this;
  }

  public Resume withPublications(List<Publication> publications) {
    this.publications = publications;
    return this;
  }

  public Resume withSkills(List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public Resume withLanguages(List<Language> languages) {
    this.languages = languages;
    return this;
  }

  public Resume withInterests(List<Interest> interests) {
    this.interests = interests;
    return this;
  }

  public Resume withReferences(List<Reference> references) {
    this.references = references;
    return this;
  }

  public Resume withProjects(List<Project> projects) {
    this.projects = projects;
    return this;
  }

  public Resume withMeta(Meta meta) {
    this.meta = meta;
    return this;
  }
}
