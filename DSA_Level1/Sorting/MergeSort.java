package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static int[] MergeSort(int[] arr, int left, int right) {

        if(left == right) {
            int[] base = new int[1];
            base[0] = arr[left];
            return base;
        }
            int mid = (left + right) / 2;

            // Sort first and second halves
            int [] fhs =MergeSort(arr, left, mid);
            int [] sh = MergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            int [] fsa = mergeTwoSortedArrays(fhs, sh);
         
            return fsa;
    }

    

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

            int []arr1 = {8, 5, 1, 10, 2, 15};

            MergeSort(arr1, 0, arr1.length - 1);

            for(int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }            
    }
}
