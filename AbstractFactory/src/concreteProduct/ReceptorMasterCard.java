package concreteProduct;

import abstractProduct.Receptor;

public class ReceptorMasterCard implements Receptor {

	public String receive() {
		System.out.println("Recebendo mensagem da MasterCard.");
		String message = "Mensagem da MasterCard";
		return message;

	}

}
