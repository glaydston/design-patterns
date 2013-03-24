package boundary;

import concretePool.FuncionarioPool;
import pool.Pool;
import product.Funcionario;

/**
 * @author glaydston
 * 
 */
public class TestaFuncionarioPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		while (funcionario != null) {
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}

	}

}
