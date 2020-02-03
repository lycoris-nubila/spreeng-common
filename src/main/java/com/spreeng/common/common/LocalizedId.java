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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LocalizedId implements Serializable {

  private static final long serialVersionUID = 1089196571270403924L;

  private UUID id;

  private String locale;

  public LocalizedId(String locale) {
    super();
    this.locale = locale;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LocalizedId other = (LocalizedId) obj;
    if (locale == null) {
      if (other.locale != null) return false;
    } else if (!locale.equals(other.locale)) return false;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((locale == null) ? 0 : locale.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
}
