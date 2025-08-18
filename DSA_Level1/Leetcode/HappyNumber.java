package Leetcode;

import java.util.Scanner;

public class HappyNumber {

    public static int getSquareNumber(int n){
        int sum = 0;
        while(n >0){
            int rem = n%10;
            sum += rem*rem;
            n /=10;
        }

        return sum;
    
    }

    public static boolean isHappy(int n){
        for(int i = 0; i<1000;i++){
            n = getSquareNumber(n);

            if(n == 1){
                return true;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
        sc.close();  
    }
}
