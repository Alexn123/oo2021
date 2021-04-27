public class faktoriaalArvutaja implements FunktsiooniLiides<Integer, Integer>{
    public Integer arvuta(Integer sisend){
        int faktoriaal = 1;
        for(int i=1;i <= sisend;i++){
            faktoriaal = faktoriaal * i;
        }
        return faktoriaal;
    }
}