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
		sc.nextLine();
		for(int k=0;k<t;k++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    int min_diff = 0;
		    int max_diff = 0;
		    
		    for(int i=0;i<s1.length();i++){
		        char c1 = s1.charAt(i);
		        char c2 = s2.charAt(i);
		        
		        if(c1=='?' || c2 =='?') 
		        {
		            max_diff++;
		            if(c1!='?'||c2!='?'){
		                
		            }
		            else{
		                
		            }
		        }
		        else if(c1!=c2){
		            min_diff++;
		            max_diff++;
		        }
		    }
		    System.out.println(min_diff+" "+max_diff);
		}
	}
}
