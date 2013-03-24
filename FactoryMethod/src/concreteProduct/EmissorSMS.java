package concreteProduct;

import product.Emissor;

public class EmissorSMS implements Emissor {

	@Override
	public void send(String message) {
		System.out.println("Enviando por SMS a mensagem: ");
		System.out.println(message);

	}

}
