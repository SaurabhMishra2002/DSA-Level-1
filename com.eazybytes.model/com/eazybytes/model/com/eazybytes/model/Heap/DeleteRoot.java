package Heap;

public class DeleteRoot {

    public static int deleteRoot(int arr[], int n){
        int lastEle = arr[n-1];

        arr[0] = lastEle;

        n = n-1;

        MaxHeapify(arr,0, n);

        return n;
    }
    public static void MaxHeapify(int arr[], int i, int n){
        int left = 2*i+1;
        int right = 2*i+2;

        int largest = i;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            MaxHeapify(arr, largest, n);
        }

    }

    public static void printArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
     public static void main(String args[])
    {
        // Array representation of Max-Heap
        // 10
        //    /  \
        // 5    3
        //  / \
        // 2   4
        int arr[] = { 10, 5, 3, 2, 4 };

        int n = arr.length;

        n = deleteRoot(arr, n);

        printArray(arr, n);
    }
}
