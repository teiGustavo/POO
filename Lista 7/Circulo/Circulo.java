import javax.swing.JOptionPane;

public class Circulo {
    //Atributos
    private Double raio;
    private Double pi = 3.14159265359;

    //Construtor
    public Circulo(Double raioCirculo) {
        this.raio = raioCirculo;
    }

    //Métodos
    public void setRaio(Double raioCirculo) {
        this.raio = raioCirculo;
    }

    public Double getRaio() {
        return this.raio;
    }

    public void setPi(Double piAprox) {
        this.pi = piAprox;
    }

    public Double getPi() {
        return this.pi;
    }

    public Double getArea() {
        Double area = pi * (this.raio * this.raio);
        return area;
    }

    public Double getComp() {
        Double comp = (2*pi)*this.raio;
        return comp;
    }

    public void aumentarRaio(Double percentual) {
        this.raio = ((percentual/100) * this.raio) + this.raio;
    }

    public void exibeInformacoes() {
        String mensagem = String.format("Valor de pi: %2f%nValor do raio: %.2f%nComprimento da circunferência: %.2f%nÁrea da circunferência: %.2f%n", this.getPi(), this.getRaio(), this.getComp(), this.getArea());
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
