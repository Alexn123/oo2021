public class Proov {
    public static void main(String[] arg) {

        Akvaarium a1 = new Akvaarium(15, 15, 15, 300);

        System.out.println("akvaariumi ruumala on: " + a1.ruumala());
        System.out.println("akvaariumis on vett: " + a1.kogus);
        a1.veeLisamine(225);
        System.out.println("akvaariumis on vett: " + a1.kogus);
        a1.veeLisamine(2900);
        System.out.println("akvaariumis on vett: " + a1.kogus);

    }
}

// * Loo klass akvaariumi tarbeks. Konstruktori sisendiks pikkus,
// laius ja kõrgus (cm). Koosta käsklus ruumala väljastamiseks.
// * Akvaariumi eksemplar hoiab meeles sees hoitava vee kogust. Käsuga saab vett
// lisada.
// Käsuga saab küsida, et kui palju on selles akvaariumis vett.
// * Akvaariume on mitu. Koosta käsklus määratud koguse vee valamiseks ühest
// akvaariumist teise.
// Kui akvaariumi servani jääb vähem kui kaks vaba sentimeetrit, väljastatakse
// hoiatus.