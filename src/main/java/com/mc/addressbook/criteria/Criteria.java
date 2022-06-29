package com.mc.addressbook.criteria;

@FunctionalInterface
public interface Criteria<T> {

  T find(T t);
}
