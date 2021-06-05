/* package codechef; // don't place package name! */

//link : https://www.codechef.com/problems/JOHNY

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		 int testCases = sc.nextInt();
	    while(testCases-->0){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        int k = sc.nextInt();
	        int num = arr[k-1];
	        //System.out.println(num +" num");
	        Arrays.sort(arr);
	 
	        for(int i=0;i<n;i++){
	            if(arr[i]==num){
	               System.out.println(i+1);
	               break;
	            }
	        }
	        
	    }
	}
}
