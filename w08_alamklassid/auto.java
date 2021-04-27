public class auto{
    public int kytust = 0;

    public void paljuKytust(){
        System.out.println("kytust on: " + kytust + "L");
    }

    public void lisaKytust(int kytus){
        kytust += kytus;
    }
    public void kasOnPiisavalt(int kogus){
        if(kytust < kogus){
            System.out.println("ei ole piisavalt kytust");
        } else if(kytust == kogus) {
            System.out.println("j6uab ilusti koju");
        } else{
            System.out.println("upub yle juba");
        }
    }
}