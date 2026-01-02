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
		    int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    
		    int freq[] = new int[26];
		    
		    for(int i=0;i<n;i++){
		        freq[s.charAt(i)-'a']++;
		    }
		    boolean  pos = true;
		    for(int i=0;i<26;i++){
		        if(freq[i]%2!=0){
		            pos = false;
		            break;
		        }
		    }
		    System.out.println(pos?"YES":"NO");
		}
		
	}
}
