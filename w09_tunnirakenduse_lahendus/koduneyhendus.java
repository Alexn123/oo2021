public class koduneyhendus{
    public static void kuvaOlek(voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        lyliti a = new lyliti();
        lyliti b = new lyliti();
        lyliti c = new lyliti();
        lyliti d = new lyliti();
        lyliti e = new lyliti();
        lyliti f = new lyliti();
        lyliti g = new lyliti();
        lyliti h = new lyliti();

        a.seisund(true);
        b.seisund(false);
        c.seisund(false);
        d.seisund(false);
        e.seisund(false);
        f.seisund(false);
        g.seisund(false);
        h.seisund(false);

        jadayhendus j1 = new jadayhendus();
        j1.lisa(g); j1.lisa(h);
        roopyhendus r1 = new roopyhendus();
        r1.lisa(f); r1.lisa(j1);
        jadayhendus j2 = new jadayhendus();
        j2.lisa(e); j2.lisa(r1);
        roopyhendus r2 = new roopyhendus();
        r2.lisa(d); r2.lisa(j2);
        jadayhendus j3 = new jadayhendus();
        j3.lisa(c); j3.lisa(r2);
        roopyhendus r3 = new roopyhendus();
        r3.lisa(b); r3.lisa(j3);

        jadayhendus jl6pp = new jadayhendus();
        jl6pp.lisa(a); jl6pp.lisa(r3);
        
        kuvaOlek(jl6pp);

    }
}