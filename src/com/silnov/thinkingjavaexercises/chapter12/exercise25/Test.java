package com.silnov.thinkingjavaexercises.chapter12.exercise25;
class AException extends Exception {}
class BException extends AException {}
class CException extends BException {}
class A {
	void f() throws AException {
		throw new AException();
	}
}
class B extends A {
	void f() throws BException {
		throw new BException();
	}
}
class C extends B {
	void f() throws CException {
		throw new CException();
	}
}
public class Test {
	public static void main(String[] args) {		
		A a = new C();
		try {
			a.f();
		}	catch(CException e3) {
			System.out.println("Caught e3");			
		}	catch(BException e2) {
			System.out.println("Caught e2");
		}	catch(AException e1) {
			System.out.println("Caught e1");
		}		
	}
}