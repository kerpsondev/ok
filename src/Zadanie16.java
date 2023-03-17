import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto");
        String city = klawisz.nextLine();
        int cityLength = city.length();
        String cityLowerCase = city.toLowerCase();
        String cityUpperCase = city.toUpperCase();
        char cityFirstLetter = city.charAt(0);
        System.out.println("Nazwa miasta " + city);
        System.out.println("Liczba znków " + cityLength);
        System.out.println("Nazwa malymi literami "+ cityLowerCase );
        System.out.println("Nazwa duzymi literami "+ cityUpperCase);
        System.out.println("Pierwsza literka nazwy miasta " + cityFirstLetter);

    }


}
