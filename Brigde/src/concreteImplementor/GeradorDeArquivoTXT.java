package concreteImplementor;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import implementor.GeradorDeArquivo;

public class GeradorDeArquivoTXT implements GeradorDeArquivo {

	@Override
	public void gera(String conteudo) {
		PrintStream saida;
		try {
			saida = new PrintStream("arquivo.txt");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			System.err.println(">> -- FileNotFoundException: " + e.getMessage());
		}

	}

}
