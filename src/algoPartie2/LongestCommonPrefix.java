package algoPartie2;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

      /*  Write a function to find the longest common prefix string amongst an array of strings.

                If there is no common prefix, return an empty string "".
                Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/

        String [] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix( strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();

        // on trie par ordre alphabétique
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length -1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i]!= last[i])
                break;
            sb.append(first[i]);
        }

        return sb.toString();

    }
}
