package refinedAbstraction;

import implementor.GeradorDeArquivo;

import abstraction.Documento;

public class Recibo implements Documento {
	private String emissor;
	private String favorecido;
	private Double valor;
	private GeradorDeArquivo geradorDeArquivo;

	public Recibo(String emissor, String favorecido, Double valor,
			GeradorDeArquivo geradorDeArquivo) {
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}

	@Override
	public void geraArquivo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Recibo: ");
		buffer.append("\n");

		buffer.append("Empresa: " + this.emissor);
		buffer.append("\n");

		buffer.append("Cliente: " + this.favorecido);
		buffer.append("\n");

		buffer.append("Valor: " + this.valor);
		buffer.append("\n");

		this.geradorDeArquivo.gera(buffer.toString());
	}

}
