import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj wartosc produktu");
        double price = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Cena produktu wynosi " + price + "\nWartość podatku stanowego wynosi " + (price*0.02) + "\nWartosc podatku lokalnego wynosi " + (price*0.04) + "\nŁączna cena wynosi " + ((price*0.02)+(price*0.04) + price));
    }
}
