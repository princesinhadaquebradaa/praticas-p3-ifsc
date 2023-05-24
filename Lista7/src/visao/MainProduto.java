package visao;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {

		Produto p = new Produto(); // Isso é instanciar
		p.setNome("Batata");
		p.setCodBarra(196358l);

		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p);

		for (Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}

		p.setNome("Alface");
		dao.alterar(p);

		for (Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}

		dao.excluir(p);

		for (Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}

	}

}
