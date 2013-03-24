package boundary;

import implementor.GeradorDeArquivo;
import refinedAbstraction.Recibo;
import concreteImplementor.GeradorDeArquivoHTML;

public class TestaReceboHTML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoHTML();
		Recibo recibo = new Recibo("K19 - Treinamento", "Glaydston Veloso",
				1000.0, geradorDeArquivoTXT);
		recibo.geraArquivo();

	}

}
