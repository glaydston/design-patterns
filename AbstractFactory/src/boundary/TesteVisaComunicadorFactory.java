package boundary;

import concreteFactory.VisaComunicadorFactory;
import abstractFactory.ComunicadorFactory;
import abstractProduct.Emissor;
import abstractProduct.Receptor;

public class TesteVisaComunicadorFactory {
	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();

		String transacao = "Valor=560; Senha=123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.send(transacao);

		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.receive();
		System.out.println(mensagem);

	}

}
