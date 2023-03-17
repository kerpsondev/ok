import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        double FirstRoom,  FirstRoom1, FirstRoom2,SecondRoom, SecondRoom1, SecondRoom2, ThirdRoom, ThirdRoom1, ThirdRoom2, FourthRoom,FourthRoom1,FourthRoom2;
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj dlugość pierwszego pokoju ");
         FirstRoom1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj szerokosc pierwszego pokoju");
        FirstRoom2 = klawisz.nextDouble();
        klawisz.nextLine();

        FirstRoom = FirstRoom1*FirstRoom2;
        System.out.println("Pierwszy pokoj ma wymiary " + FirstRoom);



        System.out.println("Podaj dlugość drugiego pokoju ");
        SecondRoom1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj szerokosc drugiego pokoju ");
        SecondRoom2 = klawisz.nextDouble();
        klawisz.nextLine();

        SecondRoom = SecondRoom1*SecondRoom2;
        System.out.println("Drugi pokoj ma wymiary " + SecondRoom);



        System.out.println("Podaj dlugość trzeciego pokoju");
        ThirdRoom1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj szerokosc trzeciego pokoju");
        ThirdRoom2 = klawisz.nextDouble();
        klawisz.nextLine();

        ThirdRoom = ThirdRoom1*ThirdRoom2;
        System.out.println("Trzeci pokoj ma wymiary " + ThirdRoom);


        System.out.println("Podaj szerokosc czwartego pokoju ");
        FourthRoom1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj dlugość czwartego pokoju");
        FourthRoom2 = klawisz.nextDouble();
        klawisz.nextLine();

        FourthRoom = FourthRoom1*FourthRoom2;
        System.out.println("Czwarty pokoj ma wymiary " + FourthRoom);





    }
}
