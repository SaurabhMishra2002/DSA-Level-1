package Recursion;
import java.util.*;

public class PrintAllSubsequence {
    static ArrayList<String> result = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequences of the string \"" + str + "\":");
        printSubsequences(str, "", 0);

        printResult();
    }
    public static void printSubsequences(String str,  String Curr, int idx){
        if(idx == str.length()){
            result.add(Curr);
            return;
        }
        printSubsequences(str,Curr+str.charAt(idx), idx+1);// Include the current character

        printSubsequences(str,Curr, idx+1);// Skip the current character
    }
    public static void printResult(){
        for(String s : result){
            System.out.print("["+s + "]");
        }
    }
}
