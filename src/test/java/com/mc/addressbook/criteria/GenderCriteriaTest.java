package com.mc.addressbook.criteria;

import java.util.List;

import com.mc.addressbook.enums.Gender;
import com.mc.addressbook.model.Person;
import org.junit.jupiter.api.Test;

import static com.mc.addressbook.testutil.DataGenerator.PERSON_BILL;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_GEMMA;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_PAUL;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_SARAH;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_WES;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenderCriteriaTest {
  List<Person> personList = of(PERSON_BILL, PERSON_GEMMA, PERSON_PAUL, PERSON_SARAH, PERSON_WES);

  @Test
  public void genderCriteria_shouldReturnMaleList() {
    Criteria<List<Person>> criteria = new GenderCriteria(Gender.MALE);

    List<Person> personListForMale = criteria.find(personList);

    assertEquals(personListForMale.size(), 3);
  }

  @Test
  public void genderCriteria_shouldReturnFemaleList() {
    Criteria<List<Person>> criteria = new GenderCriteria(Gender.FEMALE);

    List<Person> personListForMale = criteria.find(personList);

    assertEquals(personListForMale.size(), 2);
  }

}
