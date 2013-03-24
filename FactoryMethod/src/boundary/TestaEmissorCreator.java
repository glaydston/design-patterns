package boundary;

import product.Emissor;
import creator.EmissorCreator;

public class TestaEmissorCreator {
	public static void main(String[] args) {
		EmissorCreator  creator = new EmissorCreator();
		
		Emissor emissor1 = creator.create(EmissorCreator.EMAIL);
		emissor1.send("K19 - Treinamentos");
		
		Emissor emissor2 = creator.create(EmissorCreator.SMS);
		emissor2.send("K19 - Treinamentos");
		
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.send("K19 - Treinamentos");
		

	}
}
