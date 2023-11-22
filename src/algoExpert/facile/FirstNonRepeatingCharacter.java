package algoExpert.facile;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {


       /* Write a function that takes in a string of lowercase English-alphabet letters
        and returns the index of the string's first non-repeating character.
  The first non-repeating character is the first character in a string that
  occurs only once.
  If the input string doesn't have any non-repeating characters, your function
  should return  -1

  INPUT
  string = "abcdcaf"
  OUTPUT
  index 1   first non repeating character is b


  */
        String string = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(string));

    }

    public static int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),1);
            }else{
              /*  Integer res = map.get(string.charAt(i)) + 1;
                map.put(string.charAt(i),res);*/
                // getOrDefaultMethod  plus court
                map.put(string.charAt(i),map.getOrDefault(string.charAt(i),0)+1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
                if(entry.getValue() <2){
                    return string.indexOf(entry.getKey());
                }
        }

        return -1;
    }
}
