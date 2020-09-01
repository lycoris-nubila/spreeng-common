package com.spreeng.common.user;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@SuppressWarnings("serial")
public class UserDoneModule implements Serializable {

  private String name;

  private String date;

  private String documentUrl;

  private List<String> answers;
}
