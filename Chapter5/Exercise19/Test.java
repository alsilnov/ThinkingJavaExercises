class Test {

    public static void foo(String... array) {
        System.out.println(array.getClass());
        System.out.println(array.length);
        for (String i : array) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test.foo();
        Test.foo("str");
        Test.foo(new String[] { "str", "str1" });
    }
}