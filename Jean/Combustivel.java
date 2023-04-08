/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Combustivel
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner entrada = new Scanner (System.in);
		int count = 0;
		int kmtotal = 0;
        int Tgasolina = 0;
        int gasolina = 0;
        float media = 0f;
		int numv = 0 ;
     

		System.out.println("Insira quantos quilometros foram percorridos:");
		int km = entrada.nextInt();
   
	   System.out.println("----------------------------------");
   
	   System.out.println("Insira a quantidade de gasolina ultilizada em litros: ");
		gasolina = entrada.nextInt();

	   System.out.println("----------------------------------");

	   System.out.println("Insira a quantidade de viagens feitas: ");
	   numv= entrada.nextInt();


			while(count != numv && gasolina != 0 && km != 0){

				count++;
				kmtotal += km;
				Tgasolina += gasolina;
				media = km / gasolina;
			}
			
			System.out.println("A autonomia de consumo da viagem é de: " + media);
		    System.out.println("O consumo total de gasolina por quilometro é de: " + Tgasolina);
		    System.out.println("A quilometragem total é de: " + kmtotal);
			
        }
}