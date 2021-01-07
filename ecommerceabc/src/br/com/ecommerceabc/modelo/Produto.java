package br.com.ecommerceabc.modelo;

public class Produto {

	
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public String getAll() {
		return "ID...: " + id + "\n" + "Descrição...:" + descricao + "\n" + "Valor da Venda...:" + valorVenda + "\n" + "Valor de compra...:" + valorCompra + "\n" + "Quantidade...:" + qtde;
	}
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id=id;
		this.descricao=descricao;
		this.valorVenda=valorVenda;
		this.valorCompra=valorCompra;
		this.qtde=qtde;	
	}
	public float getPromocao() {
		return valorVenda*(float)0.9;
	}
	public float getTotalVendas() {
		return qtde*valorVenda;
	}
	public float getTotalCompras() {
		return qtde*valorCompra;
	}
	public void atualizarValores(float porcentagem) {
		valorCompra=valorCompra*(1-(porcentagem/100));
		valorVenda=valorVenda*(1-(porcentagem/100));
	}
	public String verificarEstoque() {
		if (qtde>20) {
			return "ESTOQUE ALTO";
		}
		else if (qtde<5) {
			return "ESTOQUE BAIXO";
		}
		else 
			return "ESTOQUE NORMAL";
		}
	public void getPromocao (float porcentagem) {
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
