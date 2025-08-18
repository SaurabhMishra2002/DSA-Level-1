package Stack;

import java.util.Stack;
import java.util.Scanner;
public class MinStacI {
    public static void main(String[] args) {
        Minstack mins = new Minstack(); 
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to push, 2 to pop, 3 to get top, 4 to get min, or 0 to exit:");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    mins.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + mins.pop());
                    break;
                case 3:
                    System.out.println("Top value: " + mins.top());
                    break;
                case 4:
                    System.out.println("Minimum value: " + mins.getMin());
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    

}

 class Minstack{

    Stack<Integer> allData;
    Stack<Integer>minData;

    public Minstack(){
        allData = new Stack<>();
        minData = new Stack<>();
        
    }

    public void push(int val){
        allData.push(val);
        if(minData.isEmpty() || val <= minData.peek()){
            minData.push(val);
        }
    }

    public int pop(){
        if(allData.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int val = allData.pop();
        if(val == minData.peek()){
            minData.pop();
        }
        return val;
    }
    public int top(){
        if(allData.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return allData.peek();
    }
    public int getMin(){
        if(minData.isEmpty()){
            System.out.println  ("Stack is empty");
            return -1;
        }
        return minData.peek();
    }

}
