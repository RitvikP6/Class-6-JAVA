import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++){
            System.out.println("Enter number " + i + ":");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 2; div * div <=n; div++){
                if (n % div==0){
                    count++;
                    break;
                }
            }
            if (n <= 1){
                System.out.println("not prime");
            } else if (count == 0){
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}