import java.util.Scanner;

public class Zadanie77 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Dziś jest 17.03.2023");

        System.out.println("Podaj imie oraz nazwisko");
        String name = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj ulice ");
        String adres = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj numer domu i mieszkania");
        int home = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj nazwe miasta");
        String city = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj kod pocztowy");
        int postcode = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj numer telefonu");
        int number = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Twoje imie i nazwisko: " + name +"\nTwoja ulica i numer domu: " + adres + ", " +home + "\nTwoje  miasta i kod pocztowy: " + city + ", " + postcode + "\nTwój numer telfonu: " + number);

    }
}
