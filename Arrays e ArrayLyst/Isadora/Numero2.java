import java.util.Scanner;

public class Numero2 
{
    public static void main(String[] args) 
    {   
        Scanner e = new Scanner(System.in);
        String[] nomes = { "Joao", "José", "Alberto", "Luiz", "Alex", "Caio", "Isadora", "Jean", "Elias", "Maria" };   
        
        System.out.printf("%nEscreva qual nome deseja buscar%n");
        String nome = e.nextLine();

        for (int i=0; i<nomes.length; i++) {
            if (nomes[i].toLowerCase().equals(nome.toLowerCase())) {
                System.out.printf("%nACHEI%n");
                System.exit(0);
            }
        }

        System.out.printf("%nNÃO ACHEI%n");
    }    
}
