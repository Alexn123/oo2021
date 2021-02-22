public class klassidkodune2 {

    private int t2ringusilm;   
    private int t2ringval;  

    public klassidkodune2 () {
        t2ringusilm = 6;
        t2ringval = 1;
    }

    public int veeretus () {
        t2ringval = (int) (Math.random() * t2ringusilm) + 1;
        return t2ringval;
    }

    public int gett2ringval () {
        return t2ringval;
    }
 }