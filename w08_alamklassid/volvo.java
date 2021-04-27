public class volvo extends auto {

    public int kytuseKogus = 70;
    public String kytuseTyyp = "bensiin";

    public void kohmakas() {
        System.out.println("vajab veel kytust");
    }

    public void korras(){
        System.out.println("piisab kyll");
    }

    public void koguKytus(){
        System.out.println("paaki mahub " + kytuseKogus + "L");
    }

    public void tyypKytus(){
        System.out.println("autosse sobib ainult " + kytuseTyyp);
    }
}