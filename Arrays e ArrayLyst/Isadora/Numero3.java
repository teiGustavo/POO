import java.util.Scanner;

public class Numero3 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int[] vet = new int [5];

        System.out.printf("%nInsira os números a seguir: %n%nNúmero 1: %n");
        vet[0] = entrada.nextInt();

        String valores = "{ " + vet[0] + ", ";
        int maior = vet[0], menor = vet[0];
        Double media = 0.0, soma = 0.0 + vet[0];
        
        for (int i=1; i<vet.length; i++) {
            System.out.printf("%nNúmero %d: %n", i+1);
            vet[i] = entrada.nextInt();
            valores += vet[i];

            if (i!=vet.length-1)
                valores += ", ";

            if (maior < vet[i])
                maior = vet[i];
            else if (menor > vet[i]) 
                menor = vet[i];

            soma += vet[i];
        }

        valores += " }";
        media = (soma/vet.length); 

        System.out.printf("%nValores inseridos: %s%nMaior: %d%nMenor: %d%nMedia: %.2f%n%n", valores, maior, menor, media);
    }
}
