import org.junit.*;
import static org.junit.Assert.*;

public class Kolmk6laTest {

    Arvutamine n1 = new Arvutamine(60);

    @Test
    public void esimene() {
        System.out.println("testi käivitamine");
    }

    @Test
    public void kontroll1() {
        assertEquals(60, n1.noot);
    }

    @Test
    public void kontroll2() {
        assertEquals(67, n1.kvint);
    }

    @Test
    public void kontroll3() {
        assertEquals(64, n1.terts);
    }
}