//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++){
            int posMenor = i;

            for (int j = i + 1; j< vetor.length; j++) {
                if (vetor[j] < vetor[posMenor])
                    posMenor = j;
            }

            int temp = vetor[i];
            vetor[i] = vetor[posMenor];
            vetor[posMenor] = temp;
        }
    }
}