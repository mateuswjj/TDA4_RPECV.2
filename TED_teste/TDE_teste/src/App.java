public class App {
    public static void main(String[] args) throws Exception {
        //vetores
        int tamanho = 350000;
        int[] vetor_desordenado = new int [tamanho];
        int[] vetor_desordenado_copia= new int [tamanho];
        int[] vetor_decrescente = new int [tamanho];
        int[] vetor_semi_ordenado = new int [tamanho];
        int[] vetor_semi_ordenado_copia = new int[tamanho];
        int[] vetor_decrescente_copia = new int [tamanho];
        long start;
        

        /*criando vetor desordenado*/
        for(int i = 0; i < vetor_desordenado.length; i++){
            vetor_desordenado[i] = (int) Math.floor(Math.random() * vetor_desordenado.length);
        }

        //copia array desornado na copia
        System.arraycopy(vetor_desordenado, 0, vetor_desordenado_copia, 0, vetor_desordenado.length);

        /*criando vetor decrescente */
        for(int i = 0; i < vetor_decrescente.length; i++){
            vetor_decrescente[i] = vetor_decrescente.length - i;
        }
        System.arraycopy(vetor_decrescente, 0, vetor_decrescente_copia, 0, vetor_decrescente.length);

        /*criando vetor semi ordenado */
        for(int i = 0; i < vetor_semi_ordenado.length; i++){
            if (i % 10 == 0){
                vetor_semi_ordenado[i] =(int) Math.floor(Math.random() * vetor_semi_ordenado.length);
            }
            else{
                vetor_semi_ordenado[i] = i;
            }
            
        }
        //copia array semi desornado na copia
        System.arraycopy(vetor_semi_ordenado, 0, vetor_semi_ordenado_copia, 0, vetor_semi_ordenado.length);
       
        /*-------------ALGORITIMOS DE ORDENAÇÃO-------------*/

        //INSERTSORT
        //Ordenando vetor desordenando

        start = System.currentTimeMillis();
        Insertsort.insertsort(vetor_desordenado_copia, tamanho);
        //float end_insert_desordenado = System.currentTimeMillis();
        float tempo_insert_desordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_desordenado_copia = vetor_desordenado;

        //Ordenando vetor decrescente
        start = System.currentTimeMillis();
        Insertsort.insertsort(vetor_decrescente_copia, tamanho);
        float tempo_insert_decrescente =(float) (System.currentTimeMillis() - start)/1000;
        vetor_decrescente_copia = vetor_decrescente;

        //Ordenando vetor semi ordenado
        start = System.currentTimeMillis();
        Insertsort.insertsort(vetor_semi_ordenado_copia, tamanho);
        float tempo_insert_semi_ordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_semi_ordenado_copia = vetor_semi_ordenado; 

        
        //QUICKSORT 
        //Ordenando vetor desordenando
        start = System.currentTimeMillis();
        Quicksort.quicksort(vetor_desordenado_copia,0,vetor_desordenado.length - 1);
        float tempo_quicksort_desordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_desordenado_copia = vetor_desordenado;

        //Ordenando vetor decrescente
        start = System.currentTimeMillis();
        Quicksort.quicksort(vetor_decrescente_copia, 0, vetor_decrescente_copia.length - 1);
        float tempo_quicksort_decrescente =(float) (System.currentTimeMillis() - start)/1000;
        vetor_decrescente_copia = vetor_decrescente;
        //Ordenando vetor semi ordenado
        start = System.currentTimeMillis();
        Quicksort.quicksort(vetor_semi_ordenado_copia, 0, vetor_semi_ordenado_copia.length - 1);
        float tempo_quicksort_semi_ordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_semi_ordenado_copia = vetor_semi_ordenado; 

        Selectionsort.selectionSort(vetor_decrescente_copia);

       
        //SELECTION SORT
        //Ordenando vetor desordenando
        start = System.currentTimeMillis();
        Selectionsort.selectionSort(vetor_desordenado_copia);
        float tempo_selection_desordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_desordenado_copia = vetor_desordenado;

        //Ordenando vetor decrescente
        start = System.currentTimeMillis();
        Selectionsort.selectionSort(vetor_decrescente_copia);
        float tempo_selection_decrescente =(float) (System.currentTimeMillis() - start)/1000;
        vetor_decrescente_copia = vetor_decrescente;

        //Ordenando vetor semi ordenado
        start = System.currentTimeMillis();
        Selectionsort.selectionSort(vetor_semi_ordenado_copia);
        float tempo_selection_semi_ordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_semi_ordenado_copia = vetor_semi_ordenado; 

 
        //MERGE SORT
        //Ordenando vetor desordenando
        start = System.currentTimeMillis();
        MergeSort.mergesort(vetor_desordenado_copia,0 ,(vetor_desordenado_copia[0] + vetor_desordenado_copia.length -1)/2,vetor_desordenado_copia.length - 1);
        float tempo_merge_desordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_desordenado_copia = vetor_desordenado;

        //Ordenando vetor decrescente
        start = System.currentTimeMillis();
        MergeSort.mergesort(vetor_decrescente_copia,0 ,(vetor_decrescente_copia[0] + vetor_decrescente_copia.length -1)/2,vetor_decrescente_copia.length - 1);
        float tempo_merge_decrescente =(float) (System.currentTimeMillis() - start)/1000;
        vetor_decrescente_copia = vetor_decrescente;

        //Ordenando vetor semi ordenado
        start = System.currentTimeMillis();
        MergeSort.mergesort(vetor_semi_ordenado_copia,0 ,(vetor_semi_ordenado_copia[0] + vetor_semi_ordenado_copia.length -1)/2,vetor_semi_ordenado_copia.length - 1);
        float tempo_merge_semi_ordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_semi_ordenado_copia = vetor_semi_ordenado;

        //SHELL SORT
        //Ordenando vetor desordenando
        start = System.currentTimeMillis();
        Shellsort.shellSort(vetor_desordenado_copia);
        float tempo_shell_desordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_desordenado_copia = vetor_desordenado;

        //Ordenando vetor decrescente
        start = System.currentTimeMillis();
        Shellsort.shellSort(vetor_decrescente_copia);
        float tempo_shell_decrescente =(float) (System.currentTimeMillis() - start)/1000;
        vetor_decrescente_copia = vetor_decrescente;

        //Ordenando vetor semi ordenado
        start = System.currentTimeMillis();
        Shellsort.shellSort(vetor_semi_ordenado_copia);
        float tempo_shell_semi_ordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_semi_ordenado_copia = vetor_semi_ordenado;
        
        //HEAP SORT
        //Ordenando vetor desordenando
        start = System.currentTimeMillis();
        Heapsort.heapsort(vetor_desordenado_copia);
        float tempo_heap_desordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_desordenado_copia = vetor_desordenado;

        //Ordenando vetor decrescente
        start = System.currentTimeMillis();
        Heapsort.heapsort(vetor_decrescente_copia);
        float tempo_heap_decrescente =(float) (System.currentTimeMillis() - start)/1000;
        vetor_decrescente_copia = vetor_decrescente;

        //Ordenando vetor semi ordenado
        start = System.currentTimeMillis();
        Heapsort.heapsort(vetor_semi_ordenado_copia);
        float tempo_heap_semi_ordenado =(float) (System.currentTimeMillis() - start)/1000;
        vetor_semi_ordenado_copia = vetor_semi_ordenado;
        

        System.out.println("Tamanho dos conjuntos"+ tamanho);
        System.out.println("                Tempos obtidos pelos algoritmos         ");
        System.out.println("Algoritmo |Quase ordenado|Desordenado|Ordem Decrescente|");
        System.out.println("InsertSort|"+tempo_insert_semi_ordenado+"         |"+tempo_insert_desordenado+"      |"+tempo_insert_decrescente + "            |");
        System.out.println("Quicksort |"+tempo_quicksort_semi_ordenado+"         |"+tempo_quicksort_desordenado+"      |"+tempo_quicksort_decrescente+ "            |");
        System.out.println("Selection |"+tempo_selection_semi_ordenado+"         |"+tempo_selection_desordenado+"      |"+tempo_selection_decrescente+ "            |");
        System.out.println("Merge     |"+tempo_merge_semi_ordenado+"         |"+tempo_merge_desordenado+"      |"+tempo_merge_decrescente+ "            |");
        System.out.println("Shell     |"+tempo_shell_semi_ordenado+"         |"+tempo_shell_desordenado+"      |"+tempo_shell_decrescente+ "            |");
        System.out.println("Heap      |"+tempo_heap_semi_ordenado+"         |"+tempo_heap_desordenado+"      |"+tempo_heap_decrescente +"            |");

    }
}
