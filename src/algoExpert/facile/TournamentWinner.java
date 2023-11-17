package algoExpert.facile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {
    public static void main(String[] args) {
    /*
  competitions = [
  ["HTML", "C#"],
  ["C#", "Python"],
  ["Python", "HTML"],
]

result  = [0, 0, 1];
GAGNANT ---> "Python"
// C# beats HTML, Python Beats C#, and Python Beats HTML.
// HTML - 0 points
// C# -  3 points
// Python -  6 points
*/
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("HTML");
        a1.add("C#");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("C#");
        a2.add("Python");
        ArrayList<String> a3 = new ArrayList<>();
        a3.add("Python");
        a3.add("HTML");
        competitions.add(a1);
        competitions.add(a2);
        competitions.add(a3);

        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

         System.out.println(tournamentWinner(competitions,results));;


    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            int index = results.get(i) == 0 ? 1 : 0;
            if(map.containsKey(competitions.get(i).get(index))){
               Integer res = map.get(competitions.get(i).get(index));
               map.put((competitions.get(i).get(index)),res+1);
            }else{
                map.put(competitions.get(i).get(index),1);
            }

        }

        int max = Collections.max(map.values());
        for (Map.Entry<String,Integer> entry:map.entrySet()) {
            if(entry.getValue()==max){
                return entry.getKey();
            }
        }
        return  "";
    }
}
