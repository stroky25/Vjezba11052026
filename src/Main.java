import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int a = input.nextInt();
        int a = Integer.parseInt(input.nextLine()); // konverzija stringa (teskta) u integer (broj)
        //System.out.println (a);
        int b = Integer.parseInt(input.nextLine()); // konverzija stringa (teskta) u integer (broj)
        //System.out.println (b);

        //Unesi dva broja. Unos većeg broja zapisat će se u varijablu c
        int c;

   //     if (a>b) {
   //         c = a;
    //    } else {
    //        c = B;
    //    }
        c = (a>b) ? a : b; // ternarni operator ?
        System.out.println ("vrijednost varjable c je sljedeća: " + c);


    }
}
