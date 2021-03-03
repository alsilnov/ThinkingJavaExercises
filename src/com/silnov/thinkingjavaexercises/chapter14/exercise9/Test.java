package com.silnov.thinkingjavaexercises.chapter14.exercise9;

class A { int i; String s; }

class B extends A { int j; float f; }

class C extends B { int k; B b;}

public class Test {
  public static void Hierarchy(Object o) {
		Object[] fields = o.getClass().getDeclaredFields();
    if (fields.length == 0) {
			System.out.println(o.getClass().getSimpleName() + " has no fields");
    }
    if(fields.length > 0) {
			System.out.println("Field(s) of " + o.getClass().getSimpleName() + ":");
			for(Object obj : fields) {
				System.out.println(" " + obj);
      }
		}
    if (o.getClass().getSuperclass() != null) {
      System.out.println(o.getClass().getSimpleName() + " is a subclass of " + o.getClass().getSuperclass().getSimpleName());
      try {
        Hierarchy(o.getClass().getSuperclass().newInstance());
      } catch (InstantiationException e) {
        System.out.println("Unable to instantiate obj");
      } catch (IllegalAccessException e) {
        System.out.println("Unable to access");
      }
    }
  }
  public static void main(String[] args) {
    Hierarchy(new C());
  }
}