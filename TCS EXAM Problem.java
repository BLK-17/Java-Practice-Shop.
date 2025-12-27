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
		    int dg1 = sc.nextInt();
		    int dg2 = sc.nextInt();
		    int dg3 = sc.nextInt();
		    int sl1 = sc.nextInt();
		    int sl2 = sc.nextInt();
		    int sl3 = sc.nextInt();
		    
		    int dgtl = dg1+dg2+dg3;
		    int sltl = sl1+sl2+sl3;
		    
		    if(dgtl>sltl){
		        System.out.println("DRAGON");
		    }
		   else if(sltl>dgtl){
		        System.out.println("SLOTH");
		   }else{
		    if(dg1 > sl1){
		        System.out.println("DRAGON");
		    }
		    else if(sl1 > dg1){
		        System.out.println("SLOTH");
		    }else {
		        if(dg2 > sl2){
		            System.out.println("DRAGON");
		        }
		        else if(sl2 > dg2){
		            System.out.println("SLOTH");
		        }else{
		            if(dg3 > sl3){
		                System.out.println("DRAGON");
		            }else if(sl3 < dg3){
		            System.out.println("SLOTH");
		        }else{
		        System.out.println("TIE");
		    }
		}
	}
}}}}
