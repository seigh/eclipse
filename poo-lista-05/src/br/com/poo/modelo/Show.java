package br.com.poo.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Show {
	ArrayList <EntradaEmShow> entradas;
	
	public Show() {
		entradas = new ArrayList<EntradaEmShow>();
	}
	
	public void CriarEvento() {
		int valor = Integer.parseInt(JOptionPane.showInputDialog( " Entre com o valor do ingresso: "));
		String nome = JOptionPane.showInputDialog( " Entre com o nome do artista: ");
		String artista = JOptionPane.showInputDialog( " Entre com o artista: ");
		String endereco = JOptionPane.showInputDialog( " Entre com o endereço: ");
		int capacidade = Integer.parseInt(JOptionPane.showInputDialog( " Entre com a capacidade total: "));
		int dia = Integer.parseInt(JOptionPane.showInputDialog( " Entre com o dia: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog( " Entre com o mês: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog( " Entre com o ano: "));
		int hora = Integer.parseInt( JOptionPane.showInputDialog( " Entre com o hora: "));
		int minuto = Integer.parseInt(JOptionPane.showInputDialog( " Entre com os minutos: "));
		int ingresso = Integer.parseInt(JOptionPane.showInputDialog( " Entre com a quantidade disponível: "));
		
		
		EntradaEmShow entrada = new EntradaEmShow(nome, artista, endereco, capacidade, dia, mes, ano, hora, minuto, ingresso, valor);
		entradas.add(entrada);
	}
	
	public void ExibirShow() {
		for(EntradaEmShow entrada : entradas) {
			if(entrada.getIngresso() > 0) {
				JOptionPane.showMessageDialog (null, entrada);
			}
		}
		
	}
	public void ComprarIngresso() {
		String artista = JOptionPane.showInputDialog( " Entre com o artista: ");
		
		for(EntradaEmShow entrada : entradas) {
			if(entrada.getArtista().equals(artista) && entrada.getIngresso() > 0) {
				int compra = Integer.parseInt(JOptionPane.showInputDialog( " Quantos ingressos deseja comprar: "));
					if(compra > entrada.getIngresso()) {
						JOptionPane.showMessageDialog (null, "Não tem Ingressos suficientes");
					} else {
						int valorT = compra * entrada.getValor();
						JOptionPane.showMessageDialog (null, "Valor total foi de: "+ valorT + " reais");
						if (JOptionPane.showConfirmDialog(null, "Deseja confirmar o pedido?", "AVISO",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog (null, "Compra realizada com suceso");
							entrada.setIngresso(entrada.getIngresso() - compra);
						} 
						JOptionPane.showMessageDialog (null, entrada);
				}
			}
		}
	}
	
	

	public ArrayList<EntradaEmShow> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<EntradaEmShow> entradas) {
		this.entradas = entradas;
	}

}
