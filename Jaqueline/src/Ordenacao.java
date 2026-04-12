import java.util.Arrays;
import java.util.Random;

public class Ordenacao {

    public static void main(String[] args) {
        int tamanho = 1000;

        // Definição dos vetores para os testes
        int[] aleatorio = gerarVetorAleatorio(tamanho);
        int[] ordenado = gerarVetorOrdenado(tamanho);
        int[] invertido = gerarVetorInvertido(tamanho);

        String[] nomesAlgoritmos = {"Bubble Sort", "Selection Sort", "Insertion Sort"};
        int[][] tiposVetores = {aleatorio, ordenado, invertido};
        String[] nomesVetores = {"Aleatório", "Ordenado", "Invertido"};

        for (int i = 0; i < nomesAlgoritmos.length; i++) {
            System.out.println("--- Algoritmo: " + nomesAlgoritmos[i] + " ---");
            for (int j = 0; j < tiposVetores.length; j++) {
                // Clonamos o vetor para não ordenar o original e interferir nos próximos testes
                int[] copia = tiposVetores[j].clone();

                long tempoInicial = System.nanoTime();

                executarAlgoritmo(i, copia);

                long tempoFinal = System.nanoTime();
                long duracao = (tempoFinal - tempoInicial); // tempo em nanosegundos

                System.out.printf("Vetor %s: %d ns\n", nomesVetores[j], duracao);
            }
            System.out.println();
        }
    }

    // --- Algoritmos de Ordenação ---

    public static void bubbleSort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[minIdx]) minIdx = j;
            }
            int temp = v[minIdx];
            v[minIdx] = v[i];
            v[i] = temp;
        }
    }

    public static void insertionSort(int[] v) {
        int n = v.length;
        for (int i = 1; i < n; ++i) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = chave;
        }
    }

    // --- Utilitários ---

    public static void executarAlgoritmo(int id, int[] v) {
        switch (id) {
            case 0 -> bubbleSort(v);
            case 1 -> selectionSort(v);
            case 2 -> insertionSort(v);
        }
    }

    public static int[] gerarVetorAleatorio(int n) {
        Random rd = new Random();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = rd.nextInt(10000);
        return v;
    }

    public static int[] gerarVetorOrdenado(int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = i;
        return v;
    }

    public static int[] gerarVetorInvertido(int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = n - i;
        return v;
    }
}