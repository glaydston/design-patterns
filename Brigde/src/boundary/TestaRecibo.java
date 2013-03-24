package boundary;

import concreteImplementor.GeradorDeArquivoTXT;
import implementor.GeradorDeArquivo;
import refinedAbstraction.Recibo;

/**
 * @author glaydston
 * 
 */
public class TestaRecibo {

	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("K19 - Treinamento", "Glaydston Veloso",
				1000.0, geradorDeArquivoTXT);
		recibo.geraArquivo();
	}

}
