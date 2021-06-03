/* package codechef; // don't place package name! */

// https://www.codechef.com/submit/CIELAB

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int ans = a-b;
        //to check Zero 
        int rem = ans%10;
        if(rem==9)
            System.out.println(ans-1);
        else
		    System.out.println(ans+1);
		
	}
}
