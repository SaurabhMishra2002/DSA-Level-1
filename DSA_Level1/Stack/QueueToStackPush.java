package Stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueToStackPush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to push into the stack:");
        int n = sc.nextInt();
        MyStack stack = new MyStack();
        stack.push(n);

        stack.pop();
        stack.top();

        System.out.println("Top element of the stack: " + stack.top());
        System.out.println("Popped element from the stack: " + stack.pop());    
        sc.close();
       
    }
}

 class MyStack {
    Queue<Integer> mainQueue;
    Queue<Integer> HelperQueue;

    public MyStack() {
        mainQueue = new ArrayDeque<>();
        HelperQueue = new ArrayDeque<>();
    }

    public void push(int val) {
        mainQueue.add(val);

     }

     public int pop(){
             if(mainQueue.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
         }
         else{
            while(!mainQueue.isEmpty()){
                HelperQueue.add(mainQueue.remove());
            }   
            int topElement = HelperQueue.peek();
            //HelperQueue.add(topElement);
            while(!HelperQueue.isEmpty()){
                mainQueue.add(HelperQueue.remove());
            }       
         
        return topElement;
     }
    }

     public int top() {
         if(mainQueue.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
         }
         else{
            while(!mainQueue.isEmpty()){
                HelperQueue.add(mainQueue.remove());
            }   
            int topElement = HelperQueue.peek();
            HelperQueue.add(topElement);
            while(!HelperQueue.isEmpty()){
                mainQueue.add(HelperQueue.remove());
            }       
         
        return topElement;
        
        }
}
 }
