package algoPartie2;

public class TrouverLaDifference {

      /*  Vous recevez deux chaînes set t.

    La chaîne test générée en mélangeant aléatoirement une chaîne s, puis en ajoutant une lettre supplémentaire à une position aléatoire.

    Renvoie la lettre qui a été ajoutée à t.


    Exemple 1:

    Entrée : s = "abcd", t = "abcde"
    Sortie : "e"
    Explication : "e" est la lettre qui a été ajoutée.

    Exemple 2 :

    Entrée : s = "", t = "y"
    Sortie : "y"*/

    public static void main(String[] args) {

        String s = "abcde";
        String t = "abcdef";

        System.out.println(findTheDifference(s,t));

    }

    public static char findTheDifference(String s, String t) {
       int diff = 0;
       for(char c : t.toCharArray()){
           diff += c;
       }

       for(char c : s.toCharArray()){
           diff-= c;
       }

       return (char) diff;
    }
}
