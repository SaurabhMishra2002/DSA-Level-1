package RecursionBasic;

public class MeanOfArray {
   public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        double mean = calculateMean(arr, arr.length-1);
        System.out.println("Mean of the array is: " + mean);
   } 

   public static double calculateMean(int [] arr, int idx){
        if(idx == 1){
            // return (double)sum / arr.length;
            return arr[0];
        }
        // return calculateMean(arr, idx + 1, sum + arr[idx]); 
        
        return (calculateMean(arr,idx-1)*idx-1 + arr[idx-1])/idx;
}
}
