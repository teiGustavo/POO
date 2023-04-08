import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;


public class Conta{
    //Atributos
    private String nome;
    private float saldo;

    //Construtor
    public Conta(String nomePessoa, float saldoInicial) {
        this.nome = nomePessoa;
        this.saldo = saldoInicial;
        
    }

    //Método para exibir os dados de uma conta
    public void exibeInformacoes() {
        String mensagem = String.format("Saldo da Conta do %s: %.2f %n", this.nome, this.saldo);
        JOptionPane.showMessageDialog(null,mensagem);
    }

    //Método para definir o nome no objeto
    public void setNome(String nomePessoa) {
        this.nome = nomePessoa; //armazena o nome
    }

    //Método para recuperar o nome do objeto
    public String getNome() {
        return this.nome; //retorna o nome para quem chamou o método
    }

    //Método para definir o saldo no objeto
    public void setSaldo(float saldoPessoa) {
        this.saldo = saldoPessoa; //armazena o saldo
    }

    //Método para recuperar o saldo do objeto
    public float getSaldo() {
        return this.saldo; //retorna o saldo para quem chamou o método
    }

    //Método para realizar o saque
    public void saque(float valor) {
        this.saldo -= valor; //subtrai o valor do saque do saldo da conta
    }
    
    //Método para realizar o depósito
    public void deposito(float valor) {
        if (valor > 0){
            this.saldo += valor; //adiciona o valor do depósito ao saldo da conta
        }
    }
}

