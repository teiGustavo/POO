import java.util.Scanner;

public class MenuContas {
    public static void limpatela() { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        int op2 = 0;
        String nome;
        double deposito;
        double saque;

        Conta minhaConta = new Conta();

        do {
            System.out.println("");
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1 : para verificar os dados de uma conta");
            System.out.println("2 : para alterar o nome da conta");
            System.out.println("3 : para realizar um depósito");
            System.out.println("4 : para realizar um saque");
            System.out.println("-1 : para sair");
            op = entrada.nextInt();
            switch(op) {
                case 1:
                    limpatela();
                    System.out.printf("O nome é: %s%n", minhaConta.getNome());
                    System.out.printf("O saldo é: %s%n", minhaConta.getSaldo());
                    break;

                case 2:
                        limpatela();
                        System.out.println("O que deseja alterar?");
                        System.out.println("1 : para alterar o nome");
                        System.out.println("2 : para alterar o saldo");
                        op2 = entrada.nextInt();
                    switch(op2){
                        case 1:
                            limpatela();
                            System.out.printf("O nome era: %s%n", minhaConta.getNome());
                            System.out.print("Informe um nome: ");
                            nome = entrada.next();
                            minhaConta.setNome(nome);
                            limpatela();
                            System.out.printf("O novo nome é: %s%n", minhaConta.getNome());
                            break;

                        default:
                            limpatela();
                            System.out.println("Insira uma opção válida!");
                    }
                    break;
                
                case 3:
                    limpatela();
                    System.out.printf("Saldo atual: %s%n", minhaConta.getSaldo());
                    System.out.printf("Informe o depósito: ");
                    deposito = entrada.nextDouble();
                    minhaConta.deposito(deposito);
                    limpatela();
                    System.out.printf("O novo saldo da conta é: %s%n", minhaConta.getSaldo());
                    break;

                case 4:
                    limpatela();
                    System.out.printf("Saldo atual: %s%n", minhaConta.getSaldo());
                    System.out.printf("Informe o saque: ");
                    saque = entrada.nextDouble();
                    minhaConta.saque(saque);
                    limpatela();
                    System.out.printf("O novo saldo da conta é: %s%n", minhaConta.getSaldo());
                    break;

                case -1:
                    break;

                default:
                    limpatela();
                    System.out.println("Insira uma opção válida!");
            }
        }
        while(op != -1);
    }
}