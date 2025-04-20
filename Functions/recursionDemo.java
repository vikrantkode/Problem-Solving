package Functions;

public class recursionDemo {
    //Normal Way
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfNNaturalNumbers(5));
    }

//    public static int factorial(int n) {
//        int res = 1;
//        for(int i = 1; i <= n; i++){
//            res *= i;
//        }
//        return res;
//    }

    public static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sumOfNNaturalNumbers(int n) {
        if (n == 1){
            return 1;
        }
        return n+sumOfNNaturalNumbers(n-1);
    }

}
