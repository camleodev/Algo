package memoisation;

public class gridTraveler {
    public static void main(String[] args) {


        System.out.println(gridTravel(3,3));
    }

    private static int gridTravel(int m,int n){
        if(m == 1 && n ==1) return 1;
        if( m == 0 || n == 0) return 0;
        return gridTravel(m -1,n) +gridTravel(m, n-1);
    }
}
