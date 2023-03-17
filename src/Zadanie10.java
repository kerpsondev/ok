import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        String firstName, middleName,  lastName;
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj imie");
        firstName = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj drugie imie");
        middleName = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj nazwisko");
        lastName = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println(firstName+ " "+middleName+" "+lastName);





    }
}
