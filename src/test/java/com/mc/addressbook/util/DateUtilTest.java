package com.mc.addressbook.util;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateUtilTest {

  @Test
  public void daysBetween_shouldReturnDifferencesBetweenGivenDates() {
    // given
    LocalDate date1 = LocalDate.of(1977, 3, 16);
    LocalDate date2 = LocalDate.of(1985, 1, 15);

    // when
    long response = DateUtil.daysBetween(date1, date2);

    // then
    assertEquals(2862, response);
  }

  @Test
  public void daysBetween_shouldReturnZero_whenTheGivenDatesAreSame(){
    // given
    LocalDate date1 = LocalDate.of(77, 3, 16);
    LocalDate date2 = LocalDate.of(77, 3, 16);

    // when
    long response = DateUtil.daysBetween(date1, date2);

    // then
    assertEquals(0, response);
  }
}
