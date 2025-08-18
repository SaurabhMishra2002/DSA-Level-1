package Sorting;

import java.util.Scanner;

public class Merge2Sort {
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        int[] num1 = new int [arr1.length +arr2.length];
        int i = 0, j = 0, k = 0;

        while(i< arr1.length && j<arr2.length){
            if(arr1[i] <arr2[j]){
                num1[k] = arr1[i];
                i++;
                k++;
            }
            else {
                num1[k] = arr2[j];
                j++;
                k++;
            }                                                                                                     
        }
        while(i<arr1.length){
            num1[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            num1[k] = arr2[i];
            j++;
            k++;
        }


        return num1;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int []arr1 = {2, 5, 8, 10, 12, 15};
            int []arr2 = {4, 6, 7, 9, 11, 13, 14};

            int [] num = mergeTwoSortedArrays(arr1, arr2);

            for(int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }         

            
        }   
}
