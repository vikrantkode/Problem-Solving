package Functions;

import java.util.Scanner;

public class MultiplyTwoNos {

    public static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int productOfTwoNumbers = multiply(a, b);
        System.out.println("Product of Two Numbers: " +productOfTwoNumbers);


    }
}
