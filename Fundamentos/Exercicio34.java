package Fundamentos;

public class Exercicio34 {
	public static void main(String[] args) {
		String str = "o rato roeu a roupa do rei de roma";
		int tam = str.length();
		String resultado = str.replace(" ","");
		int tam2 = str.length();
		System.out.println(str);
		System.out.println(tam);
		System.out.println(resultado.length());
		
	}

}
