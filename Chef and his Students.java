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
		
		for(int j=0;j<t;j++){
		    String s = sc.next();
		    int count = 0;
		    for(int i=0;i<s.length()-1;i++)
		    if(s.charAt(i)=='<'&&s.charAt(i+1)=='>'){
		        count++;
		    }
		   System.out.println(count); 
		}
	}
}
