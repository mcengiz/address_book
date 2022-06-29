package com.mc.addressbook.criteria;

import java.util.Comparator;
import java.util.List;

import com.mc.addressbook.model.Person;

import static java.util.Collections.singletonList;
import static java.util.Comparator.comparing;

public class OldestPersonCriteria implements Criteria<List<Person>> {

  @Override
  public List<Person> find(List<Person> personList) {
    return singletonList(personList.stream().min(comparing(Person::getDateOfBirth)).get());
  }
}
