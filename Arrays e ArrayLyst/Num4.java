public class Num4 
{
    public static void main(String[] args) 
    {
        int[] vet1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};    
        int[] vet2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   
        int[] intersecao = new int[vet1.length];  
        
        for (int i=0; i<vet1.length-1; i++) {
            if (vet1[i] == vet1[i+1])
                vet1[i] = -1;
            if(vet2[i] == vet2[i+1])
                vet2[i] = -2;
        }

        int p = 0;
        System.out.printf("%nVETOR DE INTERSEÇÕES: %n%n");
        for (int i=0; i<vet1.length; i++)
            for (int j=0; j<vet2.length; j++) 
                if (vet1[i] == vet2[j])
                    for (int k=0; k<=intersecao.length; k++) 
                        if (k < intersecao.length && vet1[i] != intersecao[k] && vet1[i] == vet1[k]) {
                            intersecao[p] = vet1[i];
                            System.out.printf("Posição %d: %d%n", p, intersecao[p]);
                            p++;
                        }     

    }    
}