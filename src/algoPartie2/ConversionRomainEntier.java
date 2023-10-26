package algoPartie2;

public class ConversionRomainEntier {
    public static void main(String[] args) {
      /*  Example 1:

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


        String s = "MCMXCIV";
         s = s.replace("IV","4,");
         s = s.replace("CM","900,");
         s = s.replace("XC","90,");
         s = s.replace("M","1000,");

        System.out.println();
        System.out.println(s);

    }

    public int romanToInt(String s) {
        return  0;
    }

}
