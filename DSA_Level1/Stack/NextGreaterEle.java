package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterEle {

    public static int [] solve(int [] a){
           int nge[] = new int[a.length];
           Stack<Integer> st = new Stack<>();

           nge[a.length-1] = a.length;
           st.push(a.length-1);

           for(int i=a.length-1;i>=0;i--){
            while(st.size() >0 && a[i] >= a[st.peek()]){
                st.pop();
            }
            nge[i] = st.size() ==0 ? a.length: st.peek();
            st.push(i);
             
           }
           return nge;            
        }
        public static void display(int [] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        int []nge = solve(arr);
        display(nge);
    }
}
