package Stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueToStack {


    //Implementing a stack using two queues
    // The push operation is O(n) and the pop operation is O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.println("Enter the number of elements to push into the stack:");
        int n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            int element = sc.nextInt();
            stack.push(element);
        }   
        //stack.push(n);

        stack.pop();
        stack.top();

        System.out.println("Top element of the stack: " + stack.top());
        System.out.println("Popped element from the stack: " + stack.pop());    
        sc.close();
    }
}

class MyStack{
    Queue<Integer> mainQueue;
    Queue<Integer>HelperQueue;

    public MyStack(){
        mainQueue = new ArrayDeque<>();
        HelperQueue = new ArrayDeque<>();
    }

    public void push(int val){
        while(!mainQueue.isEmpty()){
            HelperQueue.add(mainQueue.remove());
        }
        mainQueue.add(val);
        while(!HelperQueue.isEmpty()){
            mainQueue.add(HelperQueue.remove());
        }
    }

    public int pop(){
        return mainQueue.remove();

    }

    public int top(){
        return mainQueue.peek();
    }
}
