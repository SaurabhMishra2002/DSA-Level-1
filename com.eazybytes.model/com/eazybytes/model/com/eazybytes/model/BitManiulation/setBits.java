package BitManiulation;

public class setBits {
    public static int setBit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
     public static void main(String[] args) {
        int n = 21;
        System.out.println(setBit(n));
    }
}
