package creator;

import abstractProduct.Emissor;
import concreteProduct.EmissorMasterCard;
import concreteProduct.EmissorVisa;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1; 
	
	public Emissor create(int tipoDeEmissor){
		switch(tipoDeEmissor){
		case EmissorCreator.MASTERCARD: 
			return new EmissorMasterCard();
		case EmissorCreator.VISA:
			return new EmissorVisa();
			default:
				throw new IllegalArgumentException("Tipo de Emissor não suportado.");
		}
		
	}

}
