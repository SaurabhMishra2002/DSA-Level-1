package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> inf = new Stack<>();
        Stack<String> pre = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '+' ||ch == '-' || ch == '*' || ch == '/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int res = operation(v1, v2, ch);
                vs.push(res);

                String inf2 = inf.pop();
                String inf1 = inf.pop();
                String infres = "(" +inf1 +ch + inf2+")";
                inf.push(infres);

                String pre2 = pre.pop();
                String pre1 = pre.pop();
                String preres = ch +pre1 +pre2;
                pre.push(preres);
            }else{
                vs.push(ch-'0');
                inf.push(ch+"");
                pre.push(ch+"");
            }
        }

        System.out.println("Postfix: " + vs.pop());
        System.out.println("Infix: " + inf.pop());
        System.out.println("Prefix: " + pre.pop());
        
    }

    public  static int operation (int v1 , int v2, char ch){
        if(ch == '+') {
            return v1 + v2;
        } else if(ch == '-') {
            return v1 - v2;
        } else if(ch == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
    
}