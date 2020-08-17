package com.silnov.thinkingjavaexercises.exercise15;
class AClass {
    private String aClassStr;
    AClass(String str) {
        this.aClassStr = str;
    }
    String getStr() {
        return aClassStr;
    }
}
public class Test {
    private String Str = "String";
    AClass getAClass() {
        return new AClass(Str) {
        };
    }
    public static void main(String[] args) {
        Test test = new Test();
        AClass aclass = test.getAClass();
        System.out.println(aclass.getStr());
    }
}