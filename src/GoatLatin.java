import java.util.Arrays;

public class GoatLatin {

/*    Vous recevez une chaîne sentencecomposée de mots séparés par des espaces. Chaque mot est composé uniquement de lettres minuscules et majuscules.

    Nous aimerions convertir la phrase en « Goat Latin » (une langue inventée similaire au Pig Latin.) Les règles du Goat Latin sont les suivantes :

    Si un mot commence par une voyelle ( 'a', 'e', 'i', 'o'ou 'u'), ajoutez-la "ma"à la fin du mot.
    Par exemple, le mot "apple"devient "applema".
    Si un mot commence par une consonne (c'est-à-dire pas une voyelle), supprimez la première lettre et ajoutez-la à la fin, puis ajoutez "ma".
            Par exemple, le mot "goat"devient "oatgma".
                                                 Ajoutez une lettre 'a'à la fin de chaque mot selon son index de mots dans la phrase, en commençant par 1.
                                                 Par exemple, le premier mot est "a"ajouté à la fin, le deuxième mot est "aa"ajouté à la fin, et ainsi de suite.
            Renvoie la phrase finale représentant la conversion de la phrase en latin de chèvre .

            */
    public static void main(String[] args) {

       /* Example 1:

        Input: sentence = "I speak Goat Latin"
        Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
        Example 2:

        Input: sentence = "The quick brown fox jumped over the lazy dog"
        Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"*/
            String [] voyelles = {"a","e","i","o","u"};
            String [] tab = null;
            String s1 = "I speak Goat Latin";

            // Tableau de la chaîne de caractères
            tab = s1.split(" ");

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        System.out.println(" ***************");

        for(int i = 0; i < tab.length; i++) {
            checkContainVoyelleAndAddMa(tab[i],voyelles, tab,i);
            tab[i] = tab[i].concat("a".repeat(i+1));

        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }




    public static void checkContainVoyelleAndAddMa(String mot, String[] voyelles, String [] tab, int index){

        char c = mot.charAt(0);
        String s = String.valueOf(c);

        boolean isVoyelle = false;
        for(int i = 0; i < voyelles.length; i++) {

            if(voyelles[i].contains(s.toLowerCase())){
                mot = mot.concat("ma");
                tab[index]= mot;
                isVoyelle = true;
            }
        }

        if(!isVoyelle){
            mot = mot.substring(1);
            mot = mot.concat(s+"ma");
            tab[index]= mot;
        }
    }


}
