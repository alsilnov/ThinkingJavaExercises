
class Test {
    public enum Money {
        USD, EUR, RUR, CAD, GBP, JPY
    }

    public static void main(String... args) {
        for (Money i : Money.values()) {
            System.out.println(i + " " + i.ordinal());
        }
    }
}