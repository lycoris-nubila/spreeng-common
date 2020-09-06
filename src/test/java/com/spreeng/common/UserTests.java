package com.spreeng.common;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

import org.junit.Test;

import com.spreeng.common.user.UserDueTask;
import com.spreeng.common.user.UserRole;
import com.spreeng.common.user.UserStatus;
import com.spreeng.common.user.notification.UserCreatedNotification;
import com.spreeng.common.user.notification.UserTaskWeeklySummaryNotification;

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
                "test@test.com",
                true)
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    UserCreatedNotification message =
        TestUtils.getObjectMapper().readValue(json, UserCreatedNotification.class);

    assertThat(message, is(notNullValue()));

    assertThat(message.getId(), is(notNullValue()));
  }

  @Test
  public void testUserTaskWeeklySummaryNotification_canDeserialize() throws IOException {
    UserTaskWeeklySummaryNotification notification =
        UserTaskWeeklySummaryNotification.builder(
                UUID.randomUUID(),
                Arrays.asList(
                    new UserDueTask(Instant.now().toString(), null, UUID.randomUUID(), true, null)))
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    UserTaskWeeklySummaryNotification message =
        TestUtils.getObjectMapper().readValue(json, UserTaskWeeklySummaryNotification.class);

    assertThat(message, is(notNullValue()));

    assertThat(message.getUserId(), is(notNullValue()));

    assertThat(message.getUserDueTasks().get(0).isValid(), is(true));
  }
}
