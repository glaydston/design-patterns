package concreteFactory;

import creator.EmissorCreator;
import creator.ReceptorCreator;
import abstractFactory.ComunicadorFactory;
import abstractProduct.Emissor;
import abstractProduct.Receptor;

public class MastercardComunicatorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.MASTERCARD);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.MASTERCARD);
	}

}
