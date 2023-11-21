package algoExpertMoyen;

public class ThreeNumbersSort {
    public static void main(String[] args) {

        //array  = [1, 0, 0, -1, -1, 0, 1, 1]
        //order =  [0, 1, -1]

        //output [0, 0, 0, 1, 1, 1, -1, -1]

        int[] array = {1, 0, 0, -1, -1, 0, 1, 1};
        int[] order = {0, 1, -1};
        int[] tab = threeNumberSort(array, order);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }

    public static int[] threeNumberSort(int[] array, int[] order) {
        int index = 0;
        int temp = 0;
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (order[i] == array[j]) { // premmier passage faux; deuxième passage vrai :
                    temp = array[index]; // on sauvegarde 1
                    array[index] = array[j]; // on donne la valeur 0 à l'indice 0;
                    array[j] = temp; // l'indice 1 prend la valeur 1
                    index++; //on incrémente pour placer insérer le prochain élément à l'indice suivant
                }
            }
        }
        return array;
    }
}
