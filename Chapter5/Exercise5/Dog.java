class Dog {
    void bark() {
        System.out.println("Лай");
    }
    void bark(int i) {
        System.out.println("Вой");
    }
    void bark(double i) {
        System.out.println("Скуль");
    }
    void bark(String i) {
        System.out.println("Кусь");
    }    
    void bark(Integer i) {
        System.out.println("Гав");
    }

    public static void main(String[] args) {
        Dog test = new Dog();
        test.bark();
        test.bark(1);
        test.bark(2);
        test.bark(2f);
        test.bark("sssda");
        test.bark(Integer.valueOf(2));

    }
}

