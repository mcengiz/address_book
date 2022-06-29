package com.mc.addressbook.criteria;

import java.util.List;
import java.util.stream.Collectors;

import com.mc.addressbook.enums.Gender;
import com.mc.addressbook.model.Person;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GenderCriteria implements Criteria<List<Person>> {

  @NonNull
  private Gender gender;

  @Override
  public List<Person> find(List<Person> personList) {
    return personList.stream().filter(p -> p.getGender() == gender).collect(Collectors.toList());
  }
}
