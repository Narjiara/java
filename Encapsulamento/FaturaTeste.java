package Encapsulamento;

public class FaturaTeste {
	public static void main(String[] args) {
		
		Fatura fatura1 = new Fatura("001", "Teclado",3,25.50);
		System.out.println("numero da fatura" + fatura1.getNumero());
		System.out.println("descricao:" + fatura1.getDescriçao());
		System.out.println("quantidade comprada:" + fatura1.getQuantidade());
		System.out.println("preço por item"+ fatura1.getPreço());
		
		double totalFatura = fatura1.getTotalFatura();
		System.out.println("total da fatura:" + totalFatura);
	}

}
