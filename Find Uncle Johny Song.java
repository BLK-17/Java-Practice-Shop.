import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int k=0;k<t;k++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int x = sc.nextInt();
		    int uncle = arr[x-1];
		    
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++){
     		   if(arr[i] == uncle){
     		       System.out.println(i+1);
     		       break;
     		   }
	}
		}
	}
}
