import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj cene posilku");
        double mealPrice = klawisz.nextDouble();
        double mealTax = mealPrice*0.0675;
        double mealTip = (mealTax+mealPrice)*0.2;
        double mealFullPriceWithTipAndTax = mealTax+mealTip+mealPrice;
        System.out.println("Cena samego posiłku " + mealPrice +"\nCena podatku "+mealTax+"\nCena napiwku " + mealTip+"\nPełna cena " + mealFullPriceWithTipAndTax);


    }
}
