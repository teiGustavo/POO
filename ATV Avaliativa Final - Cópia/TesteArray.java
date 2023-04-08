public class TesteArray 
{
    public static void main(String[] args) 
    {
        ArrayDeInts POO = new ArrayDeInts();
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //int[] vetor = { 1, -4, 5, 9, 2, 0, 0, 0, 0, 0 };
        //int[] vetor = { 0, -4, 8, 23, 55, 0, 0, 0, 0, 0 };

        POO.leia();
        System.out.printf("%n%b", POO.ehIgual(vetor));
        /*POO.imprime();
        POO.limpaArray();
        POO.imprime();
        POO.soma(10);
        POO.imprime();
        System.out.printf("%n%d", POO.total());
        System.out.printf("%n%b", POO.existe(1));
        POO.leiaUnico();
        System.out.printf("%n%.2f", POO.media());
        POO.somaArray(vetor);
        POO.troca(0, 1);
        POO.imprime();
        POO.inverte();
        POO.imprime();
        System.out.printf("%nO maior número é: %d", POO.maior());
        System.out.printf("%nO menor número é: %d", POO.menor());
        System.out.printf("%nO mais proximo de 10 é: %d", POO.maisProximo(10));
        System.out.printf("%nO vetor é palindromo? %b", POO.ehPalindromo());
        System.out.printf("%nO vetor é crescente? %b", POO.ehCrescente());
        System.out.printf("%nProduto escalar: %d", POO.produtoEscalar(vetor));
        System.out.printf("%nAlgum número do array argumento existe no array encapsulado? %b", POO.existeQualquer(vetor));
        System.out.printf("%nTodos os números do array argumento existem no encapsulado? %b", POO.existemTodos(vetor));
        System.out.printf("%nDistância euclidiana: %.2f%n%n", POO.distanciaEuclidiana(vetor));*/
    }
}
