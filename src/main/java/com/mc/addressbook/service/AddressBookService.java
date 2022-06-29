package com.mc.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import com.mc.addressbook.criteria.Criteria;
import com.mc.addressbook.model.Person;

public class AddressBookService {

  private List<Person> personList = new ArrayList<>();

  public void addPerson(Person person) {
    personList.add(person);
  }

  public List<Person> findBy(Criteria<List<Person>> criteria) {
    return criteria.find(personList);
  }

  public int size() {
    return personList.size();
  }
}
