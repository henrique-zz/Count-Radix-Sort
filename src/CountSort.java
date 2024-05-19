public class CountSort {
    public int[] countSort(int[] vetorA, int k){
        boolean[] vetorB = new boolean[k]; //vetor de booleans com o tamanho do k (maior elemento do vetor A)

        for(int i = 0; i < vetorA.length; i++){
            vetorB[vetorA[i] - 1] = true; //iteramos sobre o vetorA para criarmos o vetorB, que terá "true" nas posições que existam no vetorA
        }

        int[] vetorC = new int[vetorA.length];
        int j = 0;

        for(int i = 0; i < vetorB.length; i++){
            if(vetorB[i]){ //toda posição em que o vetorB possua "true" significa que é a uma posição presente no vetorA
                vetorC[j] = i + 1; //então atríbuimos o valor do nosso vetorC (que será o vetor ordenado final) ao índice i, onde o vetorB for true
                j++;
            }
        }

        return vetorC; //no fim retornamos o o vetorC que será o vetor ordenado
    }

    public void apresentaVetor(int[] vetor){
        System.out.print("[ ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]");
    }
}
