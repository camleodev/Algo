package algoPartie2;

import java.util.Arrays;

public class SuiteArithmetiqueSequence {
    public static void main(String[] args) {


        /*A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

        Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

        Example 1:
        Input: arr = [3,5,1]
        Output: true
        Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

        Example 2:
        Input: arr = [1,2,4]
        Output: false
        Explanation: There is no way to reorder the elements to obtain an arithmetic progression.*/

       int [] arr = {3,5,1};

        System.out.println(canMakeArithmeticProgression(arr));

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr); //on met le tabeau dans l'ordre
        int x = arr[0] - arr[1];//comparaison du premier et deuxième élément
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] - arr[i+1] != x){
                return false;
            }
        }
        return true;
    }
}
