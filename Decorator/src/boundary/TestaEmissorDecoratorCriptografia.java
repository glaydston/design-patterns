package boundary;

import component.Emissor;
import concreteComponent.EmissorBasico;
import concreteDecorator.EmissorDecoratorComCompressao;
import concreteDecorator.EmissorDecoratorComCriptografia;

/**
 * @author glaydston
 *
 */
public class TestaEmissorDecoratorCriptografia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String mensagem = "Teste Mensagem";

		Emissor emissorCript = new EmissorDecoratorComCriptografia(
				new EmissorBasico());
		emissorCript.enviar(mensagem);

		Emissor emissorComp = new EmissorDecoratorComCompressao(
				new EmissorBasico());
		emissorComp.enviar(mensagem);

		Emissor emissorCriptComp = new EmissorDecoratorComCriptografia(
				new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissorCriptComp.enviar(mensagem);

	}

}
