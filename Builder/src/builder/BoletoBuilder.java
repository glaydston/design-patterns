package builder;
import java.util.Calendar;

import product.Boleto;


public interface BoletoBuilder {
	// Metodos a serem implementados
	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor(Double valor);
	void buildVencimento(Calendar vencimento);
	void buildNossoNumero(Integer numero);
	void buildCodigoDeBarras();
	void buildLogoTipo();
	
	Boleto getBoleto();
}
