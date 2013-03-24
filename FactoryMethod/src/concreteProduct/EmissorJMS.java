package concreteProduct;

import product.Emissor;

public class EmissorJMS implements Emissor {

	@Override
	public void send(String message) {
		System.out.println("Enviando por JMS a mensagem: ");
		System.out.println(message);

	}

}
