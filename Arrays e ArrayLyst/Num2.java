import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        String[] nomes = { "Joao", "José", "Alberto", "Luiz", "Alex", "Caio", "Isadora", "Jean", "Elias", "Maria", "Gustavo" };   
        String nome = "";
        String op = "";
        
        Scanner e = new Scanner(System.in);

        Inteligencia IA = new Inteligencia(nomes);

        System.out.printf("%nBEM VINDO AO SISTEMA!%nPARA SAIR A QUALQUER MOMENTO, DIGITE SAIR%nOBRIGADO :)%n%n");
        
        do {
            System.out.printf("Qual nome deseja buscar?%n");
            nome = e.nextLine(); 

            if (IA.procuraNome(nome) == false) {
                System.out.printf("%nVOCÊ QUIS DIZER: %s? (S/N)%n", IA.procuraPossibilidade());
                op = e.nextLine();

                if (op.toUpperCase().equals("S") == true)
                    System.out.printf("%nNOME ENCONTRADO!%n%n");   
                else
                    System.out.printf("%n%n");   
            }
            else    
                System.out.printf("%nNOME ENCONTRADO!%n%n");  
            
        } while (nome.toUpperCase().equals("SAIR") == false);
        
    }
}
