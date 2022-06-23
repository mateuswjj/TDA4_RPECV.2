public class Heapsort {
    public static int[] heapsort(int lista[]) {
        int n = lista.length; // n (tamanho da lista)
        for (int i = n / 2 - 1; i >= 0; i--) // Constrói o heap
            arvoreHeap(lista, n, i);
  
        // Pega aos elementos do heap até acabar
        for (int i = n - 1; i >= 1; i--) {
            // Extrai a raíz da árvore e move para o final
            int seg = lista[0];
            lista[0] = lista[i];
            lista[i] = seg;
            arvoreHeap(lista, i, 0); // repete o método até consumir toda a árvore
        }
        return lista;
    }
  
    static void arvoreHeap(int lista[], int n, int i) {
        int maior = i; // Pega a maior variável e inicia como raíz da árvore
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if (r < n && lista[r] > lista[maior]) { // Se encontrou o maior elemento da árvore como a subárvore a direita
            maior = r;
        }
  
        if (l < n && lista[l] > lista[maior]) { // Se encontrou o maior elemento da árvore como a subárvore a esquerda
            maior = l;
        }
  
        // Se a raíz da árvore não é o maior elemento (Não pode ser inserido no final)
        if (maior != i) {
            int swap = lista[i];
            lista[i] = lista[maior]; // rotaciona para fazer o elemento menor ser a raíz da árvore
            lista[maior] = swap;
  
            // Faz o método de procura por subárvores
            arvoreHeap(lista, n, maior);
        }
    }
}
