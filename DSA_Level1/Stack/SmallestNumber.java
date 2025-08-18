package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Stack<Integer> st = new Stack<>();
        int num =1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'd'){
                st.push(num);
                num++;
            }else{
                st.push(num);num++;
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while(!st.empty()){
            System.out.print(st.pop());
        }
        
    }
}
