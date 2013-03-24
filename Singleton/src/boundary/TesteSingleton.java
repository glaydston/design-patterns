package boundary;

import singleton.Configuracao;

public class TesteSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuracao configuracao = Configuracao.getInstance();
		System.out.println(configuracao.getPropriedades("time-zone"));
		System.out.println(configuracao.getPropriedades("currency-code"));

	}

}
