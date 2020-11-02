package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("Your Dog named " + this.getName() + " just move walkink");
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	if (eatable instanceof Vegetable) {
        System.out.println("Your Dog named" + this.getName() + "just eat " + ((Vegetable) eatable).getName());
    } else if (eatable instanceof Animal) {
        System.out.println("Your Dog named" + this.getName() + "just eat " + ((Animal) eatable).getName());
    }
}
}
