public class Zadanie18 {
    public static void main(String[] args) {
        int numberOfActions=600;
        double  priceOfOneActionWithCommission=21.77, commissionForAction=0.02;
        double priceOfActionWithoutCommission = priceOfOneActionWithCommission-(priceOfOneActionWithCommission*commissionForAction);
        double priceOfAllActionsWithoutCommission = priceOfActionWithoutCommission*numberOfActions;
        double priceOfCommissionForAllActions = numberOfActions*commissionForAction*priceOfActionWithoutCommission;
        double pricePaidForActionsWithCommission = priceOfCommissionForAllActions+priceOfAllActionsWithoutCommission;
        System.out.println("Kwota zapłacona za same akcje bez prowizji " + priceOfActionWithoutCommission);
        System.out.println("Wysokosc prowizji "+ priceOfCommissionForAllActions);
        System.out.println("Łączna zapłacona kwota "+ pricePaidForActionsWithCommission);

    }
}
