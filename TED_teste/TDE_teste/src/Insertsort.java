public class Insertsort {
    public static void insertsort(int x[], int n){//n é o tamanho da tabela
        int i, k, y;
        for (k = 1; k < n; k++){
            y = x[k];
            for(i = k-1; i >= 0 && y < x[i]; i--)
                x[i+1] = x[i];
            x[i+1] = y;
        }

    }
}
