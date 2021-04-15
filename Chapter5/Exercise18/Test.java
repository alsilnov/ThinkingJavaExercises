class Test {
    Test(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test[] array = new Test[] { new Test("str1"), new Test("str2"), new Test("str3") };
    }
}