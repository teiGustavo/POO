/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Doze
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner entrada=new Scanner(System.in);
	    
		int i = 0;
		int num = 0;
		
		do{
			System.out.println("Digite um número entre 12 e 20");
            num = entrada.nextInt();

            if (num < 12 || num > 20){
            System.out.println("número inválido!");
			} 
		}while(num < 12 || num > 20);
		System.out.printf("O número %d está DENTRO do intervalo entre 12 e 20", num);
    }
}