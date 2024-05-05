public class EjemplodeInsertionSort {
    public static void main(String[] args) {
        int[] ArregloDesordenado = {5, 7, 8, 2, 3, 1, 6, 4};

        System.out.println("El arreglo desordenado es :");
        printArray(ArregloDesordenado);

        insertionSort(ArregloDesordenado);

        System.out.println("El Arreglo Ordenado es:");
        printArray(ArregloDesordenado);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int lista = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > lista) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = lista;
        }
    }

    public static void printArray(int[] array) {
        for (int elementosArr : array) {
            System.out.print(elementosArr + " ");
        }
        System.out.println();
    }
}
