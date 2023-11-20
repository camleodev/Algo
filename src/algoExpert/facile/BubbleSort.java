package algoExpert.facile;

public class BubbleSort {
    public static void main(String[] args) {

       /* Write a function that takes in an array of integers and returns a sorted
        version of that array. Use the Bubble Sort algorithm to sort the array.

  If you're unfamiliar with Bubble Sort, we recommend watching the Conceptual
  Overview section of this question's video explanation before starting to code.
  INPUT
   = [8, 5, 2, 9, 5, 6, 3]
   OUTPUT
    = [2, 3, 5, 5, 6, 8, 9]

  */
        int[] tab = {8, 5, 2, 9, 5, 6, 3};
        bubbleSort(tab);
        String s ="";
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if(i== array.length-1){
                if(j ==0){
                    break;
                }
                i =0;
                j=0;
            }
            if( i <array.length-1 && array[i] >array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                j ++;
            }

        }
        return array;
    }
}
