package Math;

public class Fazenda {
	public static void main(String[] args) {
		Cachorro Cachorro1 = new Cachorro("biu",12);
		Gato Gato1 = new Gato("Mario",12);
		Ave Ave1 = new Ave ("linda",13);
		Cachorro1.Locomover();
		Cachorro1.EmitirSom();
		Gato1.Locomover();
		Gato1.EmitirSom();
		Ave1.Locomover();
		Ave1.EmitirSom();
	}

}
