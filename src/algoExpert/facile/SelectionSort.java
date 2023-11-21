package algoExpert.facile;

public class SelectionSort {
    public static void main(String[] args) {
        // array INPUT [8, 5, 2, 9, 5, 6, 3]
        // OUTPUT [2,3,5,5,6,8,9]
        int [] tab = {8, 5, 2, 9, 5, 6, 3};
        int [] arr=  selectionSort(tab);
        String s = "";
    }

    public static int[] selectionSort(int[] array) {
        int index = 0;
        for (int i = index; i < array.length; i++) {
            index++;
          int min = array[i];
            for (int j = index; j < array.length; j++) {
                if(min > array[j]){
                  min = array[j];
                  array[j] =  array[i];
                  array[i] = min;

                }
            }
        }
        return array;
    }
}
