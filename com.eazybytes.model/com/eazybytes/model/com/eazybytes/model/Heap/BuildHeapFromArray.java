package Heap;

public class BuildHeapFromArray {
    public static void main(String[] args)
    {
        // Binary Tree Representation
        // of input array
        //             1
        //           /    \
        //         3        5
        //       /  \     /  \
        //     4      6  13  10
        //    / \    / \
        //   9   8  15 17
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};

        int n = arr.length;
        // Function call
        buildHeap(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
  
        // Final Heap:
        //              17
        //            /    \
        //          15      13
        //         /  \     / \
        //        9     6  5   10
        //       / \   / \
        //      4   8 3   1
    }

    private static void buildHeap(int[] arr) {
        
    }
}
