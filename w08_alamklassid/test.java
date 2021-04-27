public class test{
    public static void main(String[] arg){
        volvo v70 = new volvo();
        v70.paljuKytust();
        v70.koguKytus();
        v70.tyypKytus();
        v70.lisaKytust(50);
        v70.paljuKytust();
        v70.kasOnPiisavalt(v70.kytuseKogus);
        v70.lisaKytust(30);
        v70.paljuKytust();
        v70.kasOnPiisavalt(v70.kytuseKogus);
        System.out.println("----------------------");
        seat ibiza = new seat();
        ibiza.paljuKytust();
        ibiza.koguKytus();
        ibiza.tyypKytus();
        ibiza.lisaKytust(35);
        ibiza.paljuKytust();
        ibiza.kasOnPiisavalt(ibiza.kytuseKogus);
        ibiza.lisaKytust(10);
        ibiza.paljuKytust();
        ibiza.kasOnPiisavalt(ibiza.kytuseKogus);
    }
}