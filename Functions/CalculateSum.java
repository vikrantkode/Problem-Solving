package Functions;

import java.util.Scanner;

public class CalculateSum {

    public static int calculateSum(int a, int b){
        int addition = a+b;
        return addition;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum =  calculateSum(num1,num2);
        System.out.println("Sum of numbers are: "+sum);
    }
}
