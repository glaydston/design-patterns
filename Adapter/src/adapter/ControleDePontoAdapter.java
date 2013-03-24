package adapter;

import product.Funcionario;
import adaptee.ControleDePontoNovo;
import target.ControleDePonto;

public class ControleDePontoAdapter extends ControleDePonto {
	private ControleDePontoNovo  controleDePontoNovo;
	
	public ControleDePontoAdapter(){
		this.controleDePontoNovo = new ControleDePontoNovo();
	}
	
	public void registraEntrada(Funcionario funcionario){
		this.controleDePontoNovo.registra(funcionario, true);
	}
	
	public void registraSaida(Funcionario funcionario){
		this.controleDePontoNovo.registra(funcionario, false);
	}
}
