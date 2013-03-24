package boundary;

import concreteProduct.EmissorEmail;
import concreteProduct.EmissorJMS;
import concreteProduct.EmissorSMS;
import product.Emissor;

public class TestaEmissor {
	public static void main(String[] args) {
		Emissor emissorSMS = new EmissorSMS();
		emissorSMS.send("K19 - Treinamentos");

		Emissor emissorEmail = new EmissorEmail();
		emissorEmail.send("K19 - Treinamentos");

		Emissor emissorJMS = new EmissorJMS();
		emissorJMS.send("K19 - Treinamentos");
	}

}
