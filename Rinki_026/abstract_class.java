abstract class A {
    abstract void name();

    abstract void roll();

    abstract void dept();
}

class B extends A {
    void name() {
        System.out.println("Name: John");

    }

    void roll() {
        System.out.println("Roll no.: 1234567890");
    }

    void dept() {
        System.out.println("Department: CSE");
    }
}

public class abstract_class {

    public static void main(String[] args) {
        B obj = new B();
        obj.name();
        obj.roll();
        obj.dept();

    }
}