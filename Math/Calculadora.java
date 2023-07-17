package Math;

public class Calculadora {
	public static void main(String[] args) {
		
		Operacoes op1 = new Operacoes();
		Operacoes op2 = new Operacoes(2, 3);
		Operacoes op3 = new Operacoes(5,6,7);
		
		op2.somar(44,5);
		op2.divisao(44, 4);
		op2.subtrair(4,3);
		op2.divisao(4,4);
	}

}
