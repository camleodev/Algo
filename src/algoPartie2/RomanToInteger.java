package algoPartie2;

public class RomanToInteger {
    public static void main(String[] args) {



        /*Example 1:

        Input: s = "III"
        Output: 3
        Explanation: III = 3.

        Example 2:

        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.

        Example 3:

        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/


        System.out.println(romanToInt("LIII"));
    }

    public static int romanToInt(String s) {

        s = s.replace("IV","4,");
        s = s.replace("V","5,");
        s = s.replace("IX","9,");
        s = s.replace("I","1,");
        s = s.replace("CD","400,");
        s = s.replace("D","500,");
        s = s.replace("XL","40,");
        s = s.replace("L","50,");
        s = s.replace("XC","90,");
        s = s.replace("X","10,");
        s = s.replace("CM","900,");
        s = s.replace("C","100,");
        s = s.replace("M","1000,");
        String []tab =s.split(",");

        int n = 0;
        for (int i = 0; i < tab.length; i++) {

            n += Integer.parseInt(tab[i]);

        }
        return n;
    }
}