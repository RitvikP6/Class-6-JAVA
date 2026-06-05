import java.util.Scanner;
public class act3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter low");
        int low = scn.nextInt();

        System.out.println("Enter high");
        int high = scn.nextInt();

        System.out.println("Prime numbers between " + low + " and " + high + " are:");
        for (int n = low; n <= high; n++){
            if (n <= 1){
                continue;
            }
            int count = 0;
            for (int div = 2; div * div <=n; div++){
                if (n % div==0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(n);
            }
        }
    }
}
