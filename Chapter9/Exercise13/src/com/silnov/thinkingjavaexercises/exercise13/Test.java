package com.silnov.thinkingjavaexercises.exercise13;
interface A {
    void a();
}
interface B extends A{
    void b();
}
interface C extends A {
    void c();
}
interface D extends B, C {
    void d();
}
public class Test  implements D {
    public void a() {}
    public void b() {}
    public void c() {}
    public void d() {}
    public static void main(String[] args) {
        Test t = new Test();
        t.a();
        t.b();
        t.c();
        t.d();
    }
}