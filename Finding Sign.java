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
		    String s = sc.next();
		    
		    boolean hasY = false;
		    boolean hasI = false;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='Y'){
		            hasY = true;
		        }
		        else if(s.charAt(i)=='I'){
		            hasI = true;
		        }
		       
		    }
		    if(hasY) System.out.println("NOT INDIAN");
		    else if(hasI) System.out.println("INDIAN");
		    else   System.out.println("NOT SURE");
		}
	}
}
