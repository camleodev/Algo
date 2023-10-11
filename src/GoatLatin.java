import java.util.Arrays;

public class GoatLatin {
    public static void main(String[] args) {
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
