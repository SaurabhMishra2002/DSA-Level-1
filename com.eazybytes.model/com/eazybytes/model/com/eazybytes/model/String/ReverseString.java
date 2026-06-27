package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        char[]arr = str.toCharArray();
        int left = 0;
        int right  = arr.length-1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        String s = new String(arr);
        return s;
    }
}
