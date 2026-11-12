import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Enter 10 numbers:");

        // Taking input
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Counting numbers
        for (int i = 0; i < 10; i++) {

            if (arr[i] > 0) {
                positive++;
            }
            else if (arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}