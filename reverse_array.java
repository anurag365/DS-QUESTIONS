import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 11, 15, 18 };
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("AFTER REVERSAL OF ARRAY");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        }

    }

}
