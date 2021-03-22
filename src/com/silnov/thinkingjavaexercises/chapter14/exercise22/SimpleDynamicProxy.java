package com.silnov.thinkingjavaexercises.chapter14.exercise22;
import java.util.*;
import java.lang.reflect.*;

interface Interface {
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() {
		System.out.println("doSomething");
	}

	public void somethingElse(String arg) {
		System.out.println("somethingElse " + arg);
	}
}

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;

	DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long timeIn = new Date().getTime();
		System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args + ", invoked at " + timeIn + " on " + (new Date()));
		if (args != null) {
			for (Object arg : args) {
				System.out.println("  " + arg);
			}
		}
		long timeOut = new Date().getTime();
		System.out.println("Call-return time = " + (timeOut - timeIn) + " msecs");
		return method.invoke(proxied, args);
	}
}

class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		// Insert a proxy and call again:
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[] { Interface.class }, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}