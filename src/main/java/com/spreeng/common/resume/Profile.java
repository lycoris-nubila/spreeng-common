
package com.spreeng.common.resume;

import lombok.Getter;

@Getter
public class Profile {

  /** e.g. Facebook or Twitter */
  private String network;
  /** e.g. neutralthoughts */
  private String username;
  /** e.g. http://twitter.example.com/neutralthoughts */
  private String url;

  public Profile withNetwork(String network) {
    this.network = network;
    return this;
  }

  public Profile withUsername(String username) {
    this.username = username;
    return this;
  }

  public Profile withUrl(String url) {
    this.url = url;
    return this;
  }
}
