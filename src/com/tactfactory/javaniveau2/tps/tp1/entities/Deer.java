package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	System.out.println("Your Deer named " + this.getName() + " just move walkink");
	
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	if(eatable instanceof Vegetable) {
        System.out.println("Your Deer named" + this.getName() + " just eat " + ((Vegetable) eatable).getName());
    } else {
        System.out.println("Your Deer named" + this.getName() + " cannot eat " + ((Animal) eatable).getName() );
    }
}
}
