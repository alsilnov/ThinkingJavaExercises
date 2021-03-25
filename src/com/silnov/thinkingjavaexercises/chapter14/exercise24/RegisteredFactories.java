package com.silnov.thinkingjavaexercises.chapter14.exercise24;

import com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.*;
import java.util.*;

/**
 * Null
 */
interface Null {

}

class Part {

  static List<Class<? extends Part>> partClasses = new ArrayList<Class<? extends Part>>();
  static {
    partClasses.add(FuelFilter.class);
    partClasses.add(AirFilter.class);
    partClasses.add(CabinAirFilter.class);
    partClasses.add(OilFilter.class);
    partClasses.add(FanBelt.class);
    partClasses.add(PowerSteeringBelt.class);
    partClasses.add(GeneratorBelt.class);
    partClasses.add(NullPart.class);
  }
  private static Random rand = new Random(47);

  public static Part createRandom() {
    int n = rand.nextInt(partClasses.size());
    try {
      return partClasses.get(n).newInstance();
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  public String toString() {
    return getClass().getSimpleName();
  }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
  // Create a Class Factory for each specific type:
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<FuelFilter> {
    public FuelFilter create() {
      return new FuelFilter();
    }
  }
}

class AirFilter extends Filter {
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<AirFilter> {
    public AirFilter create() {
      return new AirFilter();
    }
  }
}

class CabinAirFilter extends Filter {
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<CabinAirFilter> {
    public CabinAirFilter create() {
      return new CabinAirFilter();
    }
  }
}

class OilFilter extends Filter {
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<OilFilter> {
    public OilFilter create() {
      return new OilFilter();
    }
  }
}

class Belt extends Part {
}

class FanBelt extends Belt {
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<FanBelt> {
    public FanBelt create() {
      return new FanBelt();
    }
  }
}

class GeneratorBelt extends Belt {
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<GeneratorBelt> {
    public GeneratorBelt create() {
      return new GeneratorBelt();
    }
  }
}

class PowerSteeringBelt extends Belt {
  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<PowerSteeringBelt> {
    public PowerSteeringBelt create() {
      return new PowerSteeringBelt();
    }
  }
}

class NullPart extends Part implements Null {
  NullPart() {
    super();
  }

  public static final Part NULL = new NullPart();

  public static class Factory
      implements com.silnov.thinkingjavaexercises.chapter14.exercise24.factory.Factory<NullPart> {
    public NullPart create() {
      return (NullPart) NULL;
    }
  }

  public String toString() {
    return "NULL";
  }
}

public class RegisteredFactories {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Part.class);
    List<Part> partList = new ArrayList<Part>();
    for (int i = 0; i < 20; i++) {
      partList.add(Part.createRandom());
    }
    for (Part part : partList) {
      System.out.print(part.getClass().getSimpleName() + " ");
      counter.count(part);
    }
    System.out.println();
    System.out.println(counter);
  }
}