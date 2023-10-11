public class Tri {
    public static void main(String[] args) {
        //algo de tri croissant
        int [] tab = {10,9,7,6,3,5,1,4,2,8};
        int valeurTemp = 0;
        for (int i = 0; i < tab.length; i++) {

            for (int j = i +1; j < tab.length; j++) {
                if(tab[i]> tab[j]){
                    valeurTemp = tab[i];
                    tab[i]= tab[j];
                    tab[j]= valeurTemp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);

        }
    }
}