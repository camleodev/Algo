package algoPartie2;

import java.util.Arrays;

public class Anagramme {
/*
    Étant donné deux chaînes set t, renvoie true if t est une anagramme de s, et false sinon .

    Un anagramme est un mot ou une phrase formé en réorganisant les lettres d’un mot ou d’une phrase différent, en utilisant généralement toutes les lettres originales exactement une fois.



    Exemple 1:

    Entrée : s = "anagram", t = "nagaram"
    Sortie : vrai
    Exemple 2 :

    Entrée : s = "rat", t = "car"
    Sortie : faux*/
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

       System.out.println(anagramme(s,t));
    }

    private static boolean anagramme(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
