/* package codechef; // don't place package name! */
import java.util.*;

import javax.print.event.PrintJobListener;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Operacoes
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner entrada=new Scanner(System.in);
	    
		double num = 0;                        
        double num2 = 0;
        double op = 0;

        System.out.Println("Informe o 1° número");
        num=entrada.nextInt();

        System.out.Println("Informe o 2° número");
        num2=entrada.nextInt();

        System.out.Println("escolha uma opção: 1- Soma; 2-Subtração; 3-Multiplicação; 4-Divisão");
        op=entrada.nextInt();

        switch(op){
        case 1:
        System.out.Printf("A soma é: %d", num+num2);
        break;

        case 2:
        System.out.Printf("A subtração é: %d", num-num2);
        break;

        case 3:
        System.out.Printf("A multiplicação é: %d", num*num2);
        break;

        case 4:
        System.out.Printf("A divisão é: %d", num/num2);
        break;
        }
    }
}