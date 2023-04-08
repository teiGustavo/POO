import javax.swing.JOptionPane;

public class Fatura {

    private int numero;
    private String desc;
    private double preco;
    private int qtde;

    //Contrutor
    public Fatura(int NumeroFatura, String DescFatura, double PrecoFatura, int QtdeFatura) {
        this.numero = NumeroFatura;
        this.desc = DescFatura;
        this.preco = PrecoFatura;

        if (qtde < 0) {
            this.qtde = 0;
        } else {
            this.qtde = QtdeFatura;
        }

        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = PrecoFatura;
        }
    }

    public void setNumero(int NumeroFatura) {
        this.numero = NumeroFatura;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setDesc(String DescFatura) {
        this.desc = DescFatura;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setPreco(double PrecoFatura) {
        if (preco < 0) {
            this.preco = 0.0;
        } else {
            this.preco = PrecoFatura;
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setQtde(int QtdeFatura) {
        if (qtde < 0) {
            this.qtde = 0;
        } else {
            this.qtde = QtdeFatura;
        }
    }

    public int getQtde() {
        return this.qtde;
    }

    public double getTotalFatura() {
        double totalFatura = this.qtde * this.preco;
        return totalFatura;
    }

    public void exibeInformacoes() {
        String mensagem = String.format("Número: %d%nDescrição: %s%nQuantidade: %d%nPreço: R$ %.2f%nTotal Fatura: R$ %.2f%n", this.numero, this.desc, this.qtde, this.preco, this.getTotalFatura());
        JOptionPane.showMessageDialog(null, mensagem);
    }
}