package algoPartie2;

public class FindIndexFirstOccurrenceInString {
    public static void main(String[] args) {

      /*  Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



        Example 1:

        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
        Example 2:

        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.*/


        String haystack = "sadbutsad", needle = "sad";

        System.out.println(strStr(haystack, needle));;

    }

    public static int strStr(String haystack, String needle) {
        int needleLength = 0;
        if(needle.length() > haystack.length()) //ici la condition est rajoutée pour éviter l'exception index bound array exception
                                                // condition ici rajouté pour LeetCode. Normalement pas besoin si l'aiguille est plus petite que la
                                                // botte de foin. On devrait avoir la variable directement assigné avec la longueur de "needle"
            needleLength = haystack.length();
        else
            needleLength = needle.length();

        boolean continuer = true;
        boolean trouve = false;
        int i = 0;
        while(continuer){
            if(haystack.substring(i,needleLength).equals(needle)){
                trouve = true;
                break;
            }
            i++;
            needleLength++;
            if(needleLength > haystack.length()){
                continuer = false;
            }
        }
        if(trouve)
         return i;
        else
            return  -1;
    }
}
