package com.spreeng.common.organization;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrganizationAddress {
  private String city;

  private String country;

  private String postalCode;

  private String address;
}
