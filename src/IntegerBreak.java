public class IntegerBreak {
/*
    Étant donné un entier n, divisez-le en la somme des k entiers positifs , où k >= 2, et maximisez le produit de ces entiers.

    Renvoyez le maximum de produit que vous pouvez obtenir .*/

    public static void main(String[] args) {
    /*    Entrée : n = 10
        Sortie : 36
        Explication : 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.*/

        int n = 10;

        System.out.println(calculerIntegerBreak(6));


    }

    private static int calculerIntegerBreak(int n){
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }

        int restant = n % 3;
        int quotien = n / 3;

        if (restant == 1) {
            quotien-= 1;
            restant = 4;
        }

        int result = (int) Math.pow(3, quotien);

        if (restant != 0) {
            result *= restant;
        }

        return result;
    }
}
