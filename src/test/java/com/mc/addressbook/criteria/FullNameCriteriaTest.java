package com.mc.addressbook.criteria;

import java.util.List;

import com.mc.addressbook.model.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.mc.addressbook.testutil.DataGenerator.PERSON_BILL;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_GEMMA;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_PAUL;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_SARAH;
import static com.mc.addressbook.testutil.DataGenerator.PERSON_WES;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FullNameCriteriaTest {

  List<Person> personList = of(PERSON_BILL, PERSON_GEMMA, PERSON_PAUL, PERSON_SARAH, PERSON_WES);

  @ParameterizedTest
  @ValueSource(strings = {"Bill McKnight", "Gemma Lane", "Paul Robinson", "Sarah Stone", "Wes Jackson"})
  public void fullNameCriteria_shouldReturnPersonByFullName(String fullName) throws Exception {
    Criteria<List<Person>> criteria = new FullNameCriteria(fullName);

    List<Person> result = criteria.find(personList);

    assertNotNull(result);
    assertEquals(1, result.size());
    assertEquals(fullName, result.get(0).getFullName());
  }

}
