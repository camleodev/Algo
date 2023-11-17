package algoExpert.facile;

public class Cipher {
    public static void main(String[] args) {

      /*  Given a non-empty string of lowercase letters and a non-negative integer
        representing a key, write a function that returns a new string obtained by
        shifting every letter in the input string by k positions in the alphabet,
                where k is the key.
  Note that letters should "wrap" around the alphabet; in other words, the
  letter  z  shifted by one returns the letter  a
    INPUT
    string = "xyz";
    key = 2

    OUTPUT
    zab

  */

        //ma version
        System.out.println(caesarCypherEncryptor("abc",52));
        //une version simplifiée
        System.out.println(caesarCypherEncryptorBis("xyz",2));
    }

    // Ma version
    public static String caesarCypherEncryptor(String str, int key) {
        // utilisation code ASCII
       char [] tab = str.toCharArray();
       final int ascciLimite = 122; // z= 122
        final int firstascii = 97; // a=97
       String s = "";
        for (int i = 0; i < tab.length; i++) {
            int ascciCode = tab[i]+key;
            if(ascciCode > ascciLimite){
                ascciCode = getIndice(ascciCode);
                s+= (char)ascciCode;
            }else{
                s+= (char)ascciCode;
            }

        }
        System.out.println((int) 'a');
        return s;
    }

    public static int getIndice(int ascciCode){
        final int firstascii = 97; // a = 97
        while(ascciCode> 122){
            ascciCode= ascciCode - 122;
            ascciCode = ascciCode + firstascii -1; //pour arriver au premier caractère
        }
        return ascciCode;
    }

    public static String caesarCypherEncryptorBis(String str, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int ascci_value = str.charAt(i)+ (key % 26);
            if(ascci_value > 'z'){
                ascci_value -= 26;
            }
            sb.append((char) ascci_value);
        }
        return sb.toString();
    }

}
