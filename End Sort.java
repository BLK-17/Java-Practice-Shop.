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
		    int pos1 = -1,posN = -1;
		    
		    for(int i=1;i<=n;i++){
		        int x = sc.nextInt();
		        
		        if(x == 1) pos1 = i;
		        if(x == n) posN = i;
		    }
		    int moves = (pos1 - 1) + (n - posN);
		    
		    if(pos1 > posN){
		        moves--;
		    }
		    System.out.println(moves);
		}
	}
}
