package creator;

import concreteProduct.EmissorEmail;
import concreteProduct.EmissorJMS;
import concreteProduct.EmissorSMS;
import product.Emissor;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor) {
		switch (tipoDeEmissor) {
		case EmissorCreator.SMS:
			return new EmissorSMS();
		case EmissorCreator.JMS:
			return new EmissorJMS();
		case EmissorCreator.EMAIL:
			return new EmissorEmail();
		default:
			throw new IllegalArgumentException("Tipo de emissor não suportado.");
		}
	}

}
