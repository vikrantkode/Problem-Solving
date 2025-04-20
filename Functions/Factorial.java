package Functions;

import java.util.Scanner;

public class Factorial {

    public static void printFactorial(int n) {
        int factorial = 1;

        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        //loop
        for(int i=n; i>=1; i--){
            factorial = factorial*i ;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printFactorial(num);

    }
}
