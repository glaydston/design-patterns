package creator;

import abstractProduct.Receptor;

import concreteProduct.ReceptorMasterCard;
import concreteProduct.ReceptorVisa;

public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create(int tipoDeReceptor) {
		switch (tipoDeReceptor) {
		case ReceptorCreator.MASTERCARD:
			return new ReceptorMasterCard();
		case ReceptorCreator.VISA:
			return new ReceptorVisa();
		default:
			throw new IllegalArgumentException("Tipo de Emissor não suportado.");
		}

	}
}
