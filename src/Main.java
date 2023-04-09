import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vecto[] = {8,4,7,2,8,2,9,1,0};

        System.out.println("Original:");
        System.out.println(Arrays.toString(vecto));

        selectionSort(vecto, 9);

        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(vecto));
    }

    private static void selectionSort(int lista[], int n) {
        int min, aux;

        for (int i = 0; i <n-1; i++){
            min = i;
            for (int j=i+1; j<n; j++){
                if (lista[j] < lista[min]){
                    min = j;
                }
            }
            aux =lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }
    }
}