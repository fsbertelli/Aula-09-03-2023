import java.util.Arrays;
import java.util.Random;

public class OrdenaArray {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 10000) + 1;
            array[i] = numeroAleatorio;
        }

        ordenarArray(array);
        int maior = encontrarMaior(array);
        int menor = encontrarMenor(array);

        System.out.printf("Numeros em ordem crescente: %s\n", Arrays.toString(array));
        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Menor número: %d\n", menor);
    }

    public static void ordenarArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int ordena = array[i];
                    array[i] = array[j];
                    array[j] = ordena;
                }
            }
        }
    }

    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}
