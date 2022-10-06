package br.com.jenifer.conversor;

import javax.swing.JOptionPane;

public class ConversorMoedas {
	
	public void ConverterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.21;
		moedaDolar = (double) Math.round(moedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + "dolares");
				
	}
	
	public void ConverterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.49;
		moedaEuro = (double) Math.round(moedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + "euros");
				
	}
	
	public void ConverterReaisParaLibra(double valorRecebido) {
		double moedaLibra = valorRecebido / 6.69;
		moedaLibra = (double) Math.round(moedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + "libras");
				
	}
}

