package RecursionBasic;

public class SumOfDigit {
    public static void main(String[] args) {
    int num = 12345;
        int result = sum_of_digit(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
        System.out.println(result);
}

    public static int sum_of_digit(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 10) + sum_of_digit(num / 10);
        }
    }
}
