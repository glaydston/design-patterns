package concreteBuilder;

import java.util.Calendar;

import product.BBBoleto;
import product.Boleto;
import builder.BoletoBuilder;

public class BBBoletoBuilder implements BoletoBuilder {
	private String sacado;
	private String cedente;
	private Double valor;
	private Calendar vencimento;
	private Integer nossoNumero;

	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;
		
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
		
	}

	@Override
	public void buildValor(Double valor) {
		this.valor = valor;
		
	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
		
	}

	@Override
	public void buildNossoNumero(Integer numero) {
		this.nossoNumero = numero;
		
	}

	@Override
	public void buildCodigoDeBarras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildLogoTipo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boleto getBoleto() {
		return new BBBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}

}
