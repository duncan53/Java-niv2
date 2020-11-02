package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("Your Turtle named " + this.getName() + " just move walking or swiming");
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	if (eatable instanceof Vegetable) {
        System.out.println("Your Turtle named" + this.getName() + "just eat " + ((Vegetable) eatable).getName());
    } else if (eatable instanceof Animal) {
        System.out.println("Your Turtle named" + this.getName() + "just eat " + ((Animal) eatable).getName());
    }
}
}
