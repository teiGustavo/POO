import java.util.Scanner;

public class Inteligencia 
{
    private String[] nomes;
    private String nome;

    public Inteligencia(String[] vetNomes) 
    {
        this.nomes = vetNomes;
    }

    public Inteligencia(String[] vetNomes, String nomePessoa) 
    {
        this.nomes = vetNomes;
        this.nome = nomePessoa;
    }

    public boolean procuraNome() 
    {
        for (int i=0; i<this.nomes.length; i++) 
            if (this.nomes[i].toLowerCase().equals(this.nome.toLowerCase()))
                return true;

        return false;
    } 
    
    public boolean procuraNome(String nome) 
    {
        this.nome = nome;
        return this.procuraNome();
    }    

    public String procuraPossibilidade()
    {
        String[] n = this.nome.split(""); 
        String possibilidade = ""; 
        //String[] possibilidades = new String[nomes.length]; 
        int menorTam = 0;
        int contadorFinal = 0;   

        for (int i=0; i<n.length; i++) {
            for (int j=0; j<this.nomes.length; j++) {
                String[] split = this.nomes[j].split("");
                int contador = 0;
                boolean teste = true;

                if (split.length > n.length)
                    menorTam = n.length;
                else
                    menorTam = split.length;

                if (split[0].toLowerCase().equals(n[0].toLowerCase())) {
                    for (int letra=1; letra<menorTam; letra++) {
                        if (split[letra].toLowerCase().equals(n[letra].toLowerCase()) == false) {
                            teste = false;
                        } else if (split[letra].toLowerCase().equals(n[letra].toLowerCase()) && teste == true) {
                            contador++;
                        }
                    }
                }

                if (contador > contadorFinal) {
                    contadorFinal = contador;
                    possibilidade = nomes[j];
                }
            }   
        }

        return possibilidade;
    }
}
