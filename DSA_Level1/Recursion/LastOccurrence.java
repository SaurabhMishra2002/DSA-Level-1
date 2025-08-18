package Recursion;

import java.util.Scanner;

public class LastOccurrence {

        public static int findLastOccurrence(int []arr,int n,int d){
        if(n ==arr.length){
            return -1;
        }
        
            int liisa = findLastOccurrence(arr, n + 1, d);
            if(liisa ==-1){   ///This is beacause after reaching the end of the array, we need to check if the current element is equal to d or not.
                //If it is equal to d, then we return the current index n, otherwise we return  -1

               if(arr[n] == d){
                    return n;
            }else{
                return -1;
            }
        }else{ // after getting the last occurrence of that element we do not need to check the current element, we just return the last occurrence index.
                //This is because we are looking for the last occurrence of that element, so we do not need to check the current element.
                //We just return the last occurrence index.
                return liisa;
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
        int firstOccurrence = findLastOccurrence(arr, 0, d);
        System.out.println("Last occurrence of " + d + " is at index: " + firstOccurrence);
        sc.close();
    }
}
