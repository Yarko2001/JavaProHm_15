package com.hillel.dehtiar.secondpart;

import com.hillel.dehtiar.secondpart.fruits.Fruit;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

  private final List<T> boxOfFruits = new ArrayList<>();

  public void add(T fruit) {
    boxOfFruits.add(fruit);
  }

  public void viewAll() {
    System.out.println(boxOfFruits);
  }

  public Double getWeight() {
    Double sum = 0.0;
    for (T fruit : boxOfFruits) {
      sum += fruit.getWeight();
    }
    return sum;
  }

  public boolean compare(Box box) {
    return this.getWeight().equals(box.getWeight());
  }

  public void merge(Box<T> box) {
    this.boxOfFruits.addAll(box.boxOfFruits);
  }
}
