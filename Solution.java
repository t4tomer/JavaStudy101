
import java.lang.Math;



public class Solution {
//the question : https://leetcode.com/problems/reverse-integer/solution/
    public int reverse(int x) { // this method is used to print the revrse digits of int x 
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            System.out.println("pop:"+pop);

            x /= 10;
            System.out.println("x:"+x);
            // if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            // if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            


            rev = rev * 10 + pop;
        }
        return rev;
    }

    public void print_digits(int num){

        int digit=0;
        int j=1;

    while(0<Math.abs(num)){

      digit=(int) ((Math.abs(num)%Math.pow(10,j))/Math.pow(10,j-1));
      num=(int) (Math.abs(num)-digit*Math.pow(10,j-1));
       System.out.println("digit of the reverse number:"+digit);
      j=j+1;  



    }



  


    

    }

    public boolean isPalindrome(int x) {
    // the question : https://leetcode.com/problems/palindrome-number/solution/

         int  original_number=x;
        
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;            
            rev = rev * 10 + pop;
        }
        if(original_number<0) 
        
        return false;
    
        
        if (original_number==rev)
            return true;     
        return false;

    }




    public String longestCommonPrefix(String[] strs) {

        return "cool";
        
    }




}


