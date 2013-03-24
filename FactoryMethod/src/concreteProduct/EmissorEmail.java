package concreteProduct;

import product.Emissor;

public class EmissorEmail implements Emissor {

	@Override
	public void send(String message) {
		System.out.println("Enviando por email a mensagem:");
		System.out.println(message);
		
	}

}
