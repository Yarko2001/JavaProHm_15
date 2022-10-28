package com.hillel.dehtiar.firstpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

  public static void main(String[] args) {
    String[] words = {"can", "must", "should", "help"};
    System.out.println(toList(words));
  }
  @SafeVarargs
  public static <T> List<T> toList(T... arr) {
    return new ArrayList<>(Arrays.asList(arr));
  }

}
