package Math;

public class Animal {
	String nome;
	int idade;
	public Animal(String nome, int idade) {
		this.nome= nome;
		this.idade= idade;
	}
	
	public void Locomover() {
		System.out.printf("%s esta se locomovendo \n ",this.nome);
	}
	
	public void EmitirSom() {
		System.out.printf(" %s esta emitindo som \n ",this.nome);
	}
	
	

}
