package Math;

public class Cachorro extends Animal {
	public Cachorro(String nome,int idade) {
		super (nome,idade);
	}
	public void EmitirSom() {
		System.out.printf("%s esta latindo \n ",this.nome);
	}
	public void Locomover() {
		System.out.printf("%S esta correndo \n",this.nome);
	}
	

}
