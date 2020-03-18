class Test {
    static String tmp1;
    static String tmp2;
    String tmp3;
    static {
        tmp1 = "tmp1";
        System.out.println(tmp1);
        tmp2 = "tmp2";
        System.out.println(tmp2);
        //tmp3 = "tmp3"; - non-static variable tmp3 cannot be referenced from a static context 
        //System.out.println(tmp3);
    }
    {
        tmp3 = "tmp3";
        System.out.println(tmp3);
    }
    public void foo() {}
    public static void bar() {
        System.out.println("bar()");
    }
    Test() {
        System.out.println("Test");
    }
    public static void main(String[] args) {
        //Test.foo(); - non-static method foo() cannot be referenced from a static context
        Test.bar();
        //System.out.println("in main " + Test.tmp1);
        //Test test1 = new Test();
        //Test test2 = new Test(); 
    }
}