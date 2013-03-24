package product;

import java.util.Calendar;

public interface Boleto {
	//Metodos a serem implementados
	String getSacado();
	String getCedente();
	Double getValor();
	Calendar getVencimento();
	Integer getNossoNumero();
	String toString();
}
