package lista6;



public class MainAnimal {

	public static void main(String[] args) {

	//	Produto esmalte = new Produto();
	//	ArrayList<Produto> algodaoo = new ArrayList<>();
	//	Produto algodao = new Produto();
	//  private String Nome;
	//  private String Raca;
	//	public Void Caminha;
	//	private Float Comprimento;
	//	private Integer Num_de_Patas;
	//	private String Cor;
	//	private String Ecossistma;
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("LULU");
		cachorro.setRaca("Fila brasileiro");
		cachorro.setComprimento(58f);
		cachorro.setNum_de_Patas(4);
		cachorro.setCor("Preto com brano");
		cachorro.setEcossistma("Quintal de casa");
		cachorro.Late();
		cachorro.Caminha();
		
		
		
		
		
		
		Gato gatinho = new Gato();
		
	    gatinho.setNome("Paty");
	    gatinho.setRaca("Norueguês da floresta");
	    gatinho.setComprimento(44f);
	    gatinho.setNum_de_Patas(4);
	    gatinho.setCor("Cinza");
	    gatinho.setEcossistma("Sofa");
	    gatinho.Mia();
	    gatinho.Caminha();
	    
	   System.out.println(cachorro.getNome());
	   System.out.println(cachorro.getRaca());
	   System.out.println(cachorro.getComprimento());
	   System.out.println(cachorro.getNum_de_Patas());
	   System.out.println(cachorro.getCor());
	   System.out.println(cachorro.getEcossistma());
	    
	   
	   System.out.println(gatinho.getNome());
	   System.out.println(gatinho.getRaca());
	   System.out.println(gatinho.getComprimento());
	   System.out.println(gatinho.getNum_de_Patas());
	   System.out.println(gatinho.getCor());
	   System.out.println(gatinho.getEcossistma());
	    
	
	    
	    
	    
	    
	    
	    
	    
	  
		
		
		
		
		
		
		
		
	
		
		
	}

}
