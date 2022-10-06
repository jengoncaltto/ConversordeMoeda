package br.com.jenifer.conversor;

import javax.swing.JOptionPane;

public class CaixaDialogo {

	public static void main(String[] args) {

		ConversorTemperatura converterTemperatura = new ConversorTemperatura();
		ConversorMoedas converterMoedas = new ConversorMoedas();
		while (true) {
			String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE,
					null, new Object[] { "Conversor de Moeda", "Conversor de temperatura" }, "Escolha").toString();

			switch (opcoes) {
			case "Conversor de Moeda":
				String opcoes2 = JOptionPane.showInputDialog(null, "Escolha um tipo de moeda", "Menu",
						JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Dolar", "Euro", "Libra" }, "Escolha")
						.toString();

				switch (opcoes2) {
				case "Dolar":
					String valorRecebidoDolar = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorDolar = Double.parseDouble(valorRecebidoDolar);

					converterMoedas.ConverterReaisParaDolar(valorDolar);

					int dolarContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

					if (dolarContinue == JOptionPane.YES_OPTION) {
						break;

					} else if (dolarContinue == JOptionPane.NO_OPTION) {

						JOptionPane.showMessageDialog(null, "O programa será finalizado!");

						System.exit(dolarContinue);
						return;

					} else if (dolarContinue == JOptionPane.CANCEL_OPTION) {
						
						break;
					}
					break;

				case "Euro":
					String valorRecebidoEuro = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorEuro = Double.parseDouble(valorRecebidoEuro);
					converterMoedas.ConverterReaisParaEuro(valorEuro);
					
					int euroContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

					if (euroContinue == JOptionPane.YES_OPTION) {
						break;

					} else if (euroContinue == JOptionPane.NO_OPTION) {

						JOptionPane.showMessageDialog(null, "O programa será finalizado!");

						System.exit(euroContinue);
						return;

					} else if (euroContinue == JOptionPane.CANCEL_OPTION) {
						break;
					}
					break;

				case "Libra":
					String valorRecebidoLibra = JOptionPane.showInputDialog("Insira um valor em reais");
					double valorLibra = Double.parseDouble(valorRecebidoLibra);
					converterMoedas.ConverterReaisParaLibra(valorLibra);

					int libraContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

					if (libraContinue == JOptionPane.YES_OPTION) {
						break;

					} else if (libraContinue == JOptionPane.NO_OPTION) {

						JOptionPane.showMessageDialog(null, "O programa será finalizado!");

						System.exit(libraContinue);
						return;

					} else if (libraContinue == JOptionPane.CANCEL_OPTION) {
						break;
					}
					break;

				}
				break;

			case "Conversor de temperatura":
				String opcoes3 = JOptionPane.showInputDialog(null, "Escolha um tipo de temperatura", "Menu",
						JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Fahrenheit", "Kelvin" }, "Escolha").toString();

				switch (opcoes3) {
				case "Fahrenheit":
					String tempEmFahrenheit = JOptionPane.showInputDialog("Insira a temperatura em Celsius");
					double valorFahrenheit = Double.parseDouble(tempEmFahrenheit);
					converterTemperatura.CelsiustoFahrenheit(valorFahrenheit);

					int celsiusContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

					if (celsiusContinue == JOptionPane.YES_OPTION) {
						break;

					} else if (celsiusContinue == JOptionPane.NO_OPTION) {

						JOptionPane.showMessageDialog(null, "O programa será finalizado!");

						System.exit(celsiusContinue);
						return;

					} else if (celsiusContinue == JOptionPane.CANCEL_OPTION) {
						break;
					}
					break;

				case "Kelvin":
					String tempEmKelvin = JOptionPane.showInputDialog("Insira a temperatura em Celsius");
					double valorKelvin = Double.parseDouble(tempEmKelvin);
					converterTemperatura.CelsiustoKelvin(valorKelvin);

					int kelvinContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

					if (kelvinContinue == JOptionPane.YES_OPTION) {
						break;

					} else if (kelvinContinue == JOptionPane.NO_OPTION) {

						JOptionPane.showMessageDialog(null, "O programa será finalizado!");

						System.exit(kelvinContinue);
						return;

					} else if (kelvinContinue == JOptionPane.CANCEL_OPTION) {
						break;
					}
					break;

				}
				break;
			}
		}
	}
}