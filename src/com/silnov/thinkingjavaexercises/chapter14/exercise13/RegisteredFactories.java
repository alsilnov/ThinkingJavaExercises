package com.silnov.thinkingjavaexercises.chapter14.exercise13;
import com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.*;
import java.util.*;

class Part {

  static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();	
  static {
    partFactories.add(new FuelFilter.Factory());
    partFactories.add(new AirFilter.Factory());
    partFactories.add(new CabinAirFilter.Factory());
    partFactories.add(new OilFilter.Factory());
    partFactories.add(new FanBelt.Factory());
    partFactories.add(new PowerSteeringBelt.Factory());
    partFactories.add(new GeneratorBelt.Factory());
  }
  private static Random rand = new Random(47);
  public static Part createRandom() {

    int n = rand.nextInt(partFactories.size());
    return partFactories.get(n).create();
  }
  public String toString() {
    return getClass().getSimpleName();
  }
}

class Filter extends Part {}

class FuelFilter extends Filter {
  // Create a Class Factory for each specific type:
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<FuelFilter> {
    public FuelFilter create() { return new FuelFilter(); }
  }
}

class AirFilter extends Filter {
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<AirFilter> {
    public AirFilter create() { return new AirFilter(); }
  }
}	

class CabinAirFilter extends Filter {
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<CabinAirFilter> {
    public CabinAirFilter create() {
      return new CabinAirFilter();
    }
  }
}

class OilFilter extends Filter {
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<OilFilter> {
    public OilFilter create() { return new OilFilter(); }
  }
}	

class Belt extends Part {}

class FanBelt extends Belt {
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<FanBelt> {
    public FanBelt create() { return new FanBelt(); }
  }
}

class GeneratorBelt extends Belt {
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<GeneratorBelt> {
    public GeneratorBelt create() {
      return new GeneratorBelt();
    }
  }
}	

class PowerSteeringBelt extends Belt {
  public static class Factory
  implements com.silnov.thinkingjavaexercises.chapter14.exercise13.factory.Factory<PowerSteeringBelt> {
    public PowerSteeringBelt create() {
      return new PowerSteeringBelt();
    }
  }
}	

public class RegisteredFactories {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Part.class);
    List<Part> partList = new ArrayList<Part>();
		for(int i = 0; i < 20; i++) {		
			partList.add(Part.createRandom());
    }
		for(Part part : partList) {
			System.out.print(part .getClass().getSimpleName() + " ");
			counter.count(part );
		}
		System.out.println(); 
		System.out.println(counter);
  }
}