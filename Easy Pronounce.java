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
		    String s = sc.next();
		    
		    int count = 0;
		    boolean easy = true;
		    for(int j=0;j<n;j++){
		        char ch = s.charAt(j);
		        
		        if(ch == 'a'||ch == 'e'||ch == 'i'||ch =='o'|| ch == 'u'){
		            count = 0;
		        }
		        else{
		            count ++;
		        }
		    
		    if(count>=4){
		        easy = false;
		        break;
		    }
		    }
		    if(easy){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
