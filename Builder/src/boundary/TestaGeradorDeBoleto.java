package boundary;

import product.Boleto;
import concreteBuilder.BBBoletoBuilder;
import director.GeradorDeBoleto;
import builder.BoletoBuilder;

public class TestaGeradorDeBoleto {
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new  BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto  = new GeradorDeBoleto(boletoBuilder);
		
		Boleto boleto  = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}
}
