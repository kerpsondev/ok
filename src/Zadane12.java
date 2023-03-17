import java.util.Scanner;

public class Zadane12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj przyejchane kilometry");
        double litr = klawisz.nextDouble();
        System.out.println("Podaj litry paliwa");
        double km = klawisz.nextDouble();
        System.out.println("Liczba kilometrow na litrze paliwa " +  (km/litr) );

    }
}
