package algoExpert.facile;

import java.util.List;

public class ValidSubsequenceArray {
    public static void main(String[] args) {

     /*   Given two non-empty arrays of integers, write a function that determines
        whether the second array is a subsequence of the first one.
  A subsequence of an array is a set of numbers that aren't necessarily adjacent
  in the array but that are in the same order as they appear in the array. For
  instance, the numbers [1, 3, 4]  form a subsequence of the array [1, 2, 3, 4] , and so do the numbers  [2, 4] . Note
  that a single number in an array and the array itself are both valid
  subsequences of the array.

  INPUT
    array  = [5, 1, 22, 25, 6, -1, 8, 10]
     sequence = [1, 6, -1, 10]
  OUTPUT
  TRUE
  */
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array,sequence));
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {

        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            if(index == sequence.size()){
                break;
            }
            if(array.get(i) == sequence.get(index)){
                index++;
            }

        }
        return index == sequence.size();
    }
}
