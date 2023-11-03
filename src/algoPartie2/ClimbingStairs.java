package algoPartie2;

public class ClimbingStairs {
    public static void main(String[] args) {

   /*     You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step*

        pour 4 il ya 5 possibilités, pour 5 il y en a 8

        fait penser à al suite de fibonacci
        /
    */

        System.out.println(climbStairs(5));

    }

    public static int climbStairs(int n) {
        if(n ==1){return 1;}

        if(n ==2){return 2;}

        int p = 1,s = 2,res = 0;

        for(int i = 3; i <= n; i++) {
            res = p + s;
            p = s;
            s = res;
        }

        return res;
    }

}
