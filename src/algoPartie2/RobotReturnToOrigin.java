package algoPartie2;

public class RobotReturnToOrigin {
    public static void main(String[] args) {

      /*  There is a robot starting at the position (0, 0), the origin, on a 2D plane.
            Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.*/
        int [] t = {0,0};
        //U = 85 D = 68 R = 82 L = 76
        String s = "RRDD";
        for (int i = 0; i < s.length(); i++) {

                switch((s.charAt(i))) {
                    case 85:
                        t[0] +=1;
                        break;
                    case 68:
                        t[0] -=1;
                        break;
                    case 82:
                        t[1] +=1;
                        break;
                    case 76:
                        t[1] -=1;
                        break;
                }
        }
     if(t[0] + t[1] == 0){
        System.out.println(t[1]);
    }
    }
}
