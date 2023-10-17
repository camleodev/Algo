package recursive;

public class Palindrome {
    public static void main(String[] args) {

    }

    private static boolean isPalindrome(String input){
        //define the base-case / stopping condition
        if(input.length() == 0 || input.length() ==1){
            return true;
        }
        //do some work to shrink the problem space
        if(input.charAt(0) == input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1,input.length()-1));
        }

        //additional base-case to handle non palindromes
        return false;
    }
}
