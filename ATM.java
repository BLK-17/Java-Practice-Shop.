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
		//int units = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n =sc.nextInt();
		    int k = sc.nextInt();
		    // need to read array.
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++){
		         arr[j] = sc.nextInt();
		    }
		        //int need = sc.nextInt();
		        
		        // need to check array condition.
		        
            for (int j = 0; j < n; j++) {
                  if (k >= arr[j]) {
                     System.out.print("1");
                    k -= arr[j];
		        
		        }
		        else{
		            System.out.print("0");
		        }
		       
		    }
		     System.out.println();
		}
	}
}

