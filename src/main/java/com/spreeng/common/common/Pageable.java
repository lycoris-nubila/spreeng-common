package com.spreeng.common.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Pageable<T> {

  private String nextPageToken;

  @NonNull private List<T> elements;

  @NonNull private Long totalElements;
}
