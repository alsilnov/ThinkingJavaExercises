
package com.silnov.thinkingjavaexercises.chapter14.exercise15.pets;
import java.util.*;
import com.silnov.thinkingjavaexercises.chapter14.exercise15.Factory;

public class FactoryPetCreator extends PetCreator {
  @Override
  public String toString() {
      return getClass().getCanonicalName();
  }
  	static List<Factory<? extends Pet>> petFactories = 
  		new ArrayList<Factory<? extends Pet>>();
  	static {
  		petFactories.add(new Pet.Factory());
  		petFactories.add(new Cat.Factory());
  		petFactories.add(new Cymric.Factory());
  		petFactories.add(new Dog.Factory());
  		petFactories.add(new EgyptianMau.Factory());
  		petFactories.add(new Gerbil.Factory());
  		petFactories.add(new Hamster.Factory());
  		petFactories.add(new Manx.Factory());
  		petFactories.add(new Mouse.Factory());
  		petFactories.add(new Mutt.Factory());
  		petFactories.add(new Pug.Factory());
  		petFactories.add(new Rat.Factory());
  		petFactories.add(new Rodent.Factory());
  	}
  	private static Random rand = new Random();

    @Override
  	public  Pet randomPet() {
  		int n = rand.nextInt(petFactories.size());
  		return petFactories.get(n).create();
  	}
    @Override
    public List<Class<? extends Pet>> types() {
      // TODO Auto-generated method stub
      return null;
    }
}
