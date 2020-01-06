package com.spreeng.message.common;

import java.util.List;

import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

import com.spreeng.message.user.UserRole;

import eu.lycoris.spring.common.LycorisApplicationException;
import eu.lycoris.spring.common.LycorisGraphQLContext;

public class GraphQLController {

  protected void checkAuthorization(List<UserRole> roles, LycorisGraphQLContext context) {
    checkAuthorization(context);

    JwtAuthenticationToken jwtAuth = (JwtAuthenticationToken) context.getAuthentication();
    UserRole jwtRole = UserRole.valueOf(jwtAuth.getToken().getClaimAsString("role"));
    if (roles.stream().noneMatch(role -> jwtRole == role)) {
      throw new LycorisApplicationException(
          CommonMessage.ERROR_WEB_REQUEST_INSUFFICIENT_RIGHTS.getMessageKey());
    }
  }

  protected void checkAuthorization(LycorisGraphQLContext context) {
    if (context.getAuthentication() == null) {
      throw new LycorisApplicationException(
          CommonMessage.ERROR_WEB_REQUEST_UNAUTHORIZED.getMessageKey());
    }
  }
}
