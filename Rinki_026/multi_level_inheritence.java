
//create class A
import java.util.Scanner;

class manager {
    String dept;

    void input(String dept1) {
        this.dept = dept1;
        System.out.print("\nenter the depertment:  " + dept1);
    }

}

// create class B
class employee extends manager {
    int salary;

    void display(int salary1) {
        this.salary = salary1;
        System.out.println("\nenter the salary: " + salary1);
    }

}

class person extends employee {
    String name;

    void person(String name1) {
        this.name = name1;
        System.out.println("\nenter the person name: " + name1);
    }
}

public class multi_level_inheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person ref = new person();
        System.out.println("employee name: ");
        String name1 = sc.nextLine();
        System.out.println("depertment: ");
        String dept1 = sc.nextLine();
        System.out.println("salary: ");
        int salary1 = sc.nextInt();

        ref.input(dept1);
        ref.display(salary1);
        ref.person(name1);
    }
}