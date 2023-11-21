package algoExpert.facile;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {
    public static void main(String[] args) {
      /*  All students wearing red shirts must be in the same row.
      * All students wearing blue shirts must be in the same row.
      *
    Each student in the back row must be strictly taller than the student
    directly in front of them in the front row.
    *
    *
  You're given two input arrays: one containing the heights of all the students
  with red shirts and another one containing the heights of all the students
  with blue shirts. These arrays will always have the same length, and each
  height will be a positive integer. Write a function that returns whether or
  not a class photo that follows the stated guidelines can be taken.
  */
        //"redShirtHeights": [5, 8, 1, 3, 4],
        //"blueShirtHeights": [6, 9, 2, 4, 5]

        //OUTPUT true

        ArrayList<Integer> redShirtHeights = new ArrayList<>();
        redShirtHeights.add(5);
        redShirtHeights.add(8);
        redShirtHeights.add(1);
        redShirtHeights.add(3);
        redShirtHeights.add(4);

        ArrayList<Integer> blueShirtHeights = new ArrayList<>();
        blueShirtHeights.add(6);
        blueShirtHeights.add(9);
        blueShirtHeights.add(2);
        blueShirtHeights.add(4);
        blueShirtHeights.add(5);
        System.out.println(classPhotos(redShirtHeights, blueShirtHeights));

    }

    public static boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights
    ) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        boolean red = true;
        boolean blue = true;
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (redShirtHeights.get(i) <= blueShirtHeights.get(i)) {
                red = false;
            }
        }

        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (blueShirtHeights.get(i) <= redShirtHeights.get(i)) {
                blue = false;
            }
        }
        return red || blue;
    }

}
