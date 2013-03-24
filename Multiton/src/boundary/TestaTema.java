package boundary;

import multiton.Tema;

public class TestaTema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tema temaFire = Tema.getInstance(Tema.FIRE);
		
		System.out.println("Tema " + temaFire.getNome());
		System.out.println("Cor da Fonte: " + temaFire.getCorDaFonte());
		System.out.println("Cor do Fundo: " + temaFire.getCorDoFundo());		

		Tema temaSky = Tema.getInstance(Tema.SKY);
		
		System.out.println("Tema " + temaSky.getNome());
		System.out.println("Cor da Fonte: " + temaSky.getCorDaFonte());
		System.out.println("Cor do Fundo: " + temaSky.getCorDoFundo());
		
		System.out.println("------------------");
		System.out.println("Comparando as referências...");
		System.out.println(temaFire == temaSky);

	}

}
