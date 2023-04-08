import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fracao
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner entrada=new Scanner(System.in);
	    
		float i = 1;
		int num = 0;
        float soma = 0;

			System.out.println("Digite um número inteiro e positivo:");
			num = entrada.nextInt();

            while(i <= num){
                System.out.println("1 dividido por "+i+" é:"+(1/i)+"");
                soma += (1/i);
                i++;
            }

		System.out.println("O total da soma é: "+soma+"");
    }
}