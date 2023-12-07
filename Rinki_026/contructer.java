class course {
    String name;
    int roll;
    String Dept;

    public course(String name, int roll, String Dept) {
        this.name = name;
        this.roll = roll;
        this.Dept = Dept;
    }

    void printDetails() {
        System.out.println("Name: " + name + " Roll: " + roll + " Dept: " + Dept);
    }
}

public class contructer {
    public static void main(String[] args) {
        course obj = new course("rinki", 26, "BCA");
        // obj.course("Rinki", 26, "BCA");
        // obj.printDetails();
        // obj.course("Doyel", 26, "BCA");
        obj.printDetails();
    }

}
