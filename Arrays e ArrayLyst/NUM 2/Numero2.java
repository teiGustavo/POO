import java.io.IOException;
import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) throws IOException {
        String[] nomes = { "Joao", "José", "Alberto", "Luiz", "Alex", "Caio", "Isadora", "Jean", "Elias", "Maria", "Gustavo" };   
        String nome = "";
        String op = "";
        String nomeDicionario = "";
        
        Scanner e = new Scanner(System.in);

        Inteligencia IA = new Inteligencia(nomes);

        System.out.printf("%nBEM VINDO AO SISTEMA!%nPARA SAIR A QUALQUER MOMENTO, DIGITE SAIR%nOBRIGADO :)%n%n");
        
        do {
            System.out.printf("Qual nome deseja buscar?%n");
            nome = e.nextLine(); 

            if (nome.toUpperCase().equals("SAIR") == false) {
                if (IA.nomeExiste(nome) == true) {
                    IA.procurar(nome);
                } else if (IA.procuraNome(nome) == false) {
                    nomeDicionario = IA.procuraDicionario();

                    System.out.printf("%nVOCÊ QUIS DIZER: %s? (S/N)%n", nomeDicionario);
                    op = e.nextLine();
    
                    if (op.toUpperCase().equals("S") == true)
                        IA.procurar(nomeDicionario);  
                    else {
                        IA.printPossibilidades();
                        int opcao = e.nextInt();
                        if(opcao != IA.getSizePossibilidades()+1){
                            if (IA.procuraNome(IA.getPossibilidade(opcao-1)) == true)
                                System.out.printf("%nNOME ENCONTRADO ^-^%n%n");  
                            else   {
                                System.out.printf("%nLAMENTO, ESTE NOME NÃO ESTÁ EM NOSSA BASE DE DADOS :<%n%n"); 
                            } 
                        } 
                        else
                            System.out.printf("%nLAMENTO, TENTE ESCREVER NOVAMENTE :(%n%n");
                    
                        nome = e.nextLine();
                        IA.clear();
                    }
                }
                else
                    System.out.printf("%nNOME ENCONTRADO ^-^%n%n"); 
            } 
        } while (nome.toUpperCase().equals("SAIR") == false);

        e.close();
    }
}
