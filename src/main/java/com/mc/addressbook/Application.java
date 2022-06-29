package com.mc.addressbook;

import java.util.List;

import com.mc.addressbook.criteria.Criteria;
import com.mc.addressbook.criteria.FullNameCriteria;
import com.mc.addressbook.criteria.GenderCriteria;
import com.mc.addressbook.criteria.OldestPersonCriteria;
import com.mc.addressbook.enums.Gender;
import com.mc.addressbook.loader.AddressBookLoader;
import com.mc.addressbook.model.Person;
import com.mc.addressbook.service.AddressBookService;
import com.mc.addressbook.util.DateUtil;

public class Application {

  public static void main(String[] args) throws Exception {
    AddressBookService addressBookService = new AddressBookService();
    AddressBookLoader addressBookLoader = new AddressBookLoader("AddressBook");
    addressBookLoader.loadFile(addressBookService);

    //Question 1
    Criteria<List<Person>> criteria = new GenderCriteria(Gender.MALE);
    List<Person> maleList = addressBookService.findBy(criteria);
    System.out.print("How many males are in the address book?\t");
    System.out.println("Answer: " + maleList.size());

    //Question 2
    criteria = new OldestPersonCriteria();
    List<Person> oldestPersonList = addressBookService.findBy(criteria);
    Person entryForOldestPerson = oldestPersonList.get(0);
    System.out.print("Who is the oldest person in the address book?\t");
    System.out.println("Answer: " + entryForOldestPerson.getFullName());

    //Question 3
    criteria = new FullNameCriteria("Bill McKnight");
    Person personForBill = addressBookService.findBy(criteria).get(0);
    criteria = new FullNameCriteria("Paul Robinson");
    Person personForPaul = addressBookService.findBy(criteria).get(0);
    System.out.print("How many days older is Bill than Paul?\t");
    System.out.println(
        "Answer: " + DateUtil.daysBetween(personForBill.getDateOfBirth(), personForPaul.getDateOfBirth()) + " days");
  }

}
