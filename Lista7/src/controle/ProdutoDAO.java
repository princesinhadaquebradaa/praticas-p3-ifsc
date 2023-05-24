package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ProdutoDAO {
	
	private ArrayList <Produto> lista;
	
	public ProdutoDAO() {
		lista = new ArrayList<>();
		
	}
	
	public boolean inserir(Produto p) {
		lista.add(p);
		return true;
	}
	
	public boolean alterar (Produto p) {
		for (Produto produto : lista) { // for each
			if(produto.getCodBarra() == p.getCodBarra()) {
			produto.setCodBarra(p.getCodBarra());
			produto.setNome(p.getNome());
			}
		}
		return false;
	}
	
	public boolean excluir(Produto produtoExcluir) {
		
		for (Produto produto : lista) {
			if(produto.getCodBarra() == produtoExcluir.getCodBarra()){
				lista.remove(produto);
				return true;
			}
			
		}
		return false;
	}
	
	public ArrayList<Produto>listar(){
		return this.lista;
	}
	
	
	
	

}
