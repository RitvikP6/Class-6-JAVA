import java.util.Scanner;

public class acp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Count digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        k = k % digits;

        int div = 1;
        int mul = 1;

        for (int i = 0; i < digits - k; i++) {
            div *= 10;
        }

        for (int i = 0; i < k; i++) {
            mul *= 10;
        }

        int firstPart = num / div;   // First k digits
        int secondPart = num % div;  // Remaining digits

        int rotated = secondPart * mul + firstPart;

        System.out.println("Rotated Number = " + rotated);

        sc.close();
    }
}