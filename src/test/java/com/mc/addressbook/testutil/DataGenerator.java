package com.mc.addressbook.testutil;

import java.time.LocalDate;

import com.mc.addressbook.enums.Gender;
import com.mc.addressbook.model.Person;

public class DataGenerator {

  public static final Person PERSON_BILL = Person.builder().fullName("Bill McKnight").gender(Gender.MALE)
      .dateOfBirth(LocalDate.of(1977, 3, 16)).build();

  public static final Person PERSON_PAUL = Person.builder().fullName("Paul Robinson").gender(Gender.MALE)
      .dateOfBirth(LocalDate.of(1985, 1, 15)).build();

  public static final Person PERSON_GEMMA = Person.builder().fullName("Gemma Lane").gender(Gender.FEMALE)
      .dateOfBirth(LocalDate.of(1991, 11, 20)).build();

  public static final Person PERSON_SARAH = Person.builder().fullName("Sarah Stone").gender(Gender.FEMALE)
      .dateOfBirth(LocalDate.of(1980, 9, 20)).build();

  public static final Person PERSON_WES = Person.builder().fullName("Wes Jackson").gender(Gender.MALE)
      .dateOfBirth(LocalDate.of(1974, 8, 14)).build();
}
