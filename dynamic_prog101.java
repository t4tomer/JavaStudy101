import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* this file us is used to learn dynamic programming */
public class dynamic_prog101 {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        // System.out.println("fib1:" + fib1(40));
        // System.out.println("fib2:" + fib2(40));
        // System.out.println("grid travel:"+grid_travel(3,3));
        int[] arr={7,14};
        // System.out.println("canSum:"+canSum1(300,arr) );
        // System.out.println("canSum:"+canSum2(200,arr) );
        // TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>();
        // tree_map.put(10, "Geeks");
        // tree_map.put(20, "Geeks");       
        // tree_map.put(15, "4");
        // tree_map.put(25, "Welcomes");
        // tree_map.put(30, "You");
        // System.out.println("tree:"+tree_map);
    }

    /* used to calculate the fibonacci sequnce-recursion method */
    public static int fib1(int n) {

        if (n <= 2)
            return 1;
        else
            return fib1(n - 1) + fib1(n - 2);

    }

    /* used to calculate the fibonacci sequnce-dynamic programming method */
    public static int fib2(int n) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;


        /* add elemnt to the last nove in the linked list */
        al.add(fib2(n - 1) + fib2(n - 2) );
        /* print the array list */
        /*          for(int value:al) 
        {
            System.out.println("the value :"+value);
        }
 */        /* return the last elemnt of the linked list */
        return al.get(al.size()-1);
       
    }

    /* calculate the the number of ways to get to the bottom-right corner
       of M*N matrix ,if you can move down or right */
    public static int grid_travel(int m,int n) 
    {

        if(m==0 || n==0)
            return 0;
        if(m==1 || n==1 ) 
            return 1;
        return grid_travel(m-1,n)+grid_travel(m,n-1);
    }




    /* check if using sume of the values of the array can get get
       to n, using recursion */
    public static boolean canSum1(int n,int arr[])
    { 
        if(n==0)
            return true;
        if(n<0)
            return false;
        for (int i=0;i<arr.length;i++)
            if(canSum1(n-arr[i],arr)==true)
                  return true;
        return false;
    }



    public static boolean canSum2(int n,int arr[])
    { 
        ArrayList<Boolean> list =  new ArrayList<Boolean>();
        // boolean[] memo={};
        return(canSum2(n, arr,list));

        // return(canSum2(n, arr,memo));
    }

 /*    public static boolean canSum2(int n,int arr[], boolean memo[])
    { 
        // ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=0;i<memo.length;i++)
            if(n==i)
                return memo[n];

        if(n==0)
            return true;
        if(n<0)
            return false;
        for (int i=0;i<arr.length;i++)
            if(canSum2(n-arr[i],arr,memo)==true)
            {
                memo[n]=true;
                return true;
            }

        memo[n]=false;
        return false;
    } */


    public static boolean canSum2(int n,int arr[], ArrayList<Boolean> memo)
    { 
        // ArrayList<Integer> al = new ArrayList<Integer>();
        if(memo.contains(n))
            return memo.get(n);
        if(n==0)
            return true;
        if(n<0)
            return false;
        for (int i=0;i<arr.length;i++)
            if(canSum2(n-arr[i],arr,memo)==true)
            {
                memo.add(true);
                return true;
            }
        memo.add(false);    
        return false;
    }


    public static int [] howSum(int n,int arr[])
    {

        int stack[]={};
        for(int i=0;i<arr.length;i++)
            stack[i]=n-arr[i];

        return arr;
    }


}
