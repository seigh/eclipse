package br.com.poo.modelo;

public class Local {
	private String endereco;
	private int capacidade;
	
	public Local(String endereco, int capacidade) {
		this.endereco = endereco;
		this.capacidade = capacidade;
		
	}
	
	@Override
	public String toString() {
		return "Endere�o: "+ endereco +" \nCapacidade: "+ capacidade +"";
	}

}
