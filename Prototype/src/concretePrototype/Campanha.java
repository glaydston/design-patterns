package concretePrototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import prototype.Prototype;

public class Campanha implements Prototype<Campanha> {
	private String nome;
	private Calendar vencimento;
	private Set<String> palavraChave;

	public Campanha(String nome, Calendar vencimento, Set<String> palavraChave) {
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavraChave = palavraChave;
	}

	public Campanha clone() {
		String nome = "Cópia da Campanha: " + this.nome;
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set<String> palavraChave = new HashSet<String>(this.palavraChave);

		Campanha campanha = new Campanha(nome, vencimento, palavraChave);

		return campanha;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public Set<String> getPalavraChave() {
		return palavraChave;
	}
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("----------------------");
		buffer.append("\n");
		buffer.append("Nome da Campanha:");
		buffer.append(this.nome);
		buffer.append("\n");
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String date = format.format(this.vencimento.getTime());
		buffer.append("Vencimento: "+date);
		buffer.append("\n");
		
		buffer.append("Palavra-Chave:  \n");
		for(String palavraChave : this.palavraChave){
			buffer.append(" - " + palavraChave);
			buffer.append("\n");
		}

		buffer.append("----------------------");
		buffer.append("\n");
		
		return buffer.toString();
	}

}
