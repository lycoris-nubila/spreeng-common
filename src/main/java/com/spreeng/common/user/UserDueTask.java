package com.spreeng.common.user;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@AllArgsConstructor
@SuppressWarnings("serial")
public class UserDueTask implements Serializable {

  private String date;

  private String title;

  private UUID moduleId;

  @JsonProperty("isValid")
  @Accessors(fluent = true)
  private Boolean isValid;

  private String description;

  public void setTexts(String title, String description) {
    this.description = description;
    this.isValid = true;
    this.title = title;
  }
}
