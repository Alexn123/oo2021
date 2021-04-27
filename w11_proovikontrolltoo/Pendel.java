public class Pendel{
    double v6nkeperiood;
    Hammasratas h1 = new Hammasratas();

    public Pendel(double pikkus) throws InterruptedException{        
        v6nkeperiood = 2 * Math.PI * Math.sqrt(pikkus/ 9.8);
        int tiksumine = (int) v6nkeperiood * 1000;

        for(int i = 0; i<30; i++){
            System.out.println("tik");
            Thread.sleep(tiksumine); 
            System.out.println("hammasratas " + h1.liiguEdasi(10));
            System.out.println("tok");
            Thread.sleep(tiksumine);
            System.out.println("hammasratas " + h1.liiguEdasi(10));
        }
    }
}