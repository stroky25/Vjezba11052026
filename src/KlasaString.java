public class KlasaString {
    public static void main(String[] args) {
        String test = "Ovo je niz znakova";
        String test1 = "\tDanas je utorak\n";
        String test2 = "\u0044anas je utorak";

        System.out.println("test: " + test);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);

        System.out.println("Veličina stringa test: " + test.length());
        System.out.println("Znak na indexu: " + test.charAt(5));
        System.out.println("Gdje se nalazi znak: " + test.indexOf('n'));
        System.out.println("Ends with: " + test.endsWith("va"));
        System.out.println("Starts with: " + test.startsWith("Ovo"));
        System.out.println("Velika slova: " + test.toUpperCase());
        System.out.println("Mala slova: " + test.toLowerCase());
        System.out.println(test1.equals(test2)); //usporedba dva stringa - metoda 1
        System.out.println(test1 ==test2); //usporedba dva stringa - metoda 2

        String rijec = "Marija";
        String rijec1 = new String ("Marija");
        System.out.println(rijec.equals(rijec1)); //usporedba dva stringa po sadržaju - metoda 1
        System.out.println(rijec ==rijec1); //usporedba dva stringa - metoda 2
    }
}
