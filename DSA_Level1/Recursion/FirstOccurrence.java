package Recursion;

import java.util.Scanner;

public class FirstOccurrence {

    //More efficient way to find the first occurrence of an element in an array using recursion.

    public static int findFirstOccurrence(int []arr,int n,int d){
        if(n ==arr.length){
            return -1;
        }
        
        if(arr[n] == d){
            return n;
        }else{
            int fiisa = findFirstOccurrence(arr, n + 1, d);
            return fiisa;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int firstOccurrence = findFirstOccurrence(arr, 0, d);
        System.out.println("First occurrence of " + d + " is at index: " + firstOccurrence);
        sc.close();
    }
}
