package br.com.poo.modelo;



public class EntradaEmShow {
	private String nome;
	private String artista;
	private Local localShow;
	private Data dataShow;
	private int ingresso;
	private int valor;
	
	
	public EntradaEmShow(String nome, String artista, String endereco, int capacidade, int dia, int mes, int ano, int hora, int minuto, int ingresso, int valor) {
		this.nome = nome;
		this.artista = artista;
		this.localShow =  new Local(endereco, capacidade);
		this.dataShow =  new Data(dia, mes, ano, hora, minuto);
		this.ingresso = ingresso;
		this.valor = valor;
				
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Nome: %s \n", nome));
		sb.append(String.format("Artista: %s \n", artista));
		sb.append(String.format("Local: %s \n", localShow));
		sb.append(String.format("Data: %s \n", dataShow));
		sb.append(String.format("Ingressos Restantes: %s \n", ingresso));
		sb.append(String.format("Valor: %s reais \n", valor));
		return sb.toString();
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public Local getLocalShow() {
		return localShow;
	}


	public void setLocalShow(Local localShow) {
		this.localShow = localShow;
	}


	public Data getDataShow() {
		return dataShow;
	}


	public void setDataShow(Data dataShow) {
		this.dataShow = dataShow;
	}


	public int getIngresso() {
		return ingresso;
	}


	public void setIngresso(int ingresso) {
		this.ingresso = ingresso;
	}

	
}
