public class Zadanie19 {
    public static void main(String[] args) {
        int liczbaAnkietowanych=12467;
        double liczbaKupujacaEnergetykiWProcentach=0.14, liczbaPreserujacaCytrusoweWProcentach=0.64;
        double iloscOsobKupujacychEnergetyki= liczbaAnkietowanych*liczbaKupujacaEnergetykiWProcentach;
        double iloscOsobPreserujacychCytrynowe=iloscOsobKupujacychEnergetyki*liczbaPreserujacaCytrusoweWProcentach;
        System.out.println("Około liczba osob pijaca energetyki "+ iloscOsobKupujacychEnergetyki);
        System.out.println("Około  losob preferujaca cytrusowe " + iloscOsobPreserujacychCytrynowe);

    }
}
