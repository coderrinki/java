import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n = arr.length;
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print the element: ");
        for (i = 1; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
