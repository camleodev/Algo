public class DeuxSommes {
    public static void main(String[] args) {
        /*Étant donné un tableau d'entiers nums et un entier target, renvoie les indices des deux nombres tels qu'ils totalisent target .

        Vous pouvez supposer que chaque entrée aurait exactement une solution et vous ne pouvez pas utiliser deux fois le même élément.

                Vous pouvez renvoyer la réponse dans n'importe quel ordre.*/

        /*Exemple 1:

        Entrée : nums = [2,7,11,15], cible = 9
        Sortie : [0,1]
        Explication : Parce que nums[0] + nums[1] == 9, nous renvoyons [0, 1].
        Exemple 2 :

        Entrée : nums = [3,2,4], cible = 6
        Sortie : [1,2]
        Exemple 3 :

        Entrée : nombres = [3,3], cible = 6
        Sortie : [0,1]*/

       int [] nums = {3,2,4};
       int cible = 6;

       int [] sortie = null;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length ; j++) {
                if(nums[i]+nums[j] == cible
                ){
                    sortie = new int[]{i, j};
                    break;
                }
            }
        }
        for (int i:
             sortie) {
            System.out.println(i);
        }
    }
}
