package com.mc.addressbook.util;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateUtil {

  public static long daysBetween(LocalDate startDate, LocalDate endDate) {
    return DAYS.between(startDate, endDate);
  }
}
