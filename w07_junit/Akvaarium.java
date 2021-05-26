public class Akvaarium {

    int pikkus;
    int laius;
    int k6rgus;
    int kogus;

    public Akvaarium(int pikkus, int laius, int k6rgus, int kogus) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.k6rgus = k6rgus;
        this.kogus = kogus;
    }

    public int ruumala() {
        int ruumala = pikkus * laius * k6rgus;
        return ruumala;
    }

    public void veeLisamine(int lisaVett) {
        kogus = kogus + lisaVett;
        if (kogus > ruumala()) {
            System.out.println("Akvaariumis on vett: " + kogus);
            System.out.println("vett voolab yle");
            kogus = ruumala();
        }
    }

    public void veeEemaldamine(int eemaldaVett) {
        kogus = kogus - eemaldaVett;
        if (kogus < 0) {
            kogus = 0;
            System.out.println("Akvaariumis ei ole vett");
        }
    }

    public void vesiTyhjaks() {
        kogus = 0;
        System.out.println("Akvaariumis ei ole vett");
    }

    public String toString() {
        return pikkus + "" + laius + "" + k6rgus + "" + kogus;
    }
}