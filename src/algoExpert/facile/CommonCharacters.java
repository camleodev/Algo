package algoExpert.facile;

import java.util.*;

public class CommonCharacters {
    public static void main(String[] args) {

       /* Write a function that takes in a non-empty list of non-empty strings and
        returns a list of characters that are common to all strings in the list,
        ignoring multiplicity.
    Note that the strings are not guaranteed to only contain alphanumeric characters. The list
    you return can be in any order.
    INPUT
    strings  = ["abc", "bcd", "cbaccd"];

    OUTPUT
    ["b","c"]
      */

        String[] tab = {"abc", "bcd", "cbaccd"};
        String[] t = commonCharacters(tab);
        String s = "";

    }

    public static String[] commonCharacters(String[] strings) {
        ArrayList<String> arr = new ArrayList<>();
        Set<Character> set = null;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            set = new HashSet<>();
            for (int j = 0; j < strings[i].length(); j++) {
                set.add(strings[i].charAt(j));
            }
            for (Character c :
                    set) {
                if (map.get(c) != null) {
                    Integer count = map.get(c);
                    map.put(c, count + 1);
                } else {
                    map.put(c, 1);
                }
            }
            set = null;
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()
        ) {
            if(entry.getValue() == strings.length) {
                arr.add(String.valueOf(entry.getKey()));
            }
        }
        String [] tab = new String[arr.size()];
        return  arr.toArray(tab);
    }
}
