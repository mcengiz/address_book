package com.mc.addressbook.loader;

import java.util.ArrayList;
import java.util.List;

import com.mc.addressbook.model.Person;
import com.mc.addressbook.service.AddressBookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookLoaderTest {
  @Test
  public void addressBookLoader_shouldLoadTheFile() throws Exception {
    // given
    final List<Person> personList = new ArrayList<>();

    AddressBookLoader addressBookLoader = new AddressBookLoader("AddressBook");
    AddressBookService addressBookService = new AddressBookService() {
      public void addPerson(Person person) {
        personList.add(person);
      }
    };

    // when
    addressBookLoader.loadFile(addressBookService);

    // then
    assertEquals(5, personList.size());

    // and
    assertEquals("Bill McKnight", personList.get(0).getFullName());
    assertEquals("Paul Robinson", personList.get(1).getFullName());
    assertEquals("Gemma Lane", personList.get(2).getFullName());
    assertEquals("Sarah Stone", personList.get(3).getFullName());
    assertEquals("Wes Jackson", personList.get(4).getFullName());
  }

}
