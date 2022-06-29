package com.mc.addressbook.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenderTest {

  @Test
  public void findValue_shouldReturnGenderTypeForGivenValue() {
    // expect
    assertEquals(Gender.MALE, Gender.findValue("Male"));
    assertEquals(Gender.FEMALE, Gender.findValue("Female"));
  }

}
