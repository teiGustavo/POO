/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Tabuada
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner entrada=new Scanner(System.in);
	    
		int i = 0;
		int num = 0;
		
		while (num<1 || num >10){
		System.out.println("Digite um valor entre 1 e 10: ");
		num=entrada.nextInt();
		}

	    System.out.printf("A tabuada de %d é: %n%n", num);
        for (i=1; i<=10; i++){
            int tabuada = num * i;
            System.out.printf( "%d x %d é: %d%n", num,i,tabuada);
        }
    }
}