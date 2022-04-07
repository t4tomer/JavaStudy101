public class recursion_101 
{
    

    public static void main(String[] args) 
    {
      //This is the print line. Anything in the Quotation Maks will be printed
        System.out.println("Hello, World!");
        starts(3);
        int[] a = {1, 2, 3,4};
        // System.out.println("sum:"+sum(321) );
        // System.out.println("the multiplyction :"+multiply(3,2) );
        // System.out.println("the sum of array is :"+sum_arr(a) );
        System.out.println("the max val:"+max_arr(a,0));
    }

    public static void starts(int n)
    {
        if(0<n)
        {
            System.out.println("*");
            starts(n-1);
        }
    }
 
    /* calculate the sum of digits using recursion */
    public static int sum(int n)
    {
        if( n<=9)
            return n;
        else     
            return sum(n/10)+n%10;
    }
    /* multiply 2 numbers using recursion */
    public static int multiply( int n, int m)
    {
        if(m==1)
            return n;
        return multiply(n,m-1)+n;
    }
    /* calculate the fibonacci representation of number */
    public static int fibo( int n)
    {
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    /* sum of array using recursion */
    public static int sum_arr(int [] a)
    {
        return sum_arr(a,0);
    }
    /* over loading of method sum_arr */
    public static int sum_arr(int [] a,int start)
    {
        if(start==a.length)
            return 0;
        return sum_arr(a,start+1)+a[start];
    }    

    public static int max_arr(int [] a)
    {
        return max_arr(a,0);
    }
    /* over loading of method sum_arr */
    public static int max_arr(int [] a,int start)
    {
        if(start==a.length-1)
            return a[a.length-1];
        return Math.max(a[start],a[start+1]);

    }    












}
