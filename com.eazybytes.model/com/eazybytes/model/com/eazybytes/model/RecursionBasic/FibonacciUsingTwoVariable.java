package RecursionBasic;

public class FibonacciUsingTwoVariable {

    public static int nthFibonacci(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return nthFibonacci(n - 1, b, a + b);
    }

    public static void main(String[] args){
        int n = 5;
        int a = 0;
        int b = 1;
        int result = nthFibonacci(n, a, b);
        System.out.println(result);
    }
}
