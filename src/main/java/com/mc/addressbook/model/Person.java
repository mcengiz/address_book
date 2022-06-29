package com.mc.addressbook.model;

import java.time.LocalDate;

import com.mc.addressbook.enums.Gender;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class Person {

  private String fullName;
  private LocalDate dateOfBirth;
  private Gender gender;

}
