package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("Your Hyena named " + this.getName() + " just move walking");
	
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	if(eatable instanceof Animal) {
        System.out.println("Your Hyena named" + this.getName() + " just eat " + ((Animal) eatable).getName());
    } else {
        System.out.println("Your Hyena named" + this.getName() + " cannot eat " + ((Vegetable) eatable).getName() );
    }
}
}
