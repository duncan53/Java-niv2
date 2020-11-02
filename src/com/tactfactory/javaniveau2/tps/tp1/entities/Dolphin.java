package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("Your Dophin named " + this.getName() + " just move swiming");
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	if(eatable instanceof Animal) {
        System.out.println("Your Dolphin named" + this.getName() + " just eat " + ((Animal) eatable).getName());
    } else {
        System.out.println("Your Dolphin named" + this.getName() + " cannot eat " + ((Vegetable) eatable).getName() );
    }
}
}
