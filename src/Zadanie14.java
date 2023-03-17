import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj pierwsza ocene ");
        int grade1 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj druga ocene");
        int grade2 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj trzecia ocene");
        int grade3 = klawisz.nextInt();
        System.out.println("Ocena  zpierwszego testu to " + grade1 + "\nOcena z drugiego testu to "+grade2+"\nOcena z trzego testu to "+grade3 +"\nTwoja srednia wynosi " + ((grade3+ grade2+grade1)/3));

    }
}
