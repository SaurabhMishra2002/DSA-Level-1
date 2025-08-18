package Stack;

import java.util.Scanner;

class NormalStack{
    int []arr;
    int top;
    int capacity;
    NormalStack(int size){
        arr = new int[size];
        top =-1;
        capacity = size;
    }

    void push(int val){
        if(top ==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] =val;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        if(top ==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top == -1;
    }

}

public class BuildNormalStack {

      public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // Assuming we want to build a NormalStack instance
       // int n = Sc.nextInt();
        NormalStack stack = new NormalStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

       System.out.println(stack.pop());
       System.out.println(stack.peek());
       System.out.println(stack.isEmpty()); // Here you can add logic to use the stack, like pushing or popping elements
        
    }
}
