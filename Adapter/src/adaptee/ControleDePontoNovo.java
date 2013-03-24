package adaptee;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import product.Funcionario;

/**
 * @author glaydston
 * 
 */
public class ControleDePontoNovo {
	
	public void registra(Funcionario funcionario, Boolean bool) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy H:m:s");
		String date = dateFormat.format(calendar.getTime());

		if (bool)
			System.out.println("Entrada: " + funcionario.getNome() + " às "
					+ date);
		else
			System.out.println("Saída: " + funcionario.getNome() + " às "
					+ date);
	}

}
