
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Meta {

  /** URL (as per RFC 3986) to latest version of this document */
  private String canonical;
  /** A version field which follows semver - e.g. v1.0.0 */
  private String version;
  /** Using ISO 8601 with YYYY-MM-DDThh:mm:ss */
  private String lastModified;

  public Meta withCanonical(String canonical) {
    this.canonical = canonical;
    return this;
  }

  public Meta withVersion(String version) {
    this.version = version;
    return this;
  }

  public Meta withLastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }
}
