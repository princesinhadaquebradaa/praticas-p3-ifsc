package ifsc;

import java.util.ArrayList;

public class ProdutoMain {
	


public static void main(String[] args) {
ArrayList<Produto> qualquercoisa = new ArrayList<>();
Produto esmalte = new Produto();

esmalte.setNome("Primavera");
esmalte.setCodBarra(4578624081l);
esmalte.setPreco(2.6);
esmalte.setFornecedor("Rique");
qualquercoisa.add(esmalte);

Produto algodao = new Produto();
algodao.setNome("Algodao");
algodao.setCodBarra(198632l);
algodao.setPreco(7.80);
algodao.setFornecedor("TA");
qualquercoisa.add(algodao);

Produto acetona = new Produto();
acetona.setNome("Acetona");
acetona.setCodBarra(641944l);
acetona.setPreco(9.0);
acetona.setFornecedor("Qualitatiu");
qualquercoisa.add(acetona);

for (Produto produto : qualquercoisa) {
	
	System.out.println(produto.getNome());
	System.out.println(produto.getCodBarra());
	System.out.println(produto.getPreco());
	System.out.println(produto.getFornecedor());
	System.out.println(" ");
	
	
	
}



}
}
