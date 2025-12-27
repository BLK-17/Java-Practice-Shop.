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
		
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    //int arr[] = new int[n];
		    int xor = 0;
		    for(int j=0;j<n;j++){
		        int b = sc.nextInt();
		        xor ^= b;
		    }
		    if(xor == 0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		}
	}
}
