package recursive;

public class Factorielle {
    public static void main(String[] args) {
        //O! = 1  factorielle de 1 est égal à 0
        System.out.println(factorielle(5));

    }

    private static int factorielle(int n){
        if(n == 0 || n ==1) return 1;

        return n * factorielle(n-1);
    }
}
