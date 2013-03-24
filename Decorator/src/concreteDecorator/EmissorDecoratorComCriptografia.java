package concreteDecorator;

import component.Emissor;

import decorator.EmissorDecorator;

public class EmissorDecoratorComCriptografia extends EmissorDecorator {

	public EmissorDecoratorComCriptografia(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem criptografada: ");
		this.getEmissor().enviar(criptografada(mensagem));

	}

	private String criptografada(String mensagem) {
		String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
		return mensagemCriptografada;
	}

}
