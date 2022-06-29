package com.mc.addressbook.loader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.mc.addressbook.enums.Gender;
import com.mc.addressbook.model.Person;
import com.mc.addressbook.service.AddressBookService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import static java.nio.charset.StandardCharsets.UTF_8;

@RequiredArgsConstructor
public class AddressBookLoader {

  private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yy");
  private final static String SEPARATOR = ", ";

  @NonNull
  private String filename;

  public void loadFile(AddressBookService addressBookService) throws Exception {
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        InputStreamReader reader = new InputStreamReader(inputStream, UTF_8);
        BufferedReader br = new BufferedReader(reader)) {

      String strLine;
      while ((strLine = br.readLine()) != null) {
        String[] parts = strLine.split(SEPARATOR);

        Person person = Person.builder().fullName(parts[0]).gender(Gender.findValue(parts[1]))
            .dateOfBirth(LocalDate.parse(parts[2], DATE_FORMATTER)).build();

        addressBookService.addPerson(person);
      }
    }
  }

}
