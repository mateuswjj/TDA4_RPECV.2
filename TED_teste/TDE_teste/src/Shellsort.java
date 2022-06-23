public class Shellsort {
    public static int[] shellSort(int[] lista) {
        int n = lista.length; // n 
        int shellIncrement = n / 2; // Incremento de shell
        int[] result = lista; // Lista resultado
        while (shellIncrement > 0) { // Enquanto o incremento de shell for maior que 0
            for (int i = shellIncrement; i < n; i += 1) {
                int valorAtual = lista[i];
                int index;
                for (index = i; index >= shellIncrement && lista[index - shellIncrement] > valorAtual; index -= shellIncrement)
                    lista[index] = lista[index - shellIncrement]; // Substitui o elemento atual pelo anterior que foi maior
                lista[index] = valorAtual; // Insere o valor no menor índice correto para o valor
            }
            shellIncrement /= 2; // O incremento de shell é cortado pela metade
        } 
        return result;
    }
}
