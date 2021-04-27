public class roopyhendus extends hulgiyhendus {
    public boolean kasJuhib(){
        for(voolujuht v: hoidla){
            if(v.kasJuhib()){return true;}
        }
        return false;
    }
}