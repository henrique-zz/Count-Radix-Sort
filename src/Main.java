public class Main {
    public static void main(String[] args) {
        CountSort countSort = new CountSort();
        int[] vetor = {6,3,1,5};
        int k = 6;

        System.out.print("Vetor original: ");
        countSort.apresentaVetor(vetor);

        int[] vetorOrdenado = countSort.countSort(vetor,k);

        System.out.print("\nVetor ordenado: ");
        countSort.apresentaVetor(vetorOrdenado);
    }
}