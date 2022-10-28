package com.hillel.dehtiar.secondpart;

import com.hillel.dehtiar.secondpart.fruits.Apple;
import com.hillel.dehtiar.secondpart.fruits.Peach;

public class Main {

  public static void main(String[] args) {

    Box<Apple> appleBox = new Box<>();
    appleBox.add(new Apple(30.2));
    appleBox.add(new Apple(55.5));
    appleBox.add(new Apple(30.0));
    appleBox.add(new Apple(35.2));

    Box<Peach> peachBox = new Box<>();
    peachBox.add(new Peach(25.5));
    peachBox.add(new Peach(30.0));

    Box<Peach> newPeachBox = new Box<>();
    newPeachBox.add(new Peach(44.5));
    newPeachBox.add(new Peach(44.0));

    appleBox.viewAll();

    System.out.println("Box weight: " + appleBox.getWeight() + "g");

    System.out.println(peachBox.compare(newPeachBox));

    peachBox.merge(newPeachBox);

    peachBox.viewAll();
  }

}
