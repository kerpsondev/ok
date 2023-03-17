import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        double szklankiCukruNa48Ciastek=1.5, szklankiMaslaNa48Ciastek=1,szklankiMakiNa48Ciastek=2.75;
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj liczbe ciastek");
        int liczbaCiastek = klawisz.nextInt();
        double szklankaCukruNaJednoCiastko = szklankiCukruNa48Ciastek/48;
        double szklankaMaslaNaJednoCiastko = szklankiMaslaNa48Ciastek/48;
        double szklankaMakiNaJednoCiastko = szklankiMakiNa48Ciastek/48;

        System.out.println("Liczba ciastek = "+liczbaCiastek);
        System.out.println("Liczba szklanek cukru na "+liczbaCiastek+" ciastek = "+(szklankaCukruNaJednoCiastko*liczbaCiastek));
        System.out.println("Liczba szklanek masła na "+liczbaCiastek+" ciastek = "+(szklankaMaslaNaJednoCiastko*liczbaCiastek));
        System.out.println("Liczba szklanek maski na "+liczbaCiastek+" ciastek = "+(szklankaMakiNaJednoCiastko*liczbaCiastek));


    }
}
