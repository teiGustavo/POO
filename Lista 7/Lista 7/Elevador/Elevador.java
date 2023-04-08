import javax.swing.JOptionPane;

public class Elevador {
    //Variáveis
    private int capacidade;
    private int totalAndares;
    private int pessoas;
    private int terreo = 0;
    private int andar;
    private String mensagem;

    //Construtor
    public Elevador(int cap, int tAnd) {
        this.capacidade = cap;
        this.totalAndares = tAnd;
        this.andar = terreo;
        this.pessoas = 0;
    }

    //Métodos get e set
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getAndarAtual() {
        return andar;
    }

    public void setAndarAtual(int andar) {
        this.andar = andar;
    }

    //Métodos Extra
    public void entra(int qtd) {
        if (this.getPessoas() + qtd <= this.getCapacidade()) {
            this.setPessoas(this.getPessoas() + qtd);
        } else {
            //System.out.printf("%nQuantidade excedeu a capacidade!%n");
            mensagem = String.format("O elevador antingiu a capacidade máxima!%n");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public void sai(int qtd) {
        if (this.getPessoas() - qtd >= 0) {
            this.setPessoas(this.getPessoas() - qtd);
        } else {
            //System.out.printf("%nQuantidade excedeu a capacidade!%n");
            mensagem = String.format("O elevador já está vazio!%n");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public void sobe(int qtd) {
        if (this.getAndarAtual() + qtd <= this.getTotalAndares()) {
            this.setAndarAtual(this.getAndarAtual() + qtd);
        } else {
            //System.out.printf("%nQuantidade excedeu o limite de andares!%n");
            mensagem = String.format("O elevador já está no último andar!%n");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public void desce(int qtd) {
        if (this.getAndarAtual() - qtd >= terreo) {
            this.setAndarAtual(this.getAndarAtual() - qtd);
        } else {
            //System.out.printf("%nO elevador já está no térreo!%n");
            mensagem = String.format("O elevador já está no térreo!%n");
            JOptionPane.showMessageDialog(null, mensagem);
        }  
    }

}
