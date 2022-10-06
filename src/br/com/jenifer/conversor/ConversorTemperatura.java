package br.com.jenifer.conversor;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void CelsiustoFahrenheit(double tempRecebida) {
		double fahrenheit = (tempRecebida / 5 * 9) + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: "+ fahrenheit + "F");
	}
	
	public void CelsiustoKelvin(double tempRecebida) {
		double kelvin = (tempRecebida / 5 * 5) + 273;
		kelvin = (double) Math.round(kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "A temperatura em kelvins é: " + kelvin + "K");
	}
}
