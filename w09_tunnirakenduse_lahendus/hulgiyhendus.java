import java.util.*;
public abstract class hulgiyhendus implements voolujuht{
    List<voolujuht> hoidla = new ArrayList<voolujuht>();
    public void lisa(voolujuht v) {hoidla.add(v);}
}