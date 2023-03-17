import java.util.Scanner;

public class Zadane13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int box = 40, portion = 10, caloriesPerPortion = 300, numberOfCookies;
        System.out.println("Podaj liczbe zjedzonych ciastek ");
        numberOfCookies = klawisz.nextInt();
        int caloriesPerCookie = caloriesPerPortion/(box/portion);
        System.out.println("Kalorie zjedzone wynosza " + (caloriesPerCookie*numberOfCookies));
    }
}
