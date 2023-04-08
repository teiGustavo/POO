public class Conta {
    private String nome;
    private double saldo;

    public void setNome(String nomePessoa) {
        this.nome = nomePessoa;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double depositoConta) {
        this.saldo = saldo + depositoConta;
    }

    public void saque(double saqueConta) {
        this.saldo = saldo - saqueConta;
    }
}