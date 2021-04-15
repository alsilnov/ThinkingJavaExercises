class Test {
    String str1 = "str1";
    String str2;

    Test() {
        str2 = "str2";
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.str1);
        System.out.println(test.str2);
    }
}
