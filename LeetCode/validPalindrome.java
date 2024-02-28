package LeetCode;
import java.util.*;
public class validPalindrome {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the input String : ");
	String inp = scanner.nextLine();
	System.out.println(isPalindrome(inp));
}
   public static boolean isPalindrome(String s) {
       if(s.length()==1){
           return true;
       }
       s=s.toUpperCase();
       String temp = "";
       int start =0;
       int end = s.length()-1;
       while(start<end){
           if(!Character.isDigit(s.charAt(start)) && !Character.isAlphabetic(s.charAt(start)))
              start++;
           else if(!Character.isDigit(s.charAt(end)) && !Character.isAlphabetic(s.charAt(end)))
              end--;
           else if(s.charAt(start) == s.charAt(end)){
               start++;
               end--;
           }else{
               return false;
           }
       }
       return true;
   }
}
