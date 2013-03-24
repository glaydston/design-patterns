package product;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class BBBoleto implements Boleto {
	private String sacado;
	private String cedente;
	private Double valor;
	private Calendar vencimento;
	private Integer nossoNumero;

	public BBBoleto(String sacado, String cedente, Double valor,
			Calendar vencimento, Integer nossoNumero) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	public String getSacado() {
		return sacado;
	}

	public String getCedente() {
		return cedente;
	}

	public Double getValor() {
		return valor;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public Integer getNossoNumero() {
		return nossoNumero;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Boleto BB");
		stringBuilder.append("\n");

		stringBuilder.append("Sacado: " + this.sacado);
		stringBuilder.append("\n");

		stringBuilder.append("Cedente: " + this.cedente);
		stringBuilder.append("\n");

		stringBuilder.append("Valor: " + this.valor);
		stringBuilder.append("\n");

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String date = format.format(this.vencimento.getTime());
		stringBuilder.append("Vencimento: " + date);
		stringBuilder.append("\n");

		stringBuilder.append("Nosso Número: " + this.nossoNumero);
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}
}
