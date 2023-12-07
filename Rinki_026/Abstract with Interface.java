interface A {
    void display();

    String name = "Rinki";

    void method1();
}

class B implements A {
    public void display() {
        System.out.println("hi im " + name);
    }

    public void method1() {
        System.out.println("\nhi im doyel.");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.method1();

    }
}
