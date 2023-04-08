import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		
		String P = in.next();
		
		if (P.length() > 1 && P.length() < 30){
		    char[] charSearch = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','x','z'};
		    
		    for (int i= 0; i < P.length(); i++){
		       char chr = P.charAt(i);
                for(int j=0; j<charSearch.length; j++)
                {
                    if(charSearch[j] == chr)
                    {
                        System.out.println("Char Value "+charSearch[j]+" is present in "+P);      
                    }
                }
		    }
	    }
	}
}
