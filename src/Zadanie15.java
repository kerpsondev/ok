import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna plytki");
        double price = klawisz.nextDouble();
        double profit = price*0.4;
        System.out.println("Zysk ze sprzedazy plytki wynosi " + profit);

    }
}
