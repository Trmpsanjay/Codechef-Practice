/* package codechef; // don't place package name! */

// Link : https://www.codechef.com/problems/PPSUM

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static int sum (int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner  sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-->0){
		    int d = sc.nextInt();
		    int n = sc.nextInt();
		    int ans = n;
		    while(d-->0){
		        ans = sum(ans);
		    }
		    System.out.println(ans);
		    
		}
	}
}
