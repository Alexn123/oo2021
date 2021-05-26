public class Arvutamine {

    public int noot, terts, kvint;

    public Arvutamine(int noot) {
        this.noot = noot;
        terts = noot + 4;
        kvint = noot + 7;
    }

    public int t2htNumbriks(String t2htnimetus) {

        if (t2htnimetus.equals("C")) {
            return 60;
        }
        if (t2htnimetus.equals("F")) {
            return 65;
        }
        if (t2htnimetus.equals("G")) {
            return 67;
        }
        return -1;
    }

    public String toString() {
        return noot + "" + terts + "" + kvint;
    }
}