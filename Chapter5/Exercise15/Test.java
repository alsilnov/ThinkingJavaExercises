class Test {
    String tmp2;
    {
        tmp2 = "tmp2";
    }
    public void bar() {
        System.out.println(tmp2);
        System.out.println("bar()");
    }
    public static void main(String[] args) {
        (new Test()).bar();
    }
}