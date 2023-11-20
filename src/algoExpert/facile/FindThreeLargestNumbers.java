package algoExpert.facile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindThreeLargestNumbers {
    public static void main(String[] args) {


      /*  Write a function that takes in an array of at least three integers and,
        without sorting the input array, returns a sorted array of the three largest
        integers in the input array.
  The function should return duplicate integers if necessary; for example, it
  should return [10, 10, 12]  for an input array of [10, 5, 9, 10, 12]

  INPUT
    array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]

  OUTPUT
  [18, 141, 541]

  */
        int[] tab = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] arr = findThreeLargestNumbers(tab);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] tab2 = {array[0], array[1], array[2]};
        Arrays.sort(tab2);
        if(array.length == 3){
            return tab2;
        }
        HashSet<Integer> arr = new HashSet<>();
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 3; j < array.length; j++) {
                if (tab2[i] < array[j] ) {
                    if(!arr.contains(array[j])){
                        tab2[i] = array[j];
                        arr.add(array[j]);
                        Arrays.sort(tab2);
                    }
                }
            }
        }
        Arrays.sort(tab2);
        return tab2;
    }

}
