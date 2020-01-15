package com.spreeng.common.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonMessage {
  ERROR_WEB_REQUEST_NOT_AUDIO("error.web.request.not-audio"),
  ERROR_WEB_REQUEST_NOT_A_FILE("error.web.request.not-a-file"),
  ERROR_WEB_REQUEST_UNAUTHORIZED("error.web.request.unauthorized"),
  ERROR_WEB_REQUEST_NOT_AN_IMAGE("error.web.request.not-an-image"),
  ERROR_WEB_REQUEST_INTERNAL_ERROR("error.web.request.internal-error"),
  ERROR_WEB_REQUEST_INSUFFICIENT_RIGHTS("error.web.request.insufficient-rights");

  private String messageKey;
}
