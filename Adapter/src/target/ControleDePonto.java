package target;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import product.Funcionario;

/**
 * @author glaydston
 * 
 */
public class ControleDePonto {
	public void registraEntrada(Funcionario f) {
		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String date = format.format(calendar.getTime());

		System.out.println("Entrada: " + f.getNome() + " às " + date);
	}

	public void registraSaida(Funcionario f) {
		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String date = format.format(calendar.getTime());

		System.out.println("Saída: " + f.getNome() + " às " + date);
	}
}
