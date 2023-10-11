public class PierresPrecieucesCailloux {
    public static void main(String[] args) {
        /*Vous recevez des chaînes jewels représentant les types de pierres qui sont des bijoux et stones représentant les pierres que vous possédez.
        Chaque caractère stones est un type de pierre que vous possédez. Vous voulez savoir combien de pierres que vous possédez sont également des bijoux.

        Les lettres sont sensibles à la casse, elles "a" sont donc considérées comme un type de pierre différent de "A".

        Exemple 1:
            Entrée : bijoux = « aA », pierres = « aAAbbbb »
             Sortie : 3
        Exemple 2 :
            Entrée : bijoux = "z", pierres = "ZZ"
            Sortie : 0
    */
        System.out.println(numJewelsInStones("aA","aAAbbbb"));


    }

    public static int numJewelsInStones(String jewels, String stones) {
            String [] tab = null;
            String [] tab2 = null;
            int compteur = 0;
            tab = jewels.split("");
            tab2 = stones.split("");
            for(int i = 0; i < tab.length; i++) {
                for (int j = 0; j <tab2.length; j++) {
                    if(tab[i].contains(tab2[j])){
                        compteur ++;
                    }
                }

            }
            return compteur;
    }
}
