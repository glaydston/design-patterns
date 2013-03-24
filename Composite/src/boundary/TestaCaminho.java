package boundary;

import leaf.TrechoAndando;
import component.Trecho;
import composite.Caminho;

/**
 * @author glaydston
 *
 */
public class TestaCaminho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trecho trecho1  = new TrechoAndando(
				"Vá até o cruzamento da Av. Rebouças com a Av. Brigadeiro Faria Lima",
				500.0);
		Trecho trecho2  = new TrechoAndando(
				"Vá até o cruzamento da Av. Brigadeiro Faria Lima com Av. Cidade Jardim",
				1500.0);
		Trecho trecho3  = new TrechoAndando(
				"Vire a direita na Marginal Pinheiros", 500.0);
		Caminho caminho1 = new Caminho();
		caminho1.adiciona(trecho1);
		caminho1.adiciona(trecho2);
		
		System.out.println("Caminho 1 : ");
		caminho1.imprime();
		
		Caminho caminho2 = new Caminho();
		caminho2.adiciona(caminho1);
		caminho2.adiciona(trecho3);
		
		System.out.println("Caminho 2 : ");
		caminho2.imprime();


	}

}
