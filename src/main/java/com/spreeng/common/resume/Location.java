
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Location {

  /**
   * To add multiple address lines, use . For example, 1234 Glücklichkeit Straße Hinterhaus 5. Etage
   * li.
   */
  private String address;

  private String postalCode;
  private String city;
  /** code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN */
  private String countryCode;
  /** The general region where you live. Can be a US state, or a province, for instance. */
  private String region;

  public Location withAddress(String address) {
    this.address = address;
    return this;
  }

  public Location withPostalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  public Location withCity(String city) {
    this.city = city;
    return this;
  }

  public Location withCountryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public Location withRegion(String region) {
    this.region = region;
    return this;
  }
}
