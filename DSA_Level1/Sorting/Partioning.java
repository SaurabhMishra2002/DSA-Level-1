package Sorting;
import java.util.*;

class Partioning {


    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;  
    }

    public static void partioning (int []arr,int pivot){
        //Region defined
        // 0 to j-1 are less than pivot
        // j to i-1 are equal to pivot
        // i to end are greater than pivot
        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(arr[i] > pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
            }
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();
        partioning(arr, pivot);
        System.out.println("Array after partitioning:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
