
package com.spreeng.common.resume;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;

import lombok.Getter;

@Getter
public class Basics {

  private String name;
  /** e.g. Web Developer */
  private String label;
  /** URL (as per RFC 3986) to a image in JPEG or PNG format */
  private String image;
  /** e.g. thomas@gmail.com */
  private String email;
  /** Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923 */
  private String phone;
  /** URL (as per RFC 3986) to your website, e.g. personal homepage */
  private URI url;
  /** Write a short 2-3 sentence biography about yourself */
  private String summary;

  @Valid private Location location;
  /** Specify any number of social networks that you participate in */
  @Valid private List<Profile> profiles = null;

  public Basics withName(String name) {
    this.name = name;
    return this;
  }

  public Basics withLabel(String label) {
    this.label = label;
    return this;
  }

  public Basics withImage(String image) {
    this.image = image;
    return this;
  }

  public Basics withEmail(String email) {
    this.email = email;
    return this;
  }

  public Basics withPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public Basics withUrl(URI url) {
    this.url = url;
    return this;
  }

  public Basics withSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public Basics withLocation(Location location) {
    this.location = location;
    return this;
  }

  public Basics withProfiles(List<Profile> profiles) {
    this.profiles = profiles;
    return this;
  }
}
