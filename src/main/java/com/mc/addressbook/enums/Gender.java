package com.mc.addressbook.enums;

import java.util.Arrays;

public enum Gender {
  MALE, FEMALE;

  public static Gender findValue(String value) {

    return Arrays.stream(Gender.values()).filter(g -> g.name().equalsIgnoreCase(value)).findFirst().get();
  }
}
