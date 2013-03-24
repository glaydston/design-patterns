package boundary;

import concreteFactory.MastercardComunicatorFactory;
import abstractFactory.ComunicadorFactory;
import abstractProduct.Emissor;
import abstractProduct.Receptor;

public class TesteMastercardComunicadorFactory {
	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new MastercardComunicatorFactory();
		
		String transacao = "Valor=1500; Senha=789";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.send(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.receive();
		System.out.println(mensagem);
	}

}
