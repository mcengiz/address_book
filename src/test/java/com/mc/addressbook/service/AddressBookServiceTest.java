package com.mc.addressbook.service;

import java.util.Collections;
import java.util.List;

import com.mc.addressbook.criteria.Criteria;
import com.mc.addressbook.model.Person;
import com.mc.addressbook.testutil.DataGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AddressBookServiceTest {
  private final AddressBookService addressBookService = new AddressBookService();

  @Test
  public void addPerson_shouldAddPerson() {

    assertEquals(0, addressBookService.size());

    addressBookService.addPerson(DataGenerator.PERSON_BILL);
    assertEquals(1, addressBookService.size());

    addressBookService.addPerson(DataGenerator.PERSON_PAUL);
    assertEquals(2, addressBookService.size());
  }

  @Test
  public void findBy_shouldReturnPersonForGivenCriteria() {
    // given
    Criteria<List<Person>> criteriaMock = mock(Criteria.class);
    List<Person> expectedPersonList = Collections.singletonList(DataGenerator.PERSON_BILL);
    when(criteriaMock.find(ArgumentMatchers.anyList())).thenReturn(expectedPersonList);

    // when
    List<Person> personList = addressBookService.findBy(criteriaMock);

    // then
    assertEquals(expectedPersonList, personList);
  }

}
