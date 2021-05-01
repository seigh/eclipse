package br.com.poo;

import br.com.poo.modelo.*;


public class MaquinaDeBilhete {
	
	public static void main(String[] args) {
		Show show = new Show();
		
		show.getEntradas().add(new EntradaEmShow("Lamp Tour", "Lamp", "Paralela", 5000, 30, 9, 2021, 17, 50, 10, 30));
		show.getEntradas().add(new EntradaEmShow("Polkadot Osaka", "Polkadot", "Osaka", 5000, 30, 9, 2021, 17, 50, 10, 30));
		

		//show.CriarEvento();
		show.ExibirShow();
		show.ComprarIngresso();

		
	}

}
