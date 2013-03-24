package concreteProduct;

import abstractProduct.Emissor;

public class EmissorMasterCard implements Emissor {

	@Override
	public void send(String message) {
		System.out.println("Enviando a seguinte mensagem para a MasterCard");
		System.out.println(message);

	}

}
