package algoExpert.facile;

public class InsertionSort {
    public static void main(String[] args) {
        // array INPUT [8, 5, 2, 9, 5, 6, 3]
        // OUTPUT [2,3,5,5,6,8,9]

        int [] tab = {8, 5, 2, 9, 5, 6, 3};

        int [] arr = insertionSort(tab);
        String s ="";
    }

    public static int[] insertionSort(int[] array) {
        int sortArraylen ;
        for (int i = 1; i < array.length; i++) {
            int min = 0;
            sortArraylen = i ;
            if(array[i-1] > array[i]){
                min = array[i];
                array[i] = array[i-1];
                array[i-1] = min;

            }
            int max = 0;
            for (int j = sortArraylen; j > 0; j--) {
                if(array[j] <array[j-1]){
                    max = array[j-1];
                    array[j-1] = array[j];
                    array[j] = max;
                }
            }

        }
        return array;
    }
}
