import java.util.Arrays;

public class N4 
{
    public static void main(String[] args) 
    {
        int[] vet1 = { 10, 20, 2, 4, 5, 60, 7, 8, 9, 1 };    
        int[] vet2 = { 1, 2, 30, 40, 50, 6, 70, 8, 9, 10 };        
        int[] aux = new int[(vet1.length * vet2.length)+1];

        Arrays.sort(vet1);
        Arrays.sort(vet2);
        
        int p = 0;
        for (int i=0; i<vet1.length; i++) 
            for (int j=0; j<vet2.length; j++) 
                if (vet1[i] == vet2[j]) {
                    aux[p] = vet1[i];
                    p++;
                }
        
        int[] intersecao = new int[10];

        p = 0;
        for (int i=0; i<intersecao.length; i++)
            if (aux[i] != aux[i+1]) {
                intersecao[p] = aux[i];
                p++;
            }
        
        if (p == 0) {
            intersecao[p] = aux[0];
            p++;
        }

        System.out.printf("%nVETOR DE INTERSEÇÕES: %nQuantidade de números: %d%n%n", p);
        for (int i=0; i<p; i++) 
            System.out.printf("Posição %d: %d%n", i, intersecao[i]);
    }    
}