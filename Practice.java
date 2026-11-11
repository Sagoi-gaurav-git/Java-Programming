
import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = sc.nextInt();

        System.out.println("Enter number 1:");
        int num = sc.nextInt();

        int largest = num;
        int i = 2;

        while (i <= n) {

            System.out.println("Enter number " + i + ":");
            num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }

            i++;
        }

        System.out.println("Largest number = " + largest);
    }
}