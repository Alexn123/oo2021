public class Proov{
    public static void main(String[] arg){
        Puhver<Integer, Integer> p1=new Puhver<Integer, Integer>(new RuuduArvutaja());
        Puhver<String, String> p2=new Puhver<String, String>(new KahekordneArvutaja());
        Puhver<Double, Double> p3=new Puhver<Double, Double>(new JagajaArvutaja());
        Puhver<Integer, Integer> p4 = new Puhver<Integer, Integer>(new faktoriaalArvutaja());

        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));
        System.out.println(p1.hoidla);

        System.out.println(p2.arvuta("test"));
        System.out.println(p2.hoidla);

        System.out.println(p3.arvuta(20.0));
        System.out.println(p3.arvuta(6.0));
        System.out.println(p3.hoidla);

        System.out.println(p4.arvuta(4));
        System.out.println(p4.hoidla);

    }
}