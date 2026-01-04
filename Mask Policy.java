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
		    int a = sc.nextInt();
		    
		   // int need = n-a;
		    //int min = Math.min(a,(n-a));
		    System.out.println(Math.min(a,(n-a)));
		}
	}
}
