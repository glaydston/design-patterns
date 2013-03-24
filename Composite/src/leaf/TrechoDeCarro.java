package leaf;

import component.Trecho;

public class TrechoDeCarro implements Trecho {
	private String direcao;
	private Double distancia;
	

	public TrechoDeCarro(String direcao, Double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}


	@Override
	public void imprime() {
		System.out.println("Vá de carro: ");
		System.out.println(this.direcao);
		System.out.println("À distância percorrida será de: " + this.distancia +" metros.");
	}

}
