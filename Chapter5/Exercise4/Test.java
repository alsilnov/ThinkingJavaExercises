class Test {
    Test() {
        System.out.println("without parametrs");
    }
    Test(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test("hello");
    }
}

