package concreteProduct;

import abstractProduct.Emissor;

public class EmissorVisa implements Emissor {

	@Override
	public void send(String message) {
		System.out.println("Enviando a seguinte mensagem para a Visa");
		System.out.println(message);

	}

}
