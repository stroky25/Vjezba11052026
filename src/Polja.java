import java.util.Arrays;
import java.util.Collections;

public class Polja {
    public static void main(String[] args) {
        int [] brojevi = new int [5];
        brojevi [0] = 11;
        brojevi[1] = 5;
        brojevi[2] = 15;
        brojevi[3] = 4;
        brojevi[4] = 22;
        //brojevi[5] = 5; // Višak

        //       System.out.println("********Ispis kolekcije******");
        //for (int i : brojevi) { // ispis elemenata kolekcije brojevi
        //    System.out.println(i);
        // }
 //       System.out.println("********pojedinih elmenata******");
        // System.out.println (brojevi[4]); //ispis 5-og elementa polja
        // System.out.println (brojevi[1]); //ispis 2-og elementa polja

        //  System.out.println("********veličina polja******");
        //  System.out.println("Veličina polja je : " + brojevi.length);

        //Ispiši vrjiednosti ove  kolekcije korištenjem petlje for

        int DuzinaPolja = brojevi.length;
        for (int i = 0; i < DuzinaPolja; i++) {
            System.out.println (brojevi[i]);
        }

        System.out.println("********Sortiranje polja******");
        Arrays.sort(brojevi);
        for (int i: brojevi) {
            System.out.println (i);
        }

   //     System.out.println("********Metoda fill******");
   //     Arrays.fill(brojevi, 9);
   //     for (int i: brojevi) {
   //         System.out.println (i);
   //     }


        // Ispisati lelmente polja UNATRAG korištenjem petlje for --> reverse
        System.out.println("********Metoda reverse******");

        Collections.reverse (Arrays.asList (brojevi));
        for (int i: brojevi) {
            System.out.println (i);
        }
        //Napišite program koji traži unos 7 vrijednosti godina, pohraniti vrjiednosti u polje i nakon toga ispisuje jesu li te godine prijestupne ili ne.
        //Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.


    }
}
