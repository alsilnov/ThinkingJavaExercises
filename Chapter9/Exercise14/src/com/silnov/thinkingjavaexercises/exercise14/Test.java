package com.silnov.thinkingjavaexercises.exercise14;
interface A {
    void a();
    void aa();
}
interface B {
    void b();
    void bb();
}
interface C {
    void c();
    void cc();
}
interface D extends A, B, C {
    void d();
}
class Ancestor {}
public class Test  extends Ancestor implements D   {
    public void aa() {}
    public void bb() {}
    public void cc() {}
    public void a() {}
    public void b() {}
    public void c() {}
    public void d() {}
    static void methodA(A a) {}
    static void methodB(B b) {}
    static void methodC(C c) {}
    static void methodD(D d) {}
    public static void main(String[] args) {
        Test t = new Test();
        methodA(t);
        methodB(t);
        methodC(t);
        methodD(t);
    }
}