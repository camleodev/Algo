package recursive;

public class SommeEntiersNaturels {
    public static void main(String[] args) {
        System.out.println( recursiveSum(5));
    }

    private static int recursiveSum(int n){
        if(n<=1)
            return n;
        return n +recursiveSum(n-1);
    }
}
