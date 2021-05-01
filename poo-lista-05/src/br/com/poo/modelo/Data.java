package br.com.poo.modelo;


public class Data {
	private int ano;
	private int mes;
	private int dia;
	private int hora;
	private int minuto;

	
	public Data(int ano, int mes, int dia, int hora, int minuto) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
					
	}
	@Override
	public String toString() {
		return ""+ dia +"/"+ mes +"/"+ ano +" \nHora: "+ hora +":"+ minuto +"";
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}

}
