import java.util.Scanner;

public class PrijestupneGodine {
    public static void main(String[] args) {
        int [] godine = new int [7];
        for (int i=0; i<7; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Unesi "+ (i+1) + ". godinu:");
            int a=sc.nextInt();
            godine [i] = a;

            if (a % 4 == 0) {
                if (a % 100 != 0){
                    System.out.println ("Godina "+ a + " je prijestupna");
                } else if (a % 400 == 0) {
                        System.out.println("Godina " + a + " je prijestupna");
                } else {
                    System.out.println ("Godina "+ a + " nije prijestupna");
                }
            } else {
                System.out.println ("Godina "+ a + " nije prijestupna");
                }
        }

        System.out.println (" ");
        System.out.println ("Popis svih unesenh godina: ");
        for (int i: godine) {
            System.out.println (i);
        }

    }
}
