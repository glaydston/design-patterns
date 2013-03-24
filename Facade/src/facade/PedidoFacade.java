package facade;

import component.Estoque;
import component.Financeiro;
import component.Pedido;
import component.PosVenda;

public class PedidoFacade {
	private Estoque 	estoque;
	private Financeiro	financeiro;
	private PosVenda	posVenda;
	
	public PedidoFacade(Estoque estoque, Financeiro financeiro,
			PosVenda posVenda) {
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}
	
	public void registraPedido(Pedido pedido){
		this.estoque.enviaProduto(pedido.getProduto(), pedido.getEnderecoDeEntrega());
		this.financeiro.fatura(pedido.getCliente(), pedido.getProduto());
		
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public Financeiro getFinanceiro() {
		return financeiro;
	}

	public PosVenda getPosVenda() {
		return posVenda;
	}
	
	
	
	

}
