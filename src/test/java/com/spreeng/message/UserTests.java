package com.spreeng.message;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.time.Instant;
import java.util.UUID;

import org.junit.Test;

import com.spreeng.message.user.UserRole;
import com.spreeng.message.user.UserStatus;
import com.spreeng.message.user.notification.UserCreatedNotification;

public class UserTests {

  @Test
  public void testTrackAddedNotification_canDeserialize() throws IOException {
    UserCreatedNotification notification =
        UserCreatedNotification.builder(
                UUID.randomUUID(),
                Instant.now().toEpochMilli(),
                Instant.now().toEpochMilli(),
                UserRole.ADMIN,
                UserStatus.ADDED,
                "Test",
                "Test",
                "test@test.com")
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    UserCreatedNotification message =
        TestUtils.getObjectMapper().readValue(json, UserCreatedNotification.class);

    assertThat(message, is(notNullValue()));

    assertThat(message.getId(), is(notNullValue()));
  }
}
