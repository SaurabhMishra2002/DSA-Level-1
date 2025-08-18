package Stack;

import java.util.Scanner;
import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        Scanner Sc  = new Scanner(System.in);
        String s = Sc.nextLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> inf = new Stack<>();
        Stack<String> pre = new Stack<>();

        for(int i = s.length()-1; i>=0 ; i--){
            char ch = s.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v1 = vs.pop();
                int v2 =vs.pop();
                int res = opration(v1,v2,ch);

                vs.push(res);

                //infix evaluation
                String inf1 = inf.pop();
                String inf2 = inf.pop();
                String infres = "("+inf1 + ch + inf2+")";
                inf.push(infres);

                //prefix evaluation
                String pre1 = pre.pop();
                String pre2 = pre.pop();
                String preres = ch + pre1 + pre2;
                pre.push(preres);
        }else{
                vs.push(ch - '0');
                inf.push(ch + "");
                pre.push(ch + "");
        }
        
            
    }
        System.out.println("Postfix: " + vs.pop());
        System.out.println("Infix: " + inf.pop());
        System.out.println("Prefix: " + pre.pop());
}
public static int opration(int v1, int v2, char ch) {
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
