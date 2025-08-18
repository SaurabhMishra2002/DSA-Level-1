package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MergeOverlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] intervals = new int[n][2];

        for(int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        MergeOverlap(intervals);
    }
    public static void MergeOverlap(int[][] intervals) {
        Pair[] arr = new Pair[intervals.length];
        
        for(int i = 0; i < intervals.length; i++) {
            arr[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(arr);
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
        if(i==0){
            st.push(arr[i]);
        } else {
            Pair top = st.peek();
            if(arr[i].start > top.end){
                st.push(arr[i]);
            
            }else{
                top.end = Math.max(top.end, arr[i].end);
            }
        }
    }

    Stack<Pair> temp = new Stack<>();
    while(!st.isEmpty()){
        temp.push(st.pop());
    }
    while(!temp.isEmpty()){
        Pair p = temp.pop();
        System.out.println("[" + p.start + ", " + p.end + "]");
}
}
}

class Pair implements Comparable<Pair> {
    int start;
    int end;

    Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Pair o) {
        return this.start - o.start;
    }

}
