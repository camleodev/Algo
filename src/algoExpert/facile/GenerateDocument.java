package algoExpert.facile;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    public static void main(String[] args) {


     /*   You're given a string of available characters and a string representing a
        document that you need to generate. Write a function that determines if you
        can generate the document using the available characters. If you can generate
        the document, your function should return true  ; otherwise, it
         should return  false


  You're only able to generate the document if the frequency of unique
  characters in the characters string is greater than or equal to the frequency
  of unique characters in the document string. For example, if you're given
  characters = "abcabc"  and  document = "aabbccc" you cannot  generate the document because you're missing one  c.

  INPUT
  characters  ="Bste!hetsi ogEAxpelrt x"  document = "AlgoExpert is the Best!"
  OUTPUT
  true
  */
        String s1 = "Bste!hetsi ogEAxpelrt x";
        String s2 = "AlgoExpert is the Best!";
        //OUTPUT TRUE

        String s3 = "abcabc";
        String s4 = "aabbccc";
        //OUTPUT FALSE
        String s5 = "helloworldO";
        String s6 = "hello wOrld";
        //OUTPUT TRUE

        System.out.println(generateDocument(s5, s6));

    }

    public static boolean generateDocument(String characters, String document) {
     /*   characters = characters.replaceAll("\\s+","");
        document = document.replaceAll("\\s+","");*/


        Map<Character,Integer> mapDocument = alimenterMap(document);
        Map<Character,Integer> mapCharacters = alimenterMap(characters);
        for (Map.Entry<Character,Integer> entry:mapDocument.entrySet()) {
            if(!mapCharacters.containsKey(entry.getKey())){
                return false;
            }else{
                if(  mapCharacters.get(entry.getKey()) < entry.getValue()){
                    return false;
                }
            }
        }

        return true;
    }

   public static Map<Character,Integer> alimenterMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        char [] tab = s.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if(map.containsKey(tab[i])){
                Integer res = map.get((tab[i]));
                map.put(tab[i],res+1);
            }else{
                map.put(tab[i],1);
            }
        }
        return map;
    }
}
