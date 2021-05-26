import org.junit.*;
import static org.junit.Assert.*;

public class AkvaariumTest {

    @Test
    public void kontroll1() {
        Akvaarium a1 = new Akvaarium(15, 15, 15, 0);
        a1.veeLisamine(150);
        assertEquals(a1.kogus, 150);
    }

    @Test
    public void kontroll2() {
        Akvaarium a1 = new Akvaarium(15, 15, 15, 150);
        a1.veeEemaldamine(149);
        assertEquals(a1.kogus, 1);
    }

    @Test
    public void kontroll3() {
        Akvaarium a1 = new Akvaarium(15, 15, 15, 150);
        a1.veeEemaldamine(155);
        assertEquals(a1.kogus, 0);
    }

    @Test
    public void kontroll4() {
        Akvaarium a1 = new Akvaarium(15, 15, 15, 150);
        a1.vesiTyhjaks();
        assertEquals(a1.kogus, 0);
    }

    @Test
    public void kontroll5() {
        Akvaarium a1 = new Akvaarium(15, 15, 15, 50);
        a1.veeLisamine(300);
        assertEquals(a1.kogus, 350);
        a1.veeEemaldamine(500);
        assertEquals(a1.kogus, 0);
        a1.veeLisamine(1300);
        a1.vesiTyhjaks();
        assertEquals(a1.kogus, 0);
        a1.veeLisamine(1);
        a1.veeLisamine(15);
        a1.veeEemaldamine(5);
        assertEquals(a1.kogus, 11);
    }
}