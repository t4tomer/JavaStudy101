
import java.lang.Math;

import jdk.javadoc.internal.tool.resources.javadoc;
import java.util.*;


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
// the question : https://leetcode.com/problems/palindrome-number/solution/
    public boolean isPalindrome(int x) {


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



// question: https://leetcode.com/problems/valid-parentheses/
// solution: https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/

       // function to check if brackets are balanced
       static boolean areBracketsBalanced(String expr)
       {
           // Using ArrayDeque is faster than using Stack class
           Deque<Character> stack
               = new ArrayDeque<Character>();
    
           // Traversing the Expression
           for (int i = 0; i < expr.length(); i++)
           {
               char x = expr.charAt(i);
    
               if (x == '(' || x == '[' || x == '{')
               {
                   // Push the element in the stack
                   stack.push(x);
                   continue;
               }
    
               // If current character is not opening
               // bracket, then it must be closing. So stack
               // cannot be empty at this point.
               if (stack.isEmpty())
                   return false;
               char check;
               switch (x) {
               case ')':
                   check = stack.pop();
                   if (check == '{' || check == '[')
                       return false;
                   break;
    
               case '}':
                   check = stack.pop();
                   if (check == '(' || check == '[')
                       return false;
                   break;
    
               case ']':
                   check = stack.pop();
                   if (check == '(' || check == '{')
                       return false;
                   break;
               }
           }
    
           // Check Empty Stack
           return (stack.isEmpty());
       }
    




}


