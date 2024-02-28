package LeetCode;

import java.util.Scanner;

public class addBinary {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the First Input : ");
		String s1 = scanner.nextLine();
		System.out.print("Enter the Second Input : ");
		String s2 = scanner.nextLine();
		System.out.println(addBinary(s1,s2));
		scanner.close();
	}
    public static String addBinary(String a, String b) {
        int carry = 0;
        String temp = "";
        int a1 = a.length()-1;
        int b1 = b.length()-1;
        while(a1>=0 && b1>=0){
           if(carry ==0){
               if(a.charAt(a1) == '0' && b.charAt(b1)=='0'){
                   temp="0"+temp;
                   a1--;
                   b1--;
               }
                else if(a.charAt(a1)=='1' && b.charAt(b1)=='1'){
                    temp="0"+temp;
                    a1--;
                    b1--;
                    carry =1;
                }else{
                    temp="1"+temp;
                    a1--;
                    b1--;
                }
           }else{
              if(a.charAt(a1) == '0' && b.charAt(b1)=='0'){
                   temp="1"+temp;
                   carry =0;
                   a1--;
                   b1--;
               }
                else if(a.charAt(a1)=='1' && b.charAt(b1)=='1'){
                    temp="1"+temp;
                    a1--;
                    b1--;
                    carry =1;
                }else{
                    temp="0"+temp;
                    carry = 1;
                    a1--;
                    b1--;
                }
           }
        }
           while(a1>=0){
             if(carry == 0){
                if(a.charAt(a1)=='0'){
                 temp="0"+temp;
                 a1--;
                }else{
                    temp = "1"+temp;
                    a1--;
                }
             }else{
                if(a.charAt(a1)=='0'){
                 temp="1"+temp;
                 a1--;
                 carry =0;
                }else{
                    temp = "0"+temp;
                    a1--;
                    carry = 1;
                }
             }
           }
           while(b1>=0){
             if(carry == 0){
                if(b.charAt(b1)=='0'){
                 temp="0"+temp;
                 b1--;
                }else{
                    temp = "1"+temp;
                    b1--;
                }
             }else{
                if(b.charAt(b1)=='0'){
                 temp="1"+temp;
                 carry =0;
                 b1--;
                }else{
                    temp = "0"+temp;
                    b1--;
                    carry = 1;
                }
             }
             }
             if(carry == 1)
                 temp = "1"+temp;

        return temp;
    }
}
