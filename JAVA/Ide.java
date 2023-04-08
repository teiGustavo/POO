/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o peso em quilogramas");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe a altura em metros");
		double altura = entrada.nextDouble();
		
		double IMC = peso / (altura * altura);
        
		if (IMC < 18.5)
		System.out.println("\nAbaixo do peso!");
		else if (IMC >= 18.5 && IMC < 24.9)
		System.out.println("\nPeso normal!");
		else if (IMC >= 25.0 && IMC < 29.9)
		System.out.println("\nExcesso de peso!");
		else if (IMC >= 30.0 && IMC < 39.9)
		System.out.println("\nObesidade classe I");
		else if (IMC >= 35.0 && IMC < 39.9)
		System.out.println("\nObesidade classe II");
		else
		System.out.println("\nObesidade classe III");

	}
}
