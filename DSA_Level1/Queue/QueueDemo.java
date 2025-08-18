package Queue;

class BuildNormalQueue{
    
    int arr[];
    //Here size = Rear
    int front,size;


    
    //constructor to initialize the queue
    public BuildNormalQueue(int size){
        arr = new int[size];
        front = 0;
        size = 0;
    }

    //method to check size of the queue
    int size(){
        return size;
    }
    //method to add an element to the queue
    void enqueue(int val){
        if(size == arr.length){
            //This is code for overflow condition
            // System.out.println("Queue Overflow");
            // return;

            //Building Dynamic Queue
            int[] newArr = new int[arr.length * 2];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[(front + i) % arr.length]; // Circular increment
            }
            arr = newArr;
            front = 0; // Reset front to 0 after resizing
            int rear = (front + size) % arr.length; // Circular increment
           // Add the new element at the rear position
           arr[rear] = val;
           size++;
        }else{
           int rear = (front + size) % arr.length; // Circular increment
           // Add the new element at the rear position
           arr[rear] = val;
           size++;

        }
    }
    //method to remove an element from the queue
    int dequeue(){
        if(size == 0){
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = arr[front];
        front++;
        size--;
        return val;
    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < size; i++){
            int index = (front + i) % arr.length; // Circular increment
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

}

public class QueueDemo {
    public static void main(String[] args) {
        BuildNormalQueue queue = new BuildNormalQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(80);
        queue.enqueue(4); // This will trigger overflow condition

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(60);


        System.out.println(queue.peek());
        System.out.println(queue.size());   
        queue.display(); // Display the current elements in the queue


    }
}
