public class Hammasratas {
    double p66rded = 0;

    public double liikumine(int hambad){
        p66rded += hambad / 100D;
        p66rded = Math.round(p66rded *100) /100D;
        return p66rded;
    }
}