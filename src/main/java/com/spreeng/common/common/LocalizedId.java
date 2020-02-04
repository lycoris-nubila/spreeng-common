package com.spreeng.common.common;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;

import org.hibernate.annotations.BatchSize;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@BatchSize(size = 100)
@SuppressWarnings("serial")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LocalizedId implements Serializable {

  private UUID id;

  private String locale;

  public LocalizedId(String locale) {
    this.locale = locale;
  }
}
