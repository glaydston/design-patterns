package boundary;

import adapter.ControleDePontoAdapter;
import product.Funcionario;
import target.ControleDePonto;

/**
 * @author glaydston
 * 
 */
public class TestaControleDePronto {
	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		
		Funcionario f = new Funcionario("Glaydston Veloso");
		
		controleDePonto.registraEntrada(f);
		Thread.sleep(3000);
		controleDePonto.registraSaida(f);
	}
}
