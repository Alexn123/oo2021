public class funktsioonid1{
	public static double taksoSõit(double h){
		return 3+h*0.80;
	}
	public static String temperatuuriHinnang(int t){
		if(t<18) {return "külm";}
		return "soe";
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static void main(String[] arg){
		System.out.println(ringiPindala(5));
		if(arg.length==1){
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
		}
		System.out.println(taksoSõit(2));
	}
}