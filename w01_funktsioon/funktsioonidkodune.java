import java.util.Random;

public class funktsioonidkodune {

    public static  int t2ringud(int numberveeretusber, int t2ringusilm)
    { 
        int numberveeretus = 0;
        int veeretus = 0;
        Random  r = new Random(); 
        if(t2ringusilm >=2) 
        { 
            for(int i = 0; i < numberveeretusber; i++)
            { 
                veeretus = r.nextInt(t2ringusilm)+1;
                System.out.println("Veeretus on:  "+veeretus);
                numberveeretus = numberveeretus + veeretus; 
            } 
        } 
        else
        { 
            System.out.println("T2ring peab olema v2hemalt 2 poolne"); // nt mynt?
        } 
        return numberveeretus;  
    } 

    public static void main(String[] arg)
    {
        System.out.println("Veeretamise tulemus on: "+t2ringud(2, 20));
    }
}