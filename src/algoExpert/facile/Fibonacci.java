package algoExpert.facile;

public class Fibonacci {
    public static void main(String[] args) {

       /* The Fibonacci sequence is defined as follows: the first number of the sequence
        is , the second number is 0, the secodn number is 1 , and the nth number is the sum of the (n - 1)th
  and (n - 2)th numbers. Write a function that takes in an integer n  and returns the nth Fibonacci number.

  Important note: the Fibonacci sequence is often defined with its first two
  numbers as F0 = 0  and F1 = 1 . For the purpose of
  this question, the first Fibonacci number is  F0; therefire, getNthFib(1) is equal to F0, getNthFib(2) is equal to  F1

  INPUT n=6
  OUTPUT  5

  // 0, 1, 1, 2, 3, 5
  */
        int n = 6;


    System.out.println(getNthFib(6) );

    }

    public static int getNthFib(int n) {
        if(n == 1){
            return 0;
        }

        if(n==2){
            return 1;
        }

        return getNthFib(n-1) + getNthFib(n-2);
    }
}
