//create class A
class A {
    String name;
    int roll;

    void input() {
        System.out.print("Enter the name: \n Enter the roll: ");
    }

}

// create class B
class B extends A {
    String name = "Rinki Saha";
    int roll = 26;

    void display() {
        System.out.println(name + roll);
    }

}

public class simple_inheritance {
    public static void main(String[] args) {
        B refer = new B();
        refer.input();
        refer.display();
    }
}