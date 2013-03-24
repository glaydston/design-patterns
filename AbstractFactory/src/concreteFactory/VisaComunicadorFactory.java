package concreteFactory;

import creator.EmissorCreator;
import creator.ReceptorCreator;
import abstractFactory.ComunicadorFactory;
import abstractProduct.Emissor;
import abstractProduct.Receptor;

public class VisaComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}
