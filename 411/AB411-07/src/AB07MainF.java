import java.util.Arrays;

public class AB07MainF {
    public static void main(String[] args) {

        int[] unsortiert = { 4, 1, 8, -3, 5, 7 };
        int[] sortiert = insertionSort(unsortiert);
        System.out.println(Arrays.toString(sortiert));
        sortiert = bubbleSort(unsortiert);
        System.out.println(Arrays.toString(sortiert));
    }

    public static int[] insertionSort(int[] sortieren) {
        int temp;
        for (int i = 1; i < sortieren.length; i++) {
            temp = sortieren[i];
            int j = i;
            while (j > 0 && sortieren[j - 1] > temp) {
                sortieren[j] = sortieren[j - 1];
                j--;
            }
            sortieren[j] = temp;
        }
        return sortieren;
    }

    public static int[] bubbleSort(int[] sortieren) {
        int temp;
        for(int j = 0; j < sortieren.length-1; j++){
            for(int i = 0; i < sortieren.length-1; i++){
                temp = sortieren[i];
                if(temp > sortieren[i+1]){
                    sortieren[i+1] = sortieren[i];
                    sortieren[i] = temp;
                }
            }
        }
        return sortieren;
    }
}
