package algoExpert.facile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassPhotos {
    public static void main(String[] args) {

        //"redShirtHeights": [5, 8, 1, 3, 4],               1, 3 , 4 , 5, 8
        //          "blueShirtHeights": [6, 9, 2, 4, 5]   2, 4 ,5, 6, 9

      /*  [5, 6, 7, 2, 3, 1, 2, 3],
        "redShirtHeights": [1, 1, 1, 1, 1, 1, 1, 1]*/

        ArrayList<Integer> redShirtHeights = new ArrayList<>();
      /*  redShirtHeights.add(5); redShirtHeights.add(8); redShirtHeights.add(1); redShirtHeights.add(3);
        redShirtHeights.add(4);*/
        redShirtHeights.add(5); redShirtHeights.add(4);
        ArrayList<Integer> blueShirtHeights = new ArrayList<>();
     /*   blueShirtHeights.add(6);  blueShirtHeights.add(9);  blueShirtHeights.add(2);  blueShirtHeights.add(4);
        blueShirtHeights.add(5);*/
        blueShirtHeights.add(5); blueShirtHeights.add(6);
        classPhotos(redShirtHeights,blueShirtHeights);

    }

    public static boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights
    ) {
       Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        boolean red = true;
        boolean blue = true;
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if(redShirtHeights.get(i)<= blueShirtHeights.get(i)){
                red = false;
            }
        }

        for (int i = 0; i < redShirtHeights.size(); i++) {
            if(blueShirtHeights.get(i)<= redShirtHeights.get(i)){
                blue = false;
            }
        }
        return red || blue;
    }

}
