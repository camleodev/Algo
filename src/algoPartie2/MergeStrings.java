package algoPartie2;

public class MergeStrings {

    public static void main(String[] args) {

       /* Example 1:

        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r
        Example 2:

        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
                word1:  a   b
        word2:    p   q   r   s
        merged: a p b q   r   s
        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
                word1:  a   b   c   d
        word2:    p   q
        merged: a p b q c   d*/

        String word1 = "abcd", word2 = "pq";



        System.out.println( mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        String fusion="";

        int min= Math.min(word1.length(),word2.length());

        if(min==word1.length()){
            for(int i=0;i<min;i++){
                fusion+=word1.charAt(i);
                fusion+=word2.charAt(i);
            }
            fusion+=word2.substring(word1.length());
        }
        else{
            for(int i=0;i<min;i++){
                fusion+=word1.charAt(i);

                fusion+=word2.charAt(i);

            }

            fusion+=word1.substring(word2.length());
        }


        return fusion;

    }
}
