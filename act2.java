import java.util.Scanner;
public class act2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();

        for(int div = 2; div * div <=n; div++){
            while (n%div == 0){
                n = n/div;
                System.out.println(div + " ");
            }
        }
        if (n != 1){
            System.out.println(n);
        }
    }
}
