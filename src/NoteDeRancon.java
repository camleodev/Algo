public class NoteDeRancon {
    public static void main(String[] args) {

 /*       Exemple 2 :

        Entrée : ransomNote = "aa", magazine = "ab"
        Sortie : false
        Exemple 3 :

        Entrée : ransomNote = "aa", magazine = "aab"
        Sortie : vrai*/

        String ransomNote ="aa";

        String magazine ="ab";

        System.out.println(isRansomNote(ransomNote,magazine));

    }

    private static boolean isRansomNote(String ransomNote, String magazine){
        int indexString = ransomNote.length();
        int indexLoop = 0;
        for (char c: ransomNote.toCharArray()
        ) {
            if(magazine.contains(String.valueOf(c))){
               magazine = magazine.replaceFirst(String.valueOf(c),"");
                indexLoop++;
            }else{
                return false;
            }
        }
        return true;
    }
}
