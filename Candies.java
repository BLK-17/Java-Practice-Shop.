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
		    int size = 2*n;
		    int arr[] = new int[size];
		    for(int j=0;j<size;j++){
		        arr[j] = sc.nextInt();
		    }
		    
		    int count = 1;
		    boolean possb = true;
		    Arrays.sort(arr);
		    
		    for(int m=1;m<size;m++){
		        if(arr[m]==arr[m-1]){
		            count++;
		            if(count>2){
		                possb =false;
		                break;
		            }
		        }
		        else{
		            count = 1;
		        }
		        
		       
		    }
		     if(possb)
		        {
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    
		}
	}
}
