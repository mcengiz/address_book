package com.mc.addressbook.criteria;

import java.util.List;

import com.mc.addressbook.model.Person;
import org.junit.jupiter.api.Test;

import static com.mc.addressbook.testutil.DataGenerator.PERSON_BILL;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_GEMMA;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_PAUL;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_SARAH;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_WES;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OldestPersonCriteriaTest {

  List<Person> personList = of(PERSON_BILL, PERSON_GEMMA, PERSON_PAUL, PERSON_SARAH, PERSON_WES);

  @Test
  public void oldestPersonCriteria_shouldFindOldestPerson() {
    Criteria<List<Person>> criteria = new OldestPersonCriteria();

    Person oldestPerson = criteria.find(personList).get(0);

    assertEquals(PERSON_WES.getFullName(), oldestPerson.getFullName());
  }

}
