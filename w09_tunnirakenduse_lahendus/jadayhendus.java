public class jadayhendus extends hulgiyhendus{
    public boolean kasJuhib(){
        for(voolujuht v: hoidla){
            if(v.kasJuhib()==false){return false;}
        }
        return true;
    }
}