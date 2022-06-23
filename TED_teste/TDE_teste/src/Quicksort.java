public class Quicksort {
    public static void quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }
    
    public static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

    }
}
