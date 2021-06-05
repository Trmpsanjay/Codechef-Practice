/* package codechef; // don't place package name! */
//Link : https://www.codechef.com/submit/HORSES
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
	        Arrays.sort(arr);
	        int ans = Integer.MAX_VALUE;
	        for(int i=1;i<n;i++){
	            if(arr[i]-arr[i-1]<ans)
	                ans = arr[i]-arr[i-1];
	        }
	        System.out.println(ans);
	    }
	}
}
