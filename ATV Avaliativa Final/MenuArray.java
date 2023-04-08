import java.io.IOException;
import java.util.Scanner;

public class MenuArray 
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        ArrayDeInts POO = new ArrayDeInts();
        int op = 1;
        Scanner entrada = new Scanner(System.in); 
        do {
            System.out.printf("%nSelecione uma opção:%n%n1 - IMPRIMIR O VETOR ENCAPSULADO%n2 - LER VALORES%n3 - É IGUAL%n0 - SAIR%n");
            op = entrada.nextInt();
            
            switch (op) {
                case 1:
                    POO.imprime();
                    break;
                
                case 2:
                    POO.leia();
                    break;
                    
                case 3:
                    int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    boolean igual = POO.ehIgual(vetor); 
                    if (igual == true)
                        System.out.printf("%nOS VETORES SÃO IGUAIS!%n");
                    else
                        System.out.printf("%nOS NÃO VETORES SÃO IGUAIS!%n");
                    break;
            }
           
        } while(op != 0); 
        entrada.close();
    }    
}
