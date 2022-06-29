package com.mc.addressbook.criteria;

import java.util.List;
import java.util.stream.Collectors;

import com.mc.addressbook.model.Person;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FullNameCriteria implements Criteria<List<Person>> {

  @NonNull
  private String fullName;

  @Override
  public List<Person> find(List<Person> personList) {
    return personList.stream().filter(p -> p.getFullName().equals(fullName)).collect(Collectors.toList());
  }
}
