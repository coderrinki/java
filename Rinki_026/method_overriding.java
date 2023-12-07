class student {
    void name() {
        System.out.println("Rinki Saha");
    }
}

class stream extends student {
    void name() {
        System.out.println("BCA");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        student obj1 = new student();
        student obj2 = new stream();
        obj1.name();
        obj2.name();
    }

}
