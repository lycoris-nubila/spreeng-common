package com.spreeng.common.user.answer;

import java.util.UUID;

import com.spreeng.common.contact.ContactRelationship;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserModuleAnswerContact {

  private UUID id;

  private UUID ownerId;
  
  private String language;
  
  private String lastName;
  
  private String firstName;

  private String companyName;

  private String phoneNumber;

  private String emailAddress;

  private ContactRelationship relationship;
}
