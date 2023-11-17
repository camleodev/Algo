package algoExpertMoyen;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
    /*   Write a function that takes in a string made up of brackets {( [[ )] }  and other optional characters. The function should return a
  boolean representing whether the string is balanced with regards to brackets.
  A string is said to be balanced if it has as many opening brackets of a
  certain type as it has closing brackets of that type and if no bracket is
  unmatched. Note that an opening bracket can't match a corresponding closing
  bracket that comes before it, and similarly, a closing bracket can't match a
  corresponding opening bracket that comes after it. Also, brackets can't
  overlap each other as in [(])

  INPUT
  string = = "([])(){}(())()()"
  OUTPUT
  true
  */
        String s = "([])(){}(())()()";

        System.out.println(balancedBrackets(s));

    }





    public static boolean balancedBrackets(String s) {
        // petit bloc de code pour épurer les éventuels caractères qui ne sont pas des parenthèses
        String string = "";
        Set<Character> set = new HashSet<>();
        set.add('('); set.add(')'); set.add('[');
        set.add(']');set.add('{');set.add('}');
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                string+= s.charAt(i);
            }
        }
        //fin bloc

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (char c : string.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            }
            else if (stack.empty() || stack.pop() != c) return false;
        }
        return stack.empty();
    }
}
