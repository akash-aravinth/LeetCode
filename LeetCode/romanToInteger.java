package LeetCode;
import java.util.*;
public class romanToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Roman Value : ");
		String inp = scanner.nextLine();
       System.out.println(romanToInt(inp));
       scanner.close();
	}
	    public static int romanToInt(String s) {
	        Map<Character,Integer> map = new HashMap<>();
	        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);
	        map.put('D',500);map.put('M',1000);
	        int sum = 0;
	        for( int i=0;i<s.length()-1;i++){
	            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
	               sum+=map.get(s.charAt(i+1)) - map.get(s.charAt(i));
	               i++;
	               if(i==s.length()-1){
	                   return sum;
	               }
	            }else{
	               sum+=map.get(s.charAt(i));
	            }
	        }
	        sum+=map.get(s.charAt(s.length()-1));
	        return sum;
	    }
}
