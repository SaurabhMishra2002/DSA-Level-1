package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinStacII {
    public static void main(String[] args) {
        minStack mins = new minStack();
        Scanner sc = new Scanner (System.in);
        while(true){
            //Object system;
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
class  minStack{
  
    Stack<Integer> allData;
    int min;

    public minStack(){
        allData = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val){
        if(allData.isEmpty()){
            allData.push(val);
            min = val;
        }
        else if (val >=min){
            allData.push(val);
        }else{
            allData.push(val+val-min);
            min = val;
        }
    }

    public int pop(){
        if(allData.isEmpty()){
            return -1;
        }

        if(allData.peek() >= min){
            return allData.pop();
        } else {
            int poppedValue = allData.pop();
            int originalValue = min;
            min = 2 * min - poppedValue; // Restore the previous minimum
            return originalValue;
        } 
     }

    public int top(){
        
        if(allData.isEmpty()){
            return -1;
        }
       else{
        if(allData.peek() >= min){
            return allData.peek();
        } else {
            return min;
        }
       }

   }

   public int getMin(){
    if(allData.isEmpty()){
        return -1;
    }    
    return min;
   }
}

