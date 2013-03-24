package concreteProduct;

import abstractProduct.Receptor;

public class ReceptorVisa implements Receptor {

	@Override
	public String receive() {
		System.out.println("Recebendo mensagem da Visa.");
		String message = "Mensagem da Visa";
		return message;

	}

}
