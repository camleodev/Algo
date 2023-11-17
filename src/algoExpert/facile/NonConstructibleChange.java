package algoExpert.facile;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {

      /*  For example, if you're given coins = [1, 2, 5] , the minimum
  amount of change that you can't create is 4

  INPUT
   coins = [5, 7, 1, 1, 2, 3, 22]
    OUTPUT
    20
  */
        int[] coins = {5, 7, 1, 1, 2, 3, 22};

       System.out.println(nonConstructibleChange(coins));
    }

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
       int change = 0;
        for(int coin:coins){
            if(coin > change +1){
                return change +1;
            }
            change+=coin;
        }
        return change+1;
    }
}
