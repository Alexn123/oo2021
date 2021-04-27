public class seat extends auto {

    public int kytuseKogus = 45;
    public String kytuseTyyp = "diisel";

    public void kohmakas() {
        System.out.println("vajab veel kytust");
    }

    public void koguKytus(){
        System.out.println("paaki mahub " + kytuseKogus + "L");
    }

    public void tyypKytus(){
        System.out.println("autosse sobib ainult " + kytuseTyyp);
    }
}