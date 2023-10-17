package recursive;

public class DecimalEnBinaire {
    public static void main(String[] args) {
        //11001000
        System.out.println(trouverBinaire(44,""));
    }

    private static String trouverBinaire(int decimal, String resultat){
        if(decimal ==0){
            return resultat;
        }
        resultat = decimal % 2 + resultat;
        return trouverBinaire(decimal/2,resultat);
    }
}
