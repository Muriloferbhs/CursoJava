package cursojaca;

public class FuncoesInteressantesJava02 {

	public static void main(String[] args) {
		String s = "cubo quadrado triagulo";
		String[] vect1 = s.split(" ");
		String[] vect2 = s.split("o, a");
		String[] vect3 = s.split("a");
		
		System.out.println(vect1[0]);
		System.out.println(vect1[1]);
		System.out.println(vect1[2]);
		System.out.println(" ");
		System.out.println(vect2[0]);
		System.out.println(vect2[1]);
		System.out.println(vect2[2]);
		System.out.println(" ");
		System.out.println(vect3[0]);
		System.out.println(vect3[1]);
		System.out.println(vect3[2]);
		
		
	}

}
