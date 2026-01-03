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
		    
		    String a = sc.next();
		    String b = sc.next();
		    
		    int counta0 = 0, counta1 = 0;
		    int countb0 = 0, countb1 = 0;
		    
		    for(int i=0;i<n;i++){
		        if(a.charAt(i) == '0') counta0++;
		        else counta1++;
		    }
		    for(int i=0;i<n;i++){
		        if(b.charAt(i)=='0') countb0++;
		        else countb1++;
		    }
		    
		    if(counta0 == countb0 && counta1 == countb1) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
