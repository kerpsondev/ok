public class Zadanie5 {
    public static void main(String[] args) {
        int FirstRoom1 = 3, FirstRoom2 = 4;
        System.out.println("Pierwszy pokoj ma "+ (FirstRoom1*FirstRoom2) + " metrów kwadratowych" );

        int SecondRoom1 = 3, SecondRoom2 = 4;
        System.out.println("Drugi pokoj ma "+ (SecondRoom1*SecondRoom2) + " metrów kwadratowych" );

        int ThirdRoom1 = 2, ThirdRoom2 = 3;
        System.out.println("Trzeci pokoj ma "+ (ThirdRoom1*ThirdRoom2)+ " mertrów kwadratowych");

        int FourthRoom1 = 2, FourthRoom2  = 2;
        System.out.println("Czwarty pokoj ma " + (FourthRoom1*FourthRoom2)+ " metrow kwadratowych");

        System.out.println("Mieszkania ma "+ (FourthRoom1*FourthRoom2+ThirdRoom1*ThirdRoom2+SecondRoom1*SecondRoom2+FirstRoom1*FirstRoom2)+" metrów kwadratowych");

        System.out.println("Na jedną osobe przypada " + ((FourthRoom1*FourthRoom2+ThirdRoom1*ThirdRoom2+SecondRoom1*SecondRoom2+FirstRoom1*FirstRoom2)/4)+" metrów kwadratowych");

    }
}
