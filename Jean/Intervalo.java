/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Intervalo
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner entrada=new Scanner(System.in);
	    
		int i = 0;
		int num = 0;
		int cont = 0;
		int cont2 = 0;
		
		for(i = 1; i<=10; i++){
			System.out.printf("Digite o %d número:", i);
			num = entrada.nextInt();

			if(num>=10 && num<=20){
				cont += 1;
			}else{
				cont2 += 1;
			}
		}
		System.out.printf("A quantidade de números DENTRO do intervalo entre 10 e 20 são: %d%n", cont);
		System.out.printf("A quantidade de números FORA do intervalo entre 10 e 20 são: %d%n", cont2);
    }
}