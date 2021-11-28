import java.util.Scanner;

public class kth_largest_smallest_element {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 1, 5, 8, 75, 42, 35, 95, 4, 48, 2, 6, 15, 24 };

        System.out.println("Enter the element which you have to find maximum and minimum element");
        int k = scan.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

            if (i == k - 1) {
                System.out.println(k + " LARGEST ELEMENT IS " + arr[i]);
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
