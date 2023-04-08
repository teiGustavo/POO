import java.util.*;
import java.lang.*;
import java.io.*;

class MediaNotas
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int total = 0;
        int count = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe uma nota (-1 para sair): ");
          int nota = entrada.nextInt();
            
        while (nota != -1){
            total += nota;
            count++;
            
            System.out.println("Informe uma nota (-1 para sair): ");
            nota = entrada.nextInt();
            
        }
        
        if (count != 0){
            int media = total / count;
            System.out.printf("A média das notas é: %d", media);
        } else{
            System.out.println("Nenhuma nota foi inserida!");
        }
            
	}
}
