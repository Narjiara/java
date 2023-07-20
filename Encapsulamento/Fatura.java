package Encapsulamento;

public class Fatura {
	private String numero;
	private String descriçao;
	private int quantidade;
	private double preço;
	
    public Fatura (String numero,String descrilçao,int quantidade,double preço) {
    	this.numero=numero;
    	this.descriçao=descriçao;
    	
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade < 0) {
			this.quantidade = quantidade;	
		}else {
		this.quantidade = 0;
	   }
	}

	public double getPreço() {
		return preço;
	}
	
	
	public void setPreço(double preço) {
		if (preço < 0.0) {
		this.preço = preço;
	}else {
		this.preço = 0.0;
	  }
	}
	public double getTotalFatura() {
		return quantidade * preço;
	}
}
