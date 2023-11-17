package algoExpert.facile;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {


       /* Write a function that takes in a non-empty array of integers that are sorted
        in ascending order and returns a new array of the same length with the squares
        of the original integers also sorted in ascending order.


      While the integers in the input array are sorted in increasing order, their
      squares won't necessarily be as well, because of the possible presence of
      negative numbers. exemple: [-5, -4, -3, -2, -1]

        INPUT
        Array =  = [1, 2, 3, 5, 6, 8, 9]
        OUTPUT
        [1, 4, 9, 25, 36, 64, 81]

        */
        int[] array =  {1, 2, 3, 5, 6, 8, 9};

        int[] tab = sortedSquaredArray(array);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }

    //Solution non optimisée
    public static int[] sortedSquaredArray(int[] array) {
        int [] tab = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            tab[i] = (int) Math.pow(array[i],2);
        }
        Arrays.sort(tab);
        return tab;
    }
}
