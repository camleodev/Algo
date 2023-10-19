package memoisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
    System.out.println(fibo(4));
        int n = 7;
        int [] memo = new int [n +1];
        System.out.println(fibo2(7,memo));

        Map<Integer,Integer> memoizedCache = new HashMap<>();
        memoizedCache.put(1,1);
        memoizedCache.put(2,1);
        System.out.println(fib3(7, memoizedCache));
    }

    //fonction non optimisée
    private static int fibo(int n){
        if(n <=2) return 1;
        return fibo(n-1)+fibo(n-2);
    }

    private static int fibo2(int n, int [] memo){
     if(n <=1) return n;

     if(memo[n] !=0){
        return memo[n];
    }else{
        memo[n] = fibo2(n-1,memo) + fibo2(n-2,memo);
        return memo[n];
    }
    }

    private static int fib3(int n, Map<Integer,Integer> memoizedCache){
        if(memoizedCache.containsKey(n)){
            return memoizedCache.get(n);
        }
        int res = fib3(n-1,memoizedCache) +fib3(n-2,memoizedCache);
        memoizedCache.put(n,res);
        return res;

    }
}
