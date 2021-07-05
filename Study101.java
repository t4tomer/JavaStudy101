/**
 * Hello hdfhfgh
 */
import java.util.Arrays;




public class Study101 {



  
  public static void main(String[] args) {

    Solution S1=new Solution();
		int number=75257;
    String[] strs = {"111flower","gggflow","flight"};
    System.out.println("test_num1!");
    System.out.println("test_num2!");
    System.out.println("this is from Windows 10 pc !");
    System.out.println("this is from Ubonto 21.04  !");
    System.out.println("this is from Ubonto 21.04 from 04/07/21 19:36  !!");



    
	// System.out.println("the reverse number of "+number+" is:"+S1.reverse(number)); // print reversed number.
    // System.out.println(" cheack if number is polyndrom :"+S1.isPalindrome(number)); // cheak if number is polyndrom 
    //    System.out.println("print prifix1:"+S1.longestCommonPrefix(strs));
    //  System.out.println(Arrays.toString(cars));
 
      System.out.println(Arrays.toString(strs));
    
      String str = "{[((()))]}";
     
      char ch1 = str.charAt(0);
      S1.areBracketsBalanced(str);
      System.out.println("test :"+ S1.areBracketsBalanced(str));



  }
}

